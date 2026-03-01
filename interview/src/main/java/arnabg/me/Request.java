package arnabg.me;

import java.util.Map;
import java.util.HashMap;

public class Request {
    private String method;
    private String body;
    private Map<String, String> headers;

    public Request() {
        this.method = "GET";
        this.body = "";
        this.headers = new HashMap<>();
    }

    public Request(String method, String body) {
        this.method = method;
        this.body = body;
        this.headers = new HashMap<>();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    public String getHeader(String key) {
        return this.headers.get(key);
    }
}
