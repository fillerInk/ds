public class ShellInsertionSort{

    // This doesn't work!

    public static void main(String[] args){

        int[] array = {20, 35, -15, 7, 55, 1, -22};
       

        for(int gap = array.length/2; gap>0; gap/=2 ){


            
                int temp = array[gap];
                
                for(int j =gap; j>0; j-=gap){
                    
                    if(array[j]<=temp){
                        array[j+gap] = array[j];

                        if(j==0){
                            array[j] = temp;
                        }

                    }

                    else if (temp > array[j]){
                        array[j+gap] = temp;
                        break;
                    }

                }
            

        }
       

        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }

    }
}