package ZakariaTalhami.github.abstactFactory.requests.requestfactory;

import ZakariaTalhami.github.abstactFactory.requests.CreateRequest;
import ZakariaTalhami.github.abstactFactory.requests.DeleteRequest;

public abstract class RequestFactory {

    public abstract CreateRequest createCreateRequest(String url, String payload);

    public abstract DeleteRequest createDeleteRequest(String url, String entityUUID);

}
