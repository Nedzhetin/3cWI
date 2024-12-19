package at.nedzhetin.OO_Programming.Phone;


public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(100,12346794);
        Camera camera = new Camera("144p");
        SDCard sdCard = new SDCard(100);

        Phone phone = new Phone(sim,sdCard,camera);

        PhoneFile f1 = new PhoneFile("png1", 20);

        phone.safeFile(sdCard,f1);

        phone.getAllFiles();

        phone.takePicture(camera, sdCard);
        phone.takePicture(camera, sdCard);
        phone.takePicture(camera, sdCard);
        phone.takePicture(camera, sdCard);
        phone.takePicture(camera, sdCard);
        phone.takePicture(camera, sdCard);
        phone.takePicture(camera, sdCard);


        phone.getAllFiles();

        phone.call(sim);
    }

}


