import java.util.Random;

public class RandomNumbers { // Class renamed
    public static void main(String[] args){
        Random random = new Random(); // Now this refers to java.util.Random
        int number;
        number = random.nextInt(1000);
        System.out.print(number);
    }
}