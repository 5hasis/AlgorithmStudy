
arr = []

i=0
while(True):
    a,b = map(int,input().split())
    if(a==0 and b ==0):
        break
    arr.append([a,b])

#print(arr)


for i in range(len(arr)):
    if arr[i][0] % arr[i][1] ==0:
        res = 'multiple'
    elif arr[i][1] % arr[i][0] ==0:
        res = 'factor'
    else:
        res = 'neither'
    print(res)
    

