#조합
def backtrack(depth, pre): #pre변수 추가해주어 이전에 저장된 값보다 크면 재귀 실행
    if(depth == m):
        for i in range(m):
            print(arr[i], end=" ")
        print()
        return
    
    for i in range(1,n+1):
        if visited[i]==False and pre<i: 
            arr[depth] = i
            visited[i]= True
            backtrack(depth+1, i)
            visited[i]=False          
            
            
    
n, m = map(int, input().split())
arr = [0]*m

visited = [False]*(n+1)


backtrack(0,0)