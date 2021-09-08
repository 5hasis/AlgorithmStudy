#주유소(13305)

N  = int(input()) #도시개수

d = list(map(int, input().split()))

price = list(map(int, input().split()))

total = 0
min_price = 1000000001

for i in range(len(d)):
    min_price = min(min_price,price[i])
    total += min_price*d[i]    
        
print(total)
