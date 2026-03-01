package arnabg.me;

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

    private Response createCourse(Request req) {
        // Implementation for creating a course
        return new Response(201, "Course created");
    }

    private Response listAssignments(Request req) {
        // Implementation for listing assignments
        return new Response(200, "Assignment list");
    }

    private Response publishGrades(Request req) {
        // Implementation for publishing grades
        return new Response(200, "Grades published");
    }
}
