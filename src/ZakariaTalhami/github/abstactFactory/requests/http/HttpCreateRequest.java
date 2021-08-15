package ZakariaTalhami.github.abstactFactory.requests.http;

import ZakariaTalhami.github.abstactFactory.requests.CreateRequest;

public class HttpCreateRequest extends CreateRequest {

    public HttpCreateRequest(String url, String payload) {
        super(url, payload);
    }

    @Override
    public String sendRequest() {
        return "Http Create Request Sent";
    }
}
