package ZakariaTalhami.github.builder.village;

public interface VillageBuilder {
    void buildBridge();
    void buildFarm();
    void buildVillageWall();
    void buildMine();
    void buildDock();
    void buildMarket();

    Village getVillage();
}
