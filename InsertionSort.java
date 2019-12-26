public class InsertionSort{

    public static void main(String[] args){

        int[] array = {20, 35, -15, 7, 55, 1, -22};
       
        for(int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++){

            int temp = array[unsortedIndex];
            
            for(int i=unsortedIndex-1;i>=0; i--){

                if(temp <= array[i]){
                    
                    array[i+1] = array[i];

                    if(i==0)
                    {
                        array[i]=temp;
                    }
                    
                }
                else if (array[unsortedIndex] > array[i]){
                    array[i+1] = temp;
                    break;
                }
            
            }
        }

        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }

    }
}