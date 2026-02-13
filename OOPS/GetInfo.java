// we learn about getters and setters
// getters = get the value of a variable
// setters = set the value of a variable
public class GetInfo {
    static class Car{
        private String brand;
        private String model;
        private int year;
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
    }
    public static void main(String[] args){
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.setYear(2022);
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        
    }
}

