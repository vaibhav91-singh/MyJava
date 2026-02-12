public class ToStringg {
    public static void main(String[] args){
       ToStringg to = new ToStringg();
        Car car = to.new Car("Red",200000,2022,"Toyota");
        Car car2 = to.new Car("Blue",250000,2023,"Honda");
        System.out.println(car2);    
        System.out.println(car);    
        Car car3 = to.new Car("Green",200000,2022,"BMW");
        System.out.println(car3);   
    }
    class Car{
        String color;
        int price;
        int year ;
        String brand;

       public Car(String color,int price,int year,String brand){
            this.color = color;
            this.price = price;
            this.year = year;
            this.brand = brand;
        }
        @Override
    public String toString() {
        return "My car brand is " + brand + ", and color is " + color + ", Year is " + year + ", Price is $" + price + ".";
    }
}
}