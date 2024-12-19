package at.nedzhetin.OO_Programming.Phone;

public class Camera {
    private String resolution;

    public Camera(String resolution) {
        this.resolution = resolution;
    }

    public void makePicture() {
        System.out.println("taking picture");
    }
}
