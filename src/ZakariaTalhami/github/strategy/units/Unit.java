package ZakariaTalhami.github.strategy.units;

import ZakariaTalhami.github.strategy.interactions.IEnemyInteraction;

public class Unit {
    private IEnemyInteraction enemyInteractionStrategy;

    public Unit() {
    }

    public Unit(IEnemyInteraction enemyInteractionStrategy) {
        this.enemyInteractionStrategy = enemyInteractionStrategy;
    }

    public void setEnemyInteractionStrategy(IEnemyInteraction enemyInteractionStrategy) {
        this.enemyInteractionStrategy = enemyInteractionStrategy;
    }

    public void attacked() {
        if(this.enemyInteractionStrategy != null) {
            enemyInteractionStrategy.onAttacked();
        } else {
            System.out.println("Enemy Interaction Strategy is not specified");
        }
    }

    public void enemySpotted() {
        if(this.enemyInteractionStrategy != null) {
            enemyInteractionStrategy.onEnemySpotted();
        } else {
            System.out.println("Enemy Interaction Strategy is not specified");
        }
    }
}
