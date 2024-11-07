package at.nedzhetin.OO_Programming;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private String name;
    private int age;
    private String gender;
    private List<Car> Cars = new ArrayList<Car>();

    public Driver(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public List<Car> pushCar(Car car) {
        Cars.add(car);
        return null;
    }

    public List<Car> getCars() {
        return Cars;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
    }

}
