package ZakariaTalhami.github.state.atm;

import ZakariaTalhami.github.state.atm.states.IATMState;
import ZakariaTalhami.github.state.atm.states.IdleATMState;
import ZakariaTalhami.github.state.atm.states.ProcessingATMState;

public class ATM {
    boolean isCardInserted;
    IATMState currentState;
    IATMState idleState;
    IATMState processingState;

    public ATM() {
        this(new IdleATMState(), new ProcessingATMState());
    }

    public ATM(IATMState idleState, IATMState processingState) {
        this.idleState = idleState;
        this.processingState = processingState;
        this.currentState = this.idleState;
    }

    public void insertCard() {
        if(this.currentState.insertCard()) {
            this.isCardInserted = true;
        }
        this.updateState();
    }

    public void numPadInput() {
        this.currentState.numPadInput();
    }

    public void ejectCard() {
        if(this.currentState.ejectCard()) {
            this.isCardInserted = false;
        }
        this.updateState();
    }

    private void updateState() {
        this.currentState = (this.isCardInserted) ? this.processingState : this.idleState;
    }
}
