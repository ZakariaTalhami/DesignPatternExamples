package ZakariaTalhami.github.abstactFactory.requests.http;

import ZakariaTalhami.github.abstactFactory.requests.DeleteRequest;

public class HttpDeleteRequest extends DeleteRequest {

    public HttpDeleteRequest(String url, String entityUUID) {
        super(url, entityUUID);
    }

    @Override
    public String sendRequest() {
        return "Http Delete Request Sent";
    }
}
