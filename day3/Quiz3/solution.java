import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MyClass {
    public static String maze_runner(int[][] maze , String[] list){
        String result = "Lost" ;
        int row = 0;
        int col = 0;
/*        int[][] maze = {{1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,3},
                        {1,0,1,0,1,0,1},
                        {0,0,1,0,0,0,1},
                        {1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1},
                        {1,2,1,0,1,0,1}};*/
                        
                        
        for(row = 0; row <= maze.length-1; row++  ){
            List<Integer> chkList = Arrays.stream(maze[row]).boxed().collect(Collectors.toList());//new ArrayList<>(Arrays.asList(maze[row]));
            /*System.out.println(chkList);*/
            if(chkList.indexOf(2) >= 0 ){
                col = chkList.indexOf(2);
                break;
            }
        }
        for(String flag:list){
            /*System.out.println("row :"+row+"col :"+col);*/
            switch(flag){
                case "N" :
                    row = row-1;
                    break;
                case "E" :
                    col = col+1;
                    break;
                case "W" :
                    col = col-1;
                    break;
                case "S" :
                    row = row+1;
                    break;
            }
            /*System.out.println("row2 :"+row+"col2 :"+col);
            System.out.println("array :"+maze[row][col]);*/
            if(row < 0 || col < 0|| maze[row][col] == 1){
                result = "Dead";
                break;
            }else if(maze[row][col] == 3){
                result = "Finish";
                break;
            }
            
        }
            

        return result;
        
    }
    public static void main(String args[]) {     
        
        int[][] maze = {{1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,3},
                        {1,0,1,0,1,0,1},
                        {0,0,1,0,0,0,1},
                        {1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1},
                        {1,2,1,0,1,0,1}};
        String[] load = {"N","N","N","N","N","E","E","S","S","E","E","N","N","E"};
        System.out.println(maze_runner(maze,load));
        
    }
}
