package ZakariaTalhami.github.factoryMethod;

import ZakariaTalhami.github.factoryMethod.Baker.Baker;
import ZakariaTalhami.github.factoryMethod.Cookie.Cookie;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
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
