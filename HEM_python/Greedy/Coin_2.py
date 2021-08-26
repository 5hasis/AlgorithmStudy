n, k = map(int, input().split())

coins = []

for _ in range(n):
    coins.append(int(input()))
    
#print(coins)

coins.reverse()

cnt = 0
i = 0
while(i != n):
    
    if(k == 0):
        break
    if(coins[i] <= k):
        money = k // coins[i]
        k -= money*coins[i]
        cnt += money
        #print(coins[i])
    else: i += 1
    

print(cnt)

