package ZakariaTalhami.github.abstactFactory.requests;

public abstract class CreateRequest {
    private String url;
    private String payload;

    public CreateRequest(String url, String payload) {
        this.url = url;
        this.payload = payload;
    }

    public abstract String sendRequest();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
