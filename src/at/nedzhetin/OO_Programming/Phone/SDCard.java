package at.nedzhetin.OO_Programming.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> list;

    public SDCard(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<PhoneFile>();
    }

    public void saveFile(PhoneFile file) {
        this.capacity -= file.getSize();
        if (this.capacity <= 0) {
            System.out.println("not enough capacity");
        }else {
            this.list.add(file);

        }
    }
    public void getAllFiles() {
        for (PhoneFile file : list) {
            System.out.printf("File name: %s\t\tFile size: %s\n", file.getName(), file.getSize());
        }
    }

}
