class ArraysExample{

    void searchInArray(){

        int[] arr= { 1, 2, 3, 4, 5};
        int x=4;
        int ans=-1;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == x){
                ans=i;
            }
        }
        System.out.println( "Found at index:" + ans);
        
    }
}

public class searchArray {
    public static void main(String[] args) {
        ArraysExample obj= new ArraysExample();
        obj.searchInArray();
    }
    
}
