package ProxyPattern;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;

    }

    @Override
    public void displayThumbnail() {

    }

    @Override
    public void displayFullImage() {

    }
}