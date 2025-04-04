package FlyweightPattern;
import java.util.Random;

public class FlyweightMain {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] markerTypes = {
                {"Gas Station", "Red", "gas_station_icon.img"},
                {"Restaurant", "Blue", "restaurant_icon.img"},
                {"Hospital", "Green", "hospital_icon.img"}
        };

        int totalMarkers = 7;

        for (int i = 0; i < totalMarkers; i++) {
            String[] markerData = markerTypes[random.nextInt(markerTypes.length)];
            Marker marker = MarkerStyleFactory.getMarker(markerData[0], markerData[1], markerData[2]);
            marker.draw(random.nextInt(1000), random.nextInt(1000));
        }

        System.out.println("Unique markers: " + MarkerStyleFactory.getUniqueMarkerCount());
        System.out.println("Total markers: " + totalMarkers);
    }
}
