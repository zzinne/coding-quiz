import itertools

def tripleTrouble(matrix):
    result_map = []
    for x in matrix:
        line = []
        for i in x:
            line.append(i)
        result_map.append(line)
    
    list2 = list(itertools.chain(*list(map(list,zip(*result_map)))))
    result = "".join(list2)
    print(result)

if __name__ == "__main__":

    m = ["aa","bb","cc"]
    tripleTrouble(m)
