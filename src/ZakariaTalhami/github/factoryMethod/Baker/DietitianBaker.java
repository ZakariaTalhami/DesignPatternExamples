package ZakariaTalhami.github.factoryMethod.Baker;

import ZakariaTalhami.github.factoryMethod.Cookie.Cookie;
import ZakariaTalhami.github.factoryMethod.Cookie.HealthyCookie;

import java.util.List;

public class DietitianBaker extends Baker {
    @Override
    public Cookie bakeCookies() {
        return new HealthyCookie(
                List.of("Almond Floor", "oatmeal"),
                20l
        );
    }
}
