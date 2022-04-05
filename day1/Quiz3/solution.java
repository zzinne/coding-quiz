public class MyClass {
     public static boolean atm(String pincode){
         boolean result = false;
         int byteChk = pincode.getBytes().length ;
         boolean strChk = pincode.matches("[+-]?\\d*(\\.\\d+)?");
         if(strChk&&(byteChk == 4 || byteChk == 6)){
             result = true;
         }
         return result;
     }
    
    
    public static void main(String args[]) {
        

      System.out.println(atm("123frf24"));
    }
}
