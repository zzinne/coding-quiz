def repeatStr(f,s,t):
    result = ""
    for i,j,x in zip(f,s,t):
        result = result+i+j+x
        
    print(result)

if __name__ == "__main__":
    
    repeatStr("aa","bb","cc")
