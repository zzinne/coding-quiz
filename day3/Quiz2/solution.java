
public class MyClass {
    public static int umPrimorial(int number){
        int result = 1 ;
        int cnt1 = 0;
        for(int i = 2; i <= 100; i++  ){
            int cnt2 = 0;
            
            for(int j = 2; j <= i; j++){
                if(i%j==0){
                    cnt2++;
                }
                if(cnt2 >= 2){
                    break;
                }
            }
            if(cnt2 == 1 ){
                result = result* i;
                cnt1++;
            }
            if(cnt1 == number){
                break;
            }
            
        }

        return result;
        
    }
    public static void main(String args[]) {
        
        System.out.println(umPrimorial (3));
    }
}
