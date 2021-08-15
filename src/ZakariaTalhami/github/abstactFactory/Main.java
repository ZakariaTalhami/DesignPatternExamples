package ZakariaTalhami.github.abstactFactory;

import ZakariaTalhami.github.abstactFactory.requests.CreateRequest;
import ZakariaTalhami.github.abstactFactory.requests.DeleteRequest;
import ZakariaTalhami.github.abstactFactory.requests.requestfactory.HttpRequestFactory;
import ZakariaTalhami.github.abstactFactory.requests.requestfactory.RequestFactory;
import ZakariaTalhami.github.abstactFactory.requests.requestfactory.RpcRequestFactory;

class TaskManager {
    final String BASE_URL = "URL";
    private RequestFactory requestFactory;

    public TaskManager(RequestFactory requestFactory) {
        this.requestFactory = requestFactory;
    }

    public void createTask(String taskName) {
        CreateRequest createRequest = requestFactory.createCreateRequest(this.BASE_URL, taskName);
        String response = createRequest.sendRequest();
        System.out.println(response);
    }

    public void deleteTask(String taskUUID) {
        DeleteRequest deleteRequest = requestFactory.createDeleteRequest(this.BASE_URL, taskUUID);
        String response = deleteRequest.sendRequest();
        System.out.println(response);

    }

    public void restartTask(String taskName, String taskUUID) {
        this.deleteTask(taskUUID);
        this.createTask(taskName);
    }
}

public class Main {
    public static void main(String[] args) {
        RequestFactory httpRequestFactory = new HttpRequestFactory();
        RequestFactory rpcRequestFactory = new RpcRequestFactory();

        // RequestFactory would be injected into the manager.
        // The Manager doesn't need to know what are the request types
        TaskManager httpTaskManager = new TaskManager(httpRequestFactory);
        TaskManager rpcTaskManager = new TaskManager(rpcRequestFactory);

        httpTaskManager.restartTask("Task1", "UUID1");
        rpcTaskManager.restartTask("Task2", "UUID2");
    }
}
