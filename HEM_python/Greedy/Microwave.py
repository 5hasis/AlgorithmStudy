#전자레인지(10162)

T = int(input())

A = 0
B = 0
C = 0

while T!=0:
  if T>=300:
    T -= 300
    A += 1

  elif T>=60:
    T-=60
    B +=1

  elif T>=10:
    T-=10
    C+=1

  elif T%10>0:
    print(-1)
    break

if T==0:
  print(A,end=' ')
  print(B,end=' ')
  print(C)
  