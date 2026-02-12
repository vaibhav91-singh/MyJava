public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car("Red", 200000, 2022, "Toyota");
        car.start();
        car.stop();
        Bike bike = new Bike("Black", 200000, 2022, "Honda");
        bike.start();
        bike.stop();
    }

    static abstract class Vehicle {
        abstract void start();

        abstract void stop();
    }

    static class Car extends Vehicle {
        String color;
        int price;
        int year;
        String brand;

        Car(String color, int price, int year, String brand) {
            this.color = color;
            this.price = price;
            this.year = year;
            this.brand = brand;
        }

        @Override
        void start() {
            System.out.println("Car started");
        }

        @Override
        void stop() {
            System.out.println("Car stopped");
        }
    }

    static class Bike extends Vehicle {
        String color;
        int price;
        int year;
        String brand;

        Bike(String color, int price, int year, String brand) {
            this.color = color;
            this.price = price;
            this.year = year;
            this.brand = brand;
        }

        @Override
        void start() {
            System.out.println("Bike started");
        }

        @Override
        void stop() {
            System.out.println("Bike stopped");
        }
    }
}
