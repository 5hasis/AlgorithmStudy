#1874

n = int(input())
arr = list()

seq = []
for _ in range(n):
    seq.append(int(input()))

tmp = []
res = []

j=0
i=0

while(True):
    
    if tmp:
        if seq[j]==tmp[-1]:
            arr.append('-')
            res.append(tmp[-1])
            tmp.pop()
            j+=1
            #print('tmp : ',tmp)
            #print('res : ',res)
            continue
    
    i += 1
    #print("i : ",i)

    if i>n:
        break

    tmp.append(i)
    #print('tmp : ',tmp)
    #print(res)
    arr.append('+')
    
    
if seq == res:
    #print(*arr, sep="\n") #한줄씩 출력(unpacking)
    for i in range(len(arr)):
        print(arr[i])
else:
    print("NO")
            