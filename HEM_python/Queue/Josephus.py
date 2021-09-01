#요세푸스(11866)

n,k = map(int,input().split())

arr = list(range(1,n+1))

res = []
idx = k-1

while arr:
    
    if idx>=len(arr):
        idx = idx % len(arr)
        
    #print(arr[idx])
    
    res.append(str(arr[idx])) #문자열로 저장
    arr.pop(idx)
    #print('arr : ', arr)
    
    idx += k-1

#print(res)
print("<",", ".join(res)[:],">", sep='')
