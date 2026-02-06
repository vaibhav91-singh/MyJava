
public class MethodeInfo {
    public static void main(String[] args) {
        int age = 20;
        String fullName = getFullName("Vaibhav","Singh");
        System.out.println(fullName);
        congrats(age);
        
    }
    // methode can return something
    static void congrats(int age){
        System.out.println("Congratulations,Happy Birthday Vaibhav"+ age);
        
    }
    

    static String getFullName(String FirstName, String SecondName){
        return FirstName + " " + SecondName;
    }




} 



