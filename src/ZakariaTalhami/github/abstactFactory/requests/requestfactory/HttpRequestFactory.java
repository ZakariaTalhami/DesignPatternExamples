package ZakariaTalhami.github.abstactFactory.requests.requestfactory;

import ZakariaTalhami.github.abstactFactory.requests.CreateRequest;
import ZakariaTalhami.github.abstactFactory.requests.DeleteRequest;
import ZakariaTalhami.github.abstactFactory.requests.http.HttpCreateRequest;
import ZakariaTalhami.github.abstactFactory.requests.http.HttpDeleteRequest;

public class HttpRequestFactory extends RequestFactory {
    @Override
    public CreateRequest createCreateRequest(String url, String payload) {
        return new HttpCreateRequest(url, payload);
    }

    @Override
    public DeleteRequest createDeleteRequest(String url, String entityUUID) {
        return new HttpDeleteRequest(url, entityUUID);
    }
}
