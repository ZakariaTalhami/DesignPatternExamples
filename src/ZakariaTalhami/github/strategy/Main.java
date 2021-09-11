package ZakariaTalhami.github.strategy;

import ZakariaTalhami.github.strategy.interactions.AggressiveEnemyInteractionStrategy;
import ZakariaTalhami.github.strategy.interactions.DefensiveEnemyInteractionStrategy;
import ZakariaTalhami.github.strategy.interactions.IEnemyInteraction;
import ZakariaTalhami.github.strategy.interactions.PassiveEnemyInteractionStrategy;
import ZakariaTalhami.github.strategy.units.Unit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit();
        List<IEnemyInteraction> interactionList = List.of(
                new AggressiveEnemyInteractionStrategy(),
                new DefensiveEnemyInteractionStrategy(),
                new PassiveEnemyInteractionStrategy()
        );

        for (IEnemyInteraction interaction: interactionList) {
            System.out.println();
            System.out.println(interaction.getClass().getSimpleName());
            unit.setEnemyInteractionStrategy(interaction);

            unit.enemySpotted();
            unit.attacked();
        }
    }
}
