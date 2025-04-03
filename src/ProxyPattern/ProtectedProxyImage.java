package ProxyPattern;

public class ProtectedProxyImage implements Image {
    private ProxyImage proxyImage;
    private boolean isAgentLoggedIn;

    public ProtectedProxyImage(String filename, boolean isAgentLoggedIn) {
        this.proxyImage = new ProxyImage(filename);
        this.isAgentLoggedIn = isAgentLoggedIn;
    }

    @Override
    public void displayThumbnail() {
        proxyImage.displayThumbnail();
    }

    @Override
    public void displayFullImage() {
        if (isAgentLoggedIn) {
            proxyImage.displayFullImage();
        } else {
            System.out.println("Access Denied: Only logged-in agents can view full images.");
        }
    }
}