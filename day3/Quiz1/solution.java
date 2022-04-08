import java.util.ArrayList;
import java.util.Arrays;

public class MyClass {
    public static int rangeArr(int[] list){
        int result = 0;
        int listMax = Arrays.stream(list).max().getAsInt();
        int listMin = Arrays.stream(list).min().getAsInt();    
        result = listMax - listMin -(list.length-1) ;

        return result;
        
    }
    public static void main(String args[]) {
        
        int [] pram = {1,2};
        System.out.println(rangeArr(pram));
    }
}
