n = int(input())

p = list(map(int, input().split()))

res = 0
p.sort() #시간을 오름차순 정렬

time = [0]*n

for i in range(n):
    res += p[i]
    time[i] = res
    
print(sum(time))
