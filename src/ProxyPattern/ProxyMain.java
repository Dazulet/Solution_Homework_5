package ProxyPattern;

public class ProxyMain {
    public static void main(String[] args) {
        Image img1 = new ProtectedProxyImage("house1.jpg", true);
        Image img2 = new ProtectedProxyImage("house2.jpg", false);

        img1.displayThumbnail();
        img2.displayThumbnail();

        img1.displayFullImage();
        img2.displayFullImage();
    }
}
