#시간 초과
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
        k -= coins[i]
        cnt += 1
        #print(coins[i])
    else: i += 1
    

print(cnt)

