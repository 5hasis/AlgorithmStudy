#LBS : 가장 긴 바이토닉 부분 수열

def lis(arr):
    dp = [1]*n
    for i in range(n):
        for j in range(i):
            if arr[j] < arr[i]: #자신이 이전 값보다 크면
                dp[i] = max(dp[i], dp[j]+1)
    return dp

            

n = int(input())

arr = list(map(int,input().split()))


dp = lis(arr)

arr.reverse()
dp2 = lis(arr)
dp2.reverse()


max_len = 0
for i in range(n):
    max_len = max(max_len,dp[i]+dp2[i]-1) 
    #LIS의 가장 큰 데이터랑 LSS(가장 긴 감소하는)의 가장 작은 데이터랑 겹치지 때문에 -1 해줘야함

print(max_len)


    
    
