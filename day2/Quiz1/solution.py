def maxDiff(list):
    result = 0
    if len(list) > 1 :
        listMax = max(list)
        listMin = min(list)
        result = listMax-listMin
    print(result)

if __name__ == "__main__":
    
    maxDiff([1,5555])
