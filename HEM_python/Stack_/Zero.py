#Zero(10773)

arr = []

k = int(input())

for i in range(k):
    num = int(input())
    if(num == 0):
        arr.pop()
    else:
        arr.append(num)

print(sum(arr))