
def rowWeights(matrix):
    resultList = [sum(matrix[0::2]),sum(matrix[1::2])]
    print(resultList)
    

if __name__ == "__main__":

    m = [120,30,50,60]
    rowWeights(m)
