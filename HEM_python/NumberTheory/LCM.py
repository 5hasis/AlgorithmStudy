#최소공약수(LCM)

# a를 b로 나눴을때, 나머지 r
# a와 b의 최대공약수 = b와 r의 최대공약수
def gcd(a,b):
    if b==0:
        return a
    else: return gcd(b, a%b)
    
n = int(input())

arr = [[int(x) for x in input().split()] for _ in range(n)]

for i in range(n):
    #최소공배수는 두수의 곱을 최대공약수로 나눈 수!
    res = arr[i][0]*arr[i][1] // gcd(arr[i][0], arr[i][1])
    print(res)
    
    