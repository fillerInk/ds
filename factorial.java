public class factorial{

    public static void main (String[] args){

        int i = fact(11)/fact(10);
        System.out.println(i);

    }

    public static int fact(int n){
       
        if(n == 0)
            return 1;
        else
            return n * fact(n-1);    
    }

}