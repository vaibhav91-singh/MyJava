public class TwoDArray {
    public static void main(String[]args){
        String[][] cars = {
            {"BMW",      "Audi",     "Mercedes"},
            {"Mustang",  "Corvette", "Camaro"},
            {"Tesla",    "Rivian",   "Lucid"}
        };
        for(int i=0 ; i<cars.length ; i++){
            for(int j=0 ; j<cars[i].length ; j++){
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
    }
}
