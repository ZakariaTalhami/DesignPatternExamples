package ZakariaTalhami.github.abstactFactory.requests.rpc;

import ZakariaTalhami.github.abstactFactory.requests.DeleteRequest;

public class RpcDeleteRequest extends DeleteRequest {
    public RpcDeleteRequest(String url, String entityUUID) {
        super(url, entityUUID);
    }

    @Override
    public String sendRequest() {
        return "RPC Delete Request Sent";
    }
}
