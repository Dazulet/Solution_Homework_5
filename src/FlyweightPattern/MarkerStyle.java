package FlyweightPattern;

public class MarkerStyle implements Marker {
    private final String iconType;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }


    @Override
    public void draw(int x, int y) {
        System.out.println(iconType + " at (" + x + ", " + y + ") with " + color + " color and icon " + labelStyle);
    }
}
