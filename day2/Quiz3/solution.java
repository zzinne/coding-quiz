import java.util.ArrayList;
import java.util.Arrays;

public class MyClass {
     public static int[] rowWeights(int[] list){
        int first = 0;
        int second = 0;
        for(int i = 0; i < list.length; i++){
            if(i%2 == 0){
                first = first+list[i];
                
            }else{
                second = second+list[i];
            }
            
            
        }
        int [] resultList = {first,second};

        return resultList;
        
     }
    public static void main(String args[]) {
        
        int [] pram = {120,30,50,60};
        int [] list2 = rowWeights(pram);
        
        System.out.println(Arrays.toString(list2));
    }
}
