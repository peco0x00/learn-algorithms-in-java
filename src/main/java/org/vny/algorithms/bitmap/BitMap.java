package org.vny.algorithms.bitmap;

public class BitMap {

  private int[] table;

  /*
  * total size = 4 * 32 * range = 128 * range
  * 每个int长度的内存都可以存储32个数字，每个bit表示一个数字
  * each element in the map can be represented in 128 bit position.
  *
  * */
  public BitMap(int range) {
    this.table = new int[(range >> 5) + 1];
  }

  // 位图元素的设置
  public void setBit(int x) {
    // 找到位置x在位图中对应的实际bit位置
    // index代表这个元素放在第几个int位置上
    // num表示这个元素在当前的int位置上的第几个bit位上
    int index = x >> 5;
    int num = x % 32;
    // 每个bit实际上只能表示1或0，因此在指定int位置上将当前num个bit位设置位1，表示这个位置有数字
    this.table[index] |= (1 << num);
  }

  // 位图元素的移除
  public void removeBit(int x) {
    int index = x >> 5;
    int num = x % 32;
    // setBit的逆操作，将指定bit为从1设置为0即可
    this.table[index] &= ~(1 << num);
  }

  // 位图元素的查找，返回指定bit位的数字
  public int getBit(int x) {
    int idx = x >> 5;
    int num = x % 32;
    return table[idx] & (1 << num);
  }
}
