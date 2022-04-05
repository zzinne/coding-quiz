def repeatStr(i):
    result = False
    strChk = i.isdigit()
    if strChk == True and (len(i) == 4 or len(i) == 6 ):
       result = True
    print(result)

if __name__ == "__main__":
    m = "1A234"
    repeatStr(m)
