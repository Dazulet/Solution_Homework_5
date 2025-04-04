package FlyweightPattern;
import java.util.HashMap;
import java.util.Map;


public class MarkerStyleFactory {
    private static final Map<String, Marker> markers = new HashMap<>();

    public static Marker getMarker(String type, String color, String icon) {
        String key = type + "-" + color + "-" + icon;
        return markers.computeIfAbsent(key, k -> new MarkerStyle(type, color, icon));
    }

    public static int getUniqueMarkerCount() {
        return markers.size();
    }
}
