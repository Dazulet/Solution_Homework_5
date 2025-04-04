package FlyweightPattern;
import java.util.HashMap;
import java.util.Map;


public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String iconType, String color, String labelStyle) {
        String key = iconType + "-" + color + "-" + labelStyle;
        styles.putIfAbsent(key, new MarkerStyle(iconType, color, labelStyle));
        return styles.get(key);
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}
