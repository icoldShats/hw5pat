import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private static Map<String, TextStyle> styles = new HashMap<>();

    public static TextStyle getStyle(String font, int size, boolean bold, String color) {
        String key = font + size + bold + color;
        if (!styles.containsKey(key)) {
            styles.put(key, new TextStyle(font, size, bold, color));
        }
        return styles.get(key);
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}
