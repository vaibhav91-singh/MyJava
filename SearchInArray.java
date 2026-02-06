public class SearchInArray {
    public static void main(String[]args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == target){
                System.out.println("Element found at index " + i);
                break;
            }
        }
    }
}
