package ZakariaTalhami.github.factoryMethod.Cookie;

import java.util.List;

public abstract class Cookie {
    List<String> ingredients;
    Long calories;

    public Cookie(List<String> ingredients, Long calories) {
        this.ingredients = ingredients;
        this.calories = calories;
    }

    // Setters and Getters here
}
