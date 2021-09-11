package ZakariaTalhami.github.builder.village;

import ZakariaTalhami.github.builder.village.bridge.Bridge;
import ZakariaTalhami.github.builder.village.dock.Dock;
import ZakariaTalhami.github.builder.village.farm.Farm;
import ZakariaTalhami.github.builder.village.market.Market;
import ZakariaTalhami.github.builder.village.mine.Mine;
import ZakariaTalhami.github.builder.village.villagewall.VillageWall;

import java.util.ArrayList;
import java.util.List;

public class Village {
    List<Bridge> bridges = new ArrayList<>();
    List<Dock> docks = new ArrayList<>();
    List<Farm> farms = new ArrayList<>();
    List<Market> markets = new ArrayList<>();
    List<Mine> mines = new ArrayList<>();
    VillageWall villageWall;

    public void addBridge(Bridge bridge) {
        this.bridges.add(bridge);
    }

    public void addDock(Dock dock) {
        this.docks.add(dock);
    }

    public void addFarm(Farm farm) {
        this.farms.add(farm);
    }

    public void addMarket(Market market) {
        this.markets.add(market);
    }

    public void addMine(Mine mine) {
        this.mines.add(mine);
    }

    public void setVillageWall(VillageWall villageWall) {
        this.villageWall = villageWall;
    }

    public List<Bridge> getBridges() {
        return bridges;
    }

    public List<Dock> getDocks() {
        return docks;
    }

    public List<Farm> getFarms() {
        return farms;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public List<Mine> getMines() {
        return mines;
    }

    public VillageWall getVillageWall() {
        return villageWall;
    }

    @Override
    public String toString() {
        return "Village{" +
                "bridges=" + bridges +
                ", docks=" + docks +
                ", farms=" + farms +
                ", markets=" + markets +
                ", mines=" + mines +
                ", villageWall=" + villageWall +
                '}';
    }
}
