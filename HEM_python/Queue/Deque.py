#10866

n = int(input())

deque = []
res = []

for _ in range(n):
    quest = input()

    if quest[:10]=='push_front':
        deque.insert(0,int(quest[11:]))
        #print('push_front:',deque)
        

    elif quest[:9]=='push_back':
        deque.append(int(quest[10:]))
        #print('push_back:',deque)
                     
    elif quest=='pop_front':
        if(len(deque)==0):
            res.append(-1)
            continue
        res.append(deque[0])
        deque.pop(0)

    elif quest=='pop_back':
        if(len(deque)==0):
            res.append(-1)
            continue
        res.append(deque[-1])
        deque.pop()

    elif quest=='size':
        res.append(len(deque))
        
    elif quest=='empty':
        if(len(deque)==0):
            res.append(1)
        else:
            res.append(0)
        
    elif quest=='front':
        if(len(deque)==0):
            res.append(-1)
            continue
        res.append(deque[0])
        
    elif quest=='back':
        if(len(deque)==0):
            res.append(-1)
            continue
        res.append(deque[-1])

print(*res, sep="\n")
        
