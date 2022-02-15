//全国计算机技术与软件专业技术资格考试
//2019年上半年 软件设计师 下午试卷 试题：n皇后问题
//答案
#include <stdio.h>
#include <stdlib.h>

#define n 4
int queen[n + 1];

void Show() {
    int i;
    printf("(");
    for (i = 1; i <= n; i++) {
        printf("%d", queen[i]);
    }
    printf(")n\n");
}

int Place(int j) {
    int i;
    for (i = 1; i < j; i++) {
        if (queen[i] == queen[j] || abs(queen[i] - queen[j]) == (j - i)) {
            return 0;
        }
    }
    return 1;
}


void Nqueen(int j) {
    int i;
    for (i = 1; i <= n; i++) {
        queen[j] = i;
        if (Place(j)&&j<=n) {
            if (j == n) {
                Show();
            } else {
                Nqueen(j+1);
            }
        }
    }
}

int main() {
    Nqueen(1);
    return 0;
}
