package ZakariaTalhami.github.factoryMethod;

import java.util.ArrayList;
import java.util.List;

abstract class Cookie {
    List<String> ingredients;
    Long calories;

    public Cookie(List<String> ingredients, Long calories) {
        this.ingredients = ingredients;
        this.calories = calories;
    }

    // Setters and Getters here
}

class HealthyCookie extends Cookie {
    public HealthyCookie(List<String> ingredients, Long calories) {
        super(ingredients, calories);
    }
}

class TastyCookie extends Cookie {
    public TastyCookie(List<String> ingredients, Long calories) {
        super(ingredients, calories);
    }
}

abstract class Baker {
    abstract Cookie bakeCookies();
}

class SweetBaker extends Baker {
    @Override
    Cookie bakeCookies() {
        return new TastyCookie(
                List.of("Sugar", "Butter", "Sugar", "Butter"),
                300l
        );
    }
}

class DietitianBaker extends Baker {
    @Override
    Cookie bakeCookies() {
        return new HealthyCookie(
                List.of("Almond Floor", "oatmeal"),
                20l
        );
    }
}

class Bakery {
    Baker baker;
    List<Cookie> cookies = new ArrayList<>();

    public Bakery(Baker baker) {
        this.baker = baker;
    }

    public void bake(int quantity) {
        for (int i = 0; i < quantity; i++) {
            // Doesn't know what kind of cookies are being made
            // The baker class encapsulation the instantiation logic.
            cookies.add(baker.bakeCookies());
        }
    }

    public List<Cookie> getCookies() {
        return cookies;
    }
}

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
