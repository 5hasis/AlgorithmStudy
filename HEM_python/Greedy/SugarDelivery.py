#설탕배달(2839)
#그리디 알고리즘
#제일 효율적인 방법 5의 배수 찾기
#5의 배수가 될 때까지 3빼기

n = int(input())

cnt = 0

while n != 0 :

  if n%5==0:
    cnt =cnt + (n//5)
    n= n%5
    break

  n=n-3
  cnt += 1

  if n<0:
    break
   
if n==0:
  print(cnt)
else:
  print(-1)
