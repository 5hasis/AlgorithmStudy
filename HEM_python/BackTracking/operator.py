def operator(res,cnt):
    global mini
    global maxi
    if(cnt == n-1):
        maxi = max(res,maxi)
        mini = min(res,mini)
        return
        
    for i in range(4):
        if(cal[i] != 0):
            cal[i] -= 1
            if(i == 0):
                operator(res + arr[cnt+1], cnt+1)
            elif(i == 1):
                operator(res - arr[cnt+1], cnt+1)
            elif(i == 2):
                operator(res * arr[cnt+1], cnt+1)
            elif(i == 3):
                operator(int(res / arr[cnt+1]), cnt+1)
            cal[i] += 1

n = int(input())

arr = list(map(int,input().split()))

cal = list(map(int,input().split()))

mini = 1000000000
maxi = -1000000000


operator(arr[0],0)

print(maxi);
print(mini);


