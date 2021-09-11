package ZakariaTalhami.github.builder.village;

import ZakariaTalhami.github.builder.village.bridge.ModernBridge;
import ZakariaTalhami.github.builder.village.dock.ModernDock;
import ZakariaTalhami.github.builder.village.farm.ModernFarm;
import ZakariaTalhami.github.builder.village.market.ModernMarket;
import ZakariaTalhami.github.builder.village.mine.ModernMine;
import ZakariaTalhami.github.builder.village.villagewall.ModernVillageWall;

public class ModernVillageBuilder implements VillageBuilder{

    private Village village;

    public ModernVillageBuilder() {
        this.village = new Village();
    }

    @Override
    public void buildBridge() {
        village.addBridge(new ModernBridge());
    }

    @Override
    public void buildFarm() {
        village.addFarm(new ModernFarm());
    }

    @Override
    public void buildVillageWall() {
        village.setVillageWall(new ModernVillageWall());
    }

    @Override
    public void buildMine() {
        village.addMine(new ModernMine());
    }

    @Override
    public void buildDock() {
        village.addDock(new ModernDock());
    }

    @Override
    public void buildMarket() {
        village.addMarket(new ModernMarket());
    }

    @Override
    public Village getVillage() {
        return this.village;
    }
}
