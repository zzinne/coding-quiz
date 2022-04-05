public class MyClass {
            public static String tripleTrouble(String input[]){
            String result = "";
            int length = input[0].length();
            String[] test = new String[length];
            
            for(int i = 0; i <input.length; i++ ){
               for(int x = 0; x <length; x++  ){
                   
                   String str = "";
                   str = input[i];
                   if(i == 0){
                       test = str.split("");
                       break;
                   }else{
                       String str2 = test[x];
                       str2 = str2+str.substring(x,x+1);
                        test[x] = str2;
                   }
               }
            }
            result = String.join("",test);
            //Arrays.stream(test).collect(Collectors.joining());
            //System.out.println(result);
            return result;
        }
    public static void main(String args[]) {
        
        String ex[] = {"this","test","lock"};
        String text = tripleTrouble(ex);
        System.out.println(text);
        
        

    }
}
