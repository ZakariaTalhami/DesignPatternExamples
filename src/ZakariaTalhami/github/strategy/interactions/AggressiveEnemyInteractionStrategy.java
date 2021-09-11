package ZakariaTalhami.github.strategy.interactions;

public class AggressiveEnemyInteractionStrategy implements IEnemyInteraction {
    @Override
    public void onAttacked() {
        System.out.println("Attacked: Engage the enemy");
    }

    @Override
    public void onEnemySpotted() {
        System.out.println("Enemy Spotted: Follow and attack the target");
    }
}
