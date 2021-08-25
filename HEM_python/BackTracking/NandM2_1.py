#조합2
def backtrack(index, depth):
    if(depth == m):
        for i in range(m):
            print(arr[i], end=" ")
        print()
        return
    
    for i in range(index,n+1):
        arr[depth] = i
        backtrack(i+1, depth+1)
    
n, m = map(int, input().split())
arr = [0]*m


backtrack(1,0)
