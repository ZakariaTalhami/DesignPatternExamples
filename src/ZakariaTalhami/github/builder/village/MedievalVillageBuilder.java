package ZakariaTalhami.github.builder.village;

import ZakariaTalhami.github.builder.village.bridge.MedievalBridge;
import ZakariaTalhami.github.builder.village.dock.MedievalDock;
import ZakariaTalhami.github.builder.village.farm.MedievalFarm;
import ZakariaTalhami.github.builder.village.market.MedievalMarket;
import ZakariaTalhami.github.builder.village.mine.MedievalMine;
import ZakariaTalhami.github.builder.village.villagewall.MedievalVillageWall;

public class MedievalVillageBuilder implements VillageBuilder {
    private Village village;

    public MedievalVillageBuilder() {
        this.village = new Village();
    }

    @Override
    public void buildBridge() {
        village.addBridge(new MedievalBridge());
    }

    @Override
    public void buildFarm() {
        village.addFarm(new MedievalFarm());
    }

    @Override
    public void buildVillageWall() {
        village.setVillageWall(new MedievalVillageWall());
    }

    @Override
    public void buildMine() {
        village.addMine(new MedievalMine());
    }

    @Override
    public void buildDock() {
        village.addDock(new MedievalDock());
    }

    @Override
    public void buildMarket() {
        village.addMarket(new MedievalMarket());
    }

    @Override
    public Village getVillage() {
        return this.village;
    }
}
