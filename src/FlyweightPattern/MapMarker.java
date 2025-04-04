package FlyweightPattern;

public class MapMarker {
    private final int x, y;
    private final MarkerStyle style;

    public MapMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void render() {
        style.display(x, y);
    }
}
