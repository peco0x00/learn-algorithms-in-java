package org.vny.algorithms.linear.ADT;

public class LinkedDeque {

  private Node front;
  private Node rear;
  private int size;

  public LinkedDeque() {
    front = new Node(-1);
    rear = new Node(-1);
    front.next = rear;
    rear.prev = front;
    size = 0;
  }

  public boolean isEmpty() {
    return front.next == rear;
  }

  public int size() {
    return size;
  }

  public void addFirst(int x) {
    Node newNode = new Node(x);
    newNode.next = front.next;
    front.next.prev = newNode;
    front.next = newNode;
    newNode.prev = front;
    size++;
  }

  public void addLast(int x) {
    Node newNode = new Node(x);
    rear.prev.next = newNode;
    newNode.prev = rear.prev;
    newNode.next = rear;
    rear.prev = newNode;
    size++;
  }

  public int removeFirst() {
    if (isEmpty()) return -1;
    int res = front.next.val;
    front.next.next.prev = front;
    front.next = front.next.next;
    return res;
  }

  /*
   * [front] <-> [1] <-> [2] <-> [rear]
   * */
  public int removeLast() {
    if (isEmpty()) return -1;
    int res = rear.prev.val;
    rear.prev.prev.next = rear;
    rear.prev = rear.prev.prev;
    return res;
  }

  public int peekFirst() {
    if (isEmpty()) return -1;
    return front.next.val;
  }

  public int peekLast() {
    if (isEmpty()) return -1;
    return rear.prev.val;
  }

  public void print() {
    if (isEmpty()) return;
    Node cur = front.next;
    while (cur != rear) {
      System.out.print(cur.val);
      if (cur.next != rear) {
        System.out.print(" ");
      }
      cur = cur.next;
    }
    System.out.println();
  }

  public void printReverse() {
    if (isEmpty()) return;
    Node cur = rear.prev;
    while (cur != front) {
      System.out.print(cur.val);
      if (cur.prev != rear) {
        System.out.print(" ");
      }
      cur = cur.prev;
    }
    System.out.println();
  }
}
