//全国计算机技术与软件专业技术资格考试
//2019年上半年 软件设计师 下午试卷 试题四：n皇后问题
//尝试 1
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

/**
 * 判断该位置是否可以放置皇后
 * @param j
 * @return 1：可以放置 0：不可以放置
 */
int Place(int j) {
    int i;
    for (i = 1; i < j; i++) {
        if (queen[i] == queen[j] || abs(queen[i] - queen[j]) == (j - i)) {
            return 0;
        }
    }
    return 1;
}

/**
 * 记录皇后位置
 * @param j
 */
void Nqueen(int j) {
    int i;
    for (i = 1; i <= n; i++) {
        queen[j] = i;
        if (Place(j) && j <= n) {
            if (j == n) {
                Show();
            } else {
                Nqueen(j + 1);
            }
        }
    }
}

int main() {
    Nqueen(1);
    return 0;
}
