#스타트 링크

def update() :
    team1_size = 0
    team2_size = 0;
    for i in range(n) :
        if (pick[i] == 0) :
            team1[team1_size] = i;
            team1_size += 1
        
        else :
            team2[team2_size] = i;
            team2_size += 1
        
    
 
    sum_1 = 0
    sum_2 = 0;
    for i in range(int(n/2)) :
        for j in range(int(n/2)) :
            sum_1 += (table[team1[i]][team1[j]] + table[team1[j]][team1[i]]);
            sum_2 += (table[team2[i]][team2[j]] + table[team2[j]][team2[i]]);
        
    global ret
    if (ret > abs(sum_1 - sum_2)) :
        ret = abs(sum_1 - sum_2);
    

def dfs(cur, pick_count) :
    if (pick_count == (n / 2)):
        update();
        return
    
 
    for i in range(cur,n):
        pick[i] = 1;
        dfs(i + 1, pick_count + 1);
        pick[i] = 0;
    


n = int(input())
table = [[int(x) for x in input().split()] for _ in range(n)]

team1 = [0]*10
team2 = [0]*10

pick = [0]*20

ret = 10000000

dfs(0,0)
print(ret)

