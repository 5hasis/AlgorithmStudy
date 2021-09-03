#행렬 곱셈(2740)

n, m = map(int, input().split())

A = []

for i in range(n):
    row = list(map(int,input().split()))
    A.append(row)
    

B = []

m, k = map(int, input().split())

for i in range(m):
    row = list(map(int,input().split()))
    B.append(row)


C = [[0 for _ in range(k)] for _ in range(n)]

for N in range(n):
    for K in range(k):
        for M in range(m):
            C[N][K] += A[N][M] * B[M][K]

        #print(C)

#출력문
for i in C:
    for j in i:
        print(j, end = ' ')
    print()

    
