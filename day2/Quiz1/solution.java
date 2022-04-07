import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


public class MyClass {
     public static int maxDiff(ArrayList<Integer> list){
        int result = 0;
        
        if(list.size() == 0 || list.size()  == 1 ){
            return result ;
        }else{
            int listMax = Collections.max(list);
            int listMin = Collections.min(list);
            result = listMax - listMin;
        }

        return result;
        
     }
    public static void main(String args[]) {
        
        ArrayList<Integer> resultdiff = new ArrayList<Integer>(Arrays.asList(-7,-1,-31));
        
        
        System.out.println(maxDiff(resultdiff));
    }
}
