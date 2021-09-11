package ZakariaTalhami.github.builder.village;

public class Director {
    VillageBuilder builder;

    public Director() {}

    public Director(VillageBuilder builder) {
        this.builder = builder;
    }

    public void createMountainVillage(){
        builder.buildMine();
        builder.buildMine();
        builder.buildMarket();
        builder.buildFarm();
        builder.buildFarm();
        builder.buildVillageWall();
    }

    public void createCoastalVillage(){
        builder.buildDock();
        builder.buildDock();
        builder.buildFarm();
        builder.buildFarm();
        builder.buildFarm();
        builder.buildMarket();
        builder.buildVillageWall();
    }

    public void createRiverVillage(){
        builder.buildVillageWall();
        builder.buildBridge();
        builder.buildBridge();
        builder.buildFarm();
        builder.buildFarm();
        builder.buildFarm();
        builder.buildFarm();
        builder.buildMarket();
        builder.buildDock();
    }

    public VillageBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(VillageBuilder builder) {
        this.builder = builder;
    }
}
