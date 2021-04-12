# 滑动窗口问题

滑动窗口利用双指针进行子字符串匹配

## 1. 基本内容

1. 在字符串中使用双指针left和right，将索引闭区间`[left, right]`称为一个窗口
2. 不断增加right，扩大窗口，直到窗口中的字符串符合要求
3. 停止增加right，不断增加left缩小窗口，直到窗口中的字符串不再符合要求
4. 直到right到达字符串末尾

```java
String s, t;
int left = 0, right = 0;
String res = s;
while (right < s.size()) {
  window.add(s[right]);
  right++;
  while (window satisfy requirement) {
    res = minLen(res, window);
    window.remove(s[left]);
    left++;
  }
}
```

## 2. exercises

[leetcode 76](https://leetcode-cn.com/problems/minimum-window-substring/)
[leetcode 567](https://leetcode-cn.com/problems/permutation-in-string/)
[leetcode 438](https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/)
[leetcode 3](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)
