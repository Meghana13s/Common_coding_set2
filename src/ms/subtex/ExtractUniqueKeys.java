//package ms.subtex;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//import java.util.Iterator;
//
//public class ExtractUniqueKeys {
//    public static void main(String[] args) throws IOException {
//        // JSON string (example)
//        String jsonString = "{"
//                + "\"name\":\"John\","
//                + "\"age\":30,"
//                + "\"address\":{"
//                + "\"street\":\"123 Main St\","
//                + "\"city\":\"New York\""
//                + "},"
//                + "\"email\":\"john@example.com\""
//                + "}";
//
//        // Create ObjectMapper instance
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        // Parse JSON string into JsonNode
//        JsonNode rootNode = objectMapper.readTree(jsonString);
//
//        // Extract unique keys from JSON object
//        Set<String> uniqueKeys = new HashSet<>();
//        extractKeys(rootNode, uniqueKeys);
//
//        // Print unique keys
//        System.out.println("Unique Keys: " + uniqueKeys);
//    }
//
//    // Recursive method to extract keys from nested JSON objects
//    private static void extractKeys(JsonNode node, Set<String> keys) {
//        if (node.isObject()) {
//            Iterator<String> fieldNames = node.fieldNames();
//            while (fieldNames.hasNext()) {
//                String fieldName = fieldNames.next();
//                keys.add(fieldName); // Add key to the set
//                extractKeys(node.get(fieldName), keys); // Recursively call for nested objects
//            }
//        }
//    }
//}
