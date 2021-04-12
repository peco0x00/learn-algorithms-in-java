package org.vny.algorithms.dp.LIS;

public class BinarySearch implements Main {

  @Override
  public int lengthOfLIS(int[] nums) {
    int[] top = new int[nums.length];
    // 牌堆数初始化为0
    int piles = 0;
    // poker为当前要处理的扑克牌
    for (int poker : nums) {
      // 搜索这张牌应该放置的位置，利用搜索左侧边界的二分查找
      int left = 0, right = piles;
      while (left < right) {
        int mid = (left + right) / 2;
        if (top[mid] > poker) right = mid;
        else if (top[mid] < poker) left = mid + 1;
        else right = mid;
      }
      // left即为搜索结果
      // 未找到合适的牌堆，新建一个堆
      if (left == piles) piles++;
      // 将牌放到牌堆顶
      top[left] = poker;
    }
    return piles;
  }
}
