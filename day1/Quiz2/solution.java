public class MyClass {
     public static String repeatStr(int i, String word){
         String text = word.repeat(i);
         return text;
     }
    
    
    public static void main(String args[]) {
        
        String result = repeatStr(6,"ji");

      System.out.println(result);
    }
}
