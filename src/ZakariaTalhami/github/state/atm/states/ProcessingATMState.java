package ZakariaTalhami.github.state.atm.states;

public class ProcessingATMState implements IATMState {
    @Override
    public boolean insertCard() {
        System.out.println("ATM already contains a card. Please Eject first.");
        return false;
    }

    @Override
    public boolean numPadInput() {
        System.out.println("Input has been handled. Processing....");
        return true;
    }

    @Override
    public boolean ejectCard() {
        System.out.println("Card has been ejected.");
        return true;
    }
}
