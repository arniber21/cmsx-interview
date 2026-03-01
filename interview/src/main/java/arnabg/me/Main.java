package arnabg.me;

public class Main {
    public static void main(String[] args) {
        ActionHandler handler = new ActionHandler();
        Request req = new Request();
        Response res = handler.handleAction("/courses/list", req);
        System.out.println("Response status: " + res.getStatusCode());
    }
}
