package at.nedzhetin.OO_Programming.Phone;

import java.util.Random;

public class PhoneFile {
    private String name;
    private int size;


    public PhoneFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
