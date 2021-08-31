#괄호(9012)

t = int(input())

vpsList=[]
for _ in range(t):
    isVPS = "YES"
    ps = list(input())
    stk = []
    for i in range(len(ps)): 
        if ps[i] == '(':
            stk.append(ps[i])
        elif ps[i] == ')':
            if not stk:
                isVPS = "NO"
                break
            else:
                stk.pop()
    if stk:
        isVPS = "NO"
    vpsList.append(isVPS)

for i in range(len(vpsList)):
    print(vpsList[i])