package ZakariaTalhami.github.factoryMethod;

import ZakariaTalhami.github.factoryMethod.Baker.DietitianBaker;
import ZakariaTalhami.github.factoryMethod.Baker.SweetBaker;

public class Main {

    public static void main(String[] args) {
        Bakery redVelvetBakery = new Bakery(new SweetBaker());
        Bakery pattyCakes = new Bakery(new DietitianBaker());

        redVelvetBakery.bake(20);
        pattyCakes.bake(200);

        System.out.println(redVelvetBakery.getCookies());
        System.out.println(pattyCakes.getCookies());
    }
}
