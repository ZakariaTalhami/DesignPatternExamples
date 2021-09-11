package ZakariaTalhami.github.builder.village;

import ZakariaTalhami.github.builder.village.bridge.RenaissanceBridge;
import ZakariaTalhami.github.builder.village.dock.RenaissanceDock;
import ZakariaTalhami.github.builder.village.farm.RenaissanceFarm;
import ZakariaTalhami.github.builder.village.market.RenaissanceMarket;
import ZakariaTalhami.github.builder.village.mine.RenaissanceMine;
import ZakariaTalhami.github.builder.village.villagewall.RenaissanceVillageWall;

public class RenaissanceVillageBuilder implements VillageBuilder {

    private Village village;

    public RenaissanceVillageBuilder() {
        this.village = new Village();
    }

    @Override
    public void buildBridge() {
        village.addBridge(new RenaissanceBridge());
    }

    @Override
    public void buildFarm() {
        village.addFarm(new RenaissanceFarm());
    }

    @Override
    public void buildVillageWall() {
        village.setVillageWall(new RenaissanceVillageWall());
    }

    @Override
    public void buildMine() {
        village.addMine(new RenaissanceMine());
    }

    @Override
    public void buildDock() {
        village.addDock(new RenaissanceDock());
    }

    @Override
    public void buildMarket() {
        village.addMarket(new RenaissanceMarket());
    }

    @Override
    public Village getVillage() {
        return this.village;
    }

}
