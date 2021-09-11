package ZakariaTalhami.github.strategy.interactions;

public class PassiveEnemyInteractionStrategy implements IEnemyInteraction {
    @Override
    public void onAttacked() {
        System.out.println("Attacked: Do not react.");
    }

    @Override
    public void onEnemySpotted() {
        System.out.println("Enemy Spotted: Do not react.");
    }
}
