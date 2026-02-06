
// overloading have same name but different parameters
public class OverloadingMethodeinfo {
    
    public static void main(String[] args){
      int a=2;
      int b=3;
      int c=4;
      int d=5;
      add(a,b);
      add(a,b,c) ;
      add(a,b,c,d);        
    }
    static void add(int a,int b){
        System.out.println("Add of Two number : "+ (a+b));
        
    }
     static void add(int a,int b,int c){
        System.out.println("Add of Three number : "+ (a+b+c));
       
    }
    static void add(int a,int b,int c,int d){
        System.out.println("Add of Four number : "+ (a+b+c+d));
       
    }

}
