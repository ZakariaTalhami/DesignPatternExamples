package ZakariaTalhami.github.abstactFactory.requests.rpc;

import ZakariaTalhami.github.abstactFactory.requests.CreateRequest;

public class RpcCreateRequest extends CreateRequest {
    public RpcCreateRequest(String url, String payload) {
        super(url, payload);
    }

    @Override
    public String sendRequest() {
        return "RPC Create Request Sent";
    }
}
