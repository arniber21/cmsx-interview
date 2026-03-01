import java.util.Map;

public class ConfigService {
    public static void main(String[] args) {
        ConfigService service = new ConfigService();
        Map<String, Object> config = Map.of("mode", "STRICT");
        String mode = service.resolveMode(config);
        System.out.println("Resolved mode: " + mode);
    }

    
    public String resolveMode(Map<String, Object> config) {
        if (config != null) {
            if (config.containsKey("mode")) {
                Object raw = config.get("mode");
                if (raw != null) {
                    if (raw instanceof String) {
                        String mode = ((String) raw).trim();
                        if (!mode.isEmpty()) {
                            if (mode.equals("STRICT") || mode.equals("LENIENT")) {
                                return mode;
                            } else {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return null;
    }
}