// varargs -> variable arguments 
// do  not need to make more methode to performe same type
// of operation 

public class Varargs {
    public static void main(String[]args){
        
        System.out.println(add(1,12,2,3));
    }
    static int add(int... numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
}


