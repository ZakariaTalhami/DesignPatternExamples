package ZakariaTalhami.github.strategy.interactions;

public class DefensiveEnemyInteractionStrategy implements IEnemyInteraction {
    @Override
    public void onAttacked() {
        System.out.println("Attacked: Engage the enemy");
    }

    @Override
    public void onEnemySpotted() {
        System.out.println("Enemy Spotted: On guard and watch target closely, attack if gets close.");
    }
}
