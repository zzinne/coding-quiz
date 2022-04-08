
def rangeArr(matrix):
    listMax = max(matrix)
    listMin = min(matrix)
    result = listMax-listMin-(len(matrix)-1)
    
    print(result)
    

if __name__ == "__main__":

    m = [1, 11, 8, 12]
    rangeArr(m)
