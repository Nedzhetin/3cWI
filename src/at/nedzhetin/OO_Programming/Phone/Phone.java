package at.nedzhetin.OO_Programming.Phone;

import java.io.File;
import java.util.Random;

public class Phone {
    private Sim sim;
    private SDCard sdcard;
    private Camera camera;
    private int fileCount = 1;

    Random random = new Random();

    public Phone( Sim sim, SDCard sdcard, Camera camera) {
        this.sim = sim;
        this.sdcard = sdcard;
        this.camera = camera;

    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public SDCard getSDCard() {
        return sdcard;
    }

    public void setSDCard(SDCard sdcard) {
        this.sdcard = sdcard;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void safeFile(SDCard sdCard, PhoneFile file) {
        sdCard.saveFile(file);
    }

    public void takePicture( Camera camera, SDCard sdCard ) {
        camera.makePicture();
        fileCount++;
        int fileSize = random.nextInt(0,40);
        PhoneFile newFile = new PhoneFile("png" + fileCount, fileSize);
        sdcard.saveFile(newFile);
    }

    public void getAllFiles(){
        sdcard.getAllFiles();
    }

    public void call(Sim sim){
        sim.doCall();
    }
}
