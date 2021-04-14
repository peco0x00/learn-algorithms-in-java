# 2.1

### 2.1.1 

```
 i  min    0    1    2    3    4    5    6    7    8    9   10   11
           E    A    S    Y    Q    U    E    S    T    I    O    N
 0    1    E    A    S    Y    Q    U    E    S    T    I    O    N
 1    1    A    E    S    Y    Q    U    E    S    T    I    O    N
 2    6    A    E    S    Y    Q    U    E    S    T    I    O    N
 3    9    A    E    E    Y    Q    U    S    S    T    I    O    N
 4   11    A    E    E    I    Q    U    S    S    T    Y    O    N
 5   10    A    E    E    I    N    U    S    S    T    Y    O    Q
 6   11    A    E    E    I    N    O    S    S    T    Y    U    Q
 7    7    A    E    E    I    N    O    Q    S    T    Y    U    S
 8   11    A    E    E    I    N    O    Q    S    T    Y    U    S
 9   11    A    E    E    I    N    O    Q    S    S    Y    U    T
10   10    A    E    E    I    N    O    Q    S    S    T    U    Y
11   11    A    E    E    I    N    O    Q    S    S    T    U    Y
```

### 2.1.2 

若最大元素排在第一位，则其需要从`index = 0`交换`n - 1`次到`index = n - 1`
若最大元素排在最后一位，则其交换次数为0
平均每个元素需要被交换 (n - 1) / 2次

### 2.1.3 

只要该数组是一个递减数组即可保证`a[j] < a[min]`的次数最多

### 2.1.4 

### 2.1.13 

```
def sort(cards[]):
  for i in range(0, len(cards)):
    for j in range(i + 1, len(cards)):
      if cards[i].suit > cards[j].suit:
        swap(i, j)
      elif cards[i].suit == cards[i].suit and
        cards[i].val > cards[j].val:
        swap(i, j)
```

