
# Complete the morganAndString function below.
def morganAndString(a,b,l):
    a +='z'
    b +='z'
    for _ in range(len(a) + len(b) - 2):
        if a < b:
            l+=a[0]
            a = a[1:]
        else:
            l+=b[0]
            b = b[1:]
    return l
            

n = int(input())
for x in range(n):
    a = input()
    b = input()
    k = ""
    print(morganAndString(a,b,k))

//https://www.hackerrank.com/challenges/morgan-and-a-string/problem
