public class ActionHandler {
    public Response handleAction(String url, Request req) {
        if ("/courses/list".equals(url)) {
            return listCourses(req);
        } else if ("/courses/create".equals(url)) {
            return createCourse(req);
        } else if ("/assignments/list".equals(url)) {
            return listAssignments(req);
        } else if ("/grades/publish".equals(url)) {
            return publishGrades(req);
        }
        // ... dozens more
        return Response.notFound();
    }

    private Response listCourses(Request req) {
        // Implementation for listing courses
        return new Response(200, "Course list");
    }

    public static void main(String[] args) {
        ActionHandler handler = new ActionHandler();
        Request req = new Request(); // Assume this is properly initialized
        Response res = handler.handleAction("/courses/list", req);
        System.out.println("Response status: " + res.getStatusCode());
    }
}

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

    // Getters and setters...
    public int getStatusCode() {
        return statusCode;
    } 
}