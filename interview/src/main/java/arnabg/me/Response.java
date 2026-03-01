package arnabg.me;

public class Response {
    public static Response notFound() {
        return new Response(404, "Not Found");
    }

    private int statusCode;
    private String body;

    public Response(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }
}
