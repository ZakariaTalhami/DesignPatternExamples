package ZakariaTalhami.github.abstactFactory.requests;

public abstract class DeleteRequest {
    private String url;
    private String entityUUID;

    public DeleteRequest(String url, String entityUUID) {
        this.url = url;
        this.entityUUID = entityUUID;
    }

    public abstract String sendRequest();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEntityUUID() {
        return entityUUID;
    }

    public void setEntityUUID(String entityUUID) {
        this.entityUUID = entityUUID;
    }
}
