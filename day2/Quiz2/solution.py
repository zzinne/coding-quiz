def factorial(n):
    result = 1
    for i in range(1,n+1):
        result = result*i
    print(result)

if __name__ == "__main__":
    
    factorial(0)
