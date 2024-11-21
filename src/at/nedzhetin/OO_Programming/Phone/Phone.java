package at.nedzhetin.OO_Programming.Phone;

public class Phone {
    private Sim sim;
    private SDCard sdcard;
    private Camera camera;

    public Phone( Sim sim, SDCard sdcard, Camera camera) {
        this.sim = sim;
        this.sdcard = sdcard;
        this.camera = camera;

    }

}
