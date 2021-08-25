
n = int(input())

arr = [[int(x) for x in input().split()] for _ in range(n)]

dp = [[0 for x in range(n)] for y in range(n)]

dp[0][0] = arr[0][0]

for i in range(1,n):
    for j in range(i+1):
        if j == 0: #j가 첫번째 열이면 바로 위 데이터만 더하기
            dp[i][j] = arr[i][j]+ dp[i-1][j]
        elif j == i: #j가 마지막 열이면 왼쪽 대각선 데이터만 더하기
            dp[i][j] = arr[i][j]+ dp[i-1][j-1]
        else:
            dp[i][j] = arr[i][j]+ max(dp[i-1][j-1],dp[i-1][j])
        #print(dp)
result = 0
for k in range(n):
    result = max(result, dp[n-1][k])#마지막줄에서 가장 큰값찾기


print(result)


