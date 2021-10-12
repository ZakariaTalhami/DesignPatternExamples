package ZakariaTalhami.github.state.atm.states;

public interface IATMState {
    boolean insertCard();
    boolean numPadInput();
    boolean ejectCard();
}
