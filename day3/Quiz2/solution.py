
def umPrimorial(number):
    result = 1
    count1 = 0
    for j in range(2,100) :
        count2 = 0
        for x in range(2,j+1):
            if j%x == 0:
                count2 += 1
            if count2 >=2 :
                break
        
        if count2 == 1:
            result = result*j
            count1 += 1
        if count1 == number:
            break
        
    print(result)
    

if __name__ == "__main__":
    umPrimorial(3)
