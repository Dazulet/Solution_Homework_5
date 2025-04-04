package FlyweightPattern;

public class MarkerStyle {
    private final String iconType;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void display(int x, int y) {
        System.out.println("Displaying " + iconType + " marker at (" + x + ", " + y + ") with color " + color);
    }
}
