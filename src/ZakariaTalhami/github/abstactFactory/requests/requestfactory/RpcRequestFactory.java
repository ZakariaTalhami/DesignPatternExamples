package ZakariaTalhami.github.abstactFactory.requests.requestfactory;

import ZakariaTalhami.github.abstactFactory.requests.CreateRequest;
import ZakariaTalhami.github.abstactFactory.requests.DeleteRequest;
import ZakariaTalhami.github.abstactFactory.requests.rpc.RpcCreateRequest;
import ZakariaTalhami.github.abstactFactory.requests.rpc.RpcDeleteRequest;

public class RpcRequestFactory extends RequestFactory {
    @Override
    public CreateRequest createCreateRequest(String url, String payload) {
        return new RpcCreateRequest(url, payload);
    }

    @Override
    public DeleteRequest createDeleteRequest(String url, String entityUUID) {
        return new RpcDeleteRequest(url, entityUUID);
    }
}
