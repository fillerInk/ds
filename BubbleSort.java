public class BubbleSort {

    public static void main(String[] args){
     
         int[] array = {20, 35, -15, 7, 55, 1, -22};

         for(int unsortedIndex = array.length-1; unsortedIndex>0; unsortedIndex--){
             for(int i =0; i< unsortedIndex; i++){
                 if(array[i] > array[i+1]){
                     swap(array, i, i+1);
                 }
             }
         }
        

        for(int j=0; j<array.length; j++){
            System.out.print(array[j]+" ");
        }

    }


    public static void swap(int[] array, int i, int j){

        if(i==j){
            return;
        }

        int temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }

}