
def backtrack(depth):
    if(depth == m):
        for i in range(m):
            print(arr[i], end=" ")
        print()
        return
    
    for i in range(1,n+1):
        if visited[i]==False :
            arr[depth] = i
            visited[i]= True
            backtrack(depth+1)
            visited[i]=False          
            
            
    
n, m = map(int, input().split())
arr = [0]*m

visited = [False]*(n+1)


backtrack(0)
