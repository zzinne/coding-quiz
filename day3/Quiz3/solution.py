def maze_runner(maze,list):
    result = "Lost" 
    row = -1
    col = 0
    for i in maze:
        row+=1
        if 2 in i :
            col = i.index(2)
            break
    
    for j in list:
        if j == "N" :
            row-=1
        elif j == "E":
            col+=1
        elif j == "W":
            col-=1
        else :
            row+=1
        
        if row < 0 or col < 0 or maze[row][col] == 1:
            result = "Dead"
            break
        elif  maze[row][col] == 3:
            result = "Finish"
            break
    
    print(result)




if __name__ == "__main__":
    maze = [[1,1,1,1,1,1,1], [1,0,0,0,0,0,3], [1,0,1,0,1,0,1], [0,0,1,0,0,0,1], [1,0,1,0,1,0,1], [1,0,0,0,0,0,1], [1,2,1,0,1,0,1]]
    load = ["N","N","N","N","N","E","E","E","E","E"]
    maze_runner(maze,load)
