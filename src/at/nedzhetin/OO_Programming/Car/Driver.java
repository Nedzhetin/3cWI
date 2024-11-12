package at.nedzhetin.OO_Programming.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private String name;
    private int age;
    private String gender;
    private List<Car> cars = new ArrayList<Car>();


    public Driver(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Scanner scanner = new Scanner(System.in);

    public List<Car> pushCar(Car car) {
        cars.add(car);
        return null;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void printAllCarInfo() {

        if (!cars.isEmpty()) {
            for (Car car : cars) {
                car.giveCarInfo();
            }
        } else{
           System.out.println("No car available");
        }
    }

    public void deleteCar() {
        if (!cars.isEmpty()) {
            printAllCarInfo();
            System.out.println("Type the serial Number of the Car you want to delete");
            String serialNumber = scanner.next();
            cars.removeIf(car -> car.getSerialNumber().equals(serialNumber));
        }else {
            System.out.println("No car available");
        }

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
