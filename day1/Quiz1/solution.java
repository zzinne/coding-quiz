public class MyClass {
     public static String tripleTrouble(String f,String s,String t){
        String result = "";
        for(int i = 0; i < f.length(); i++){
            result = result+f.charAt(i)+s.charAt(i)+t.charAt(i);
        }
        return result;
        
     }
    public static void main(String args[]) {
        

      System.out.println(tripleTrouble("aa","bb","cc"));
    }
}
