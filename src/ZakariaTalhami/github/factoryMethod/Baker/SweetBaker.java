package ZakariaTalhami.github.factoryMethod.Baker;

import ZakariaTalhami.github.factoryMethod.Cookie.Cookie;
import ZakariaTalhami.github.factoryMethod.Cookie.TastyCookie;

import java.util.List;

public class SweetBaker extends Baker {
    @Override
    public Cookie bakeCookies() {
        return new TastyCookie(
                List.of("Sugar", "Butter", "Sugar", "Butter"),
                300l
        );
    }
}
