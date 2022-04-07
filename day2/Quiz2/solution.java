public class MyClass {
     public static int factorial(int n){
        int result = 1;
        
         while(n !=0){
             result = result*n;
             n--;
         }

        return result;
        
     }
    public static void main(String args[]) {
        
        
        System.out.println(factorial(0));
    }
}
