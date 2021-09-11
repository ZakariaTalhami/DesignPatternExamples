package ZakariaTalhami.github.builder;

import ZakariaTalhami.github.builder.village.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VillageBuilder medievalVillageBuilder = new MedievalVillageBuilder();
        VillageBuilder renaissanceVillageBuilder = new RenaissanceVillageBuilder();
        VillageBuilder modernVillageBuilder = new ModernVillageBuilder();
        Director director = new Director();
        List<Village> villageList = new ArrayList<>();

        director.setBuilder(medievalVillageBuilder);
        director.createMountainVillage();
        villageList.add(medievalVillageBuilder.getVillage());

        director.setBuilder(renaissanceVillageBuilder);
        director.createRiverVillage();
        villageList.add(renaissanceVillageBuilder.getVillage());

        director.setBuilder(modernVillageBuilder);
        director.createCoastalVillage();
        villageList.add(modernVillageBuilder.getVillage());

        for (Village village: villageList) {
            System.out.println(village);
        }
    }
}
