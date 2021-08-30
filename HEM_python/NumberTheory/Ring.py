#
import math

n = int(input())

circle = list(map(int, input().split()))

for i in range(1,n):
    
    boonmo = circle[0] // math.gcd(circle[0],circle[i])
    boonja = circle[i] // math.gcd(circle[0],circle[i])
    print(boonmo, end='/')
    print(boonja)
    
