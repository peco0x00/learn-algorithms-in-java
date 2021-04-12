package org.vny.algorithms.linear.ADT;

public class LinkedQueue {

  private Node front;
  private Node rear;
  private int size;

  public LinkedQueue() {
    front = new Node(-1);
    rear = new Node(-1);
    front.next = rear;
    size = 0;
  }

  public boolean isEmpty() {
    return front.next == rear;
  }

  public int size() {
    return size;
  }

  public void enqueue(int x) {
    rear.val = x;
    rear.next = new Node(-1);
    rear = rear.next;
    size++;
  }

  public int dequeue() {
    if (isEmpty()) return -1;
    int res = front.next.val;
    front.next = front.next.next;
    return res;
  }

  public int peek() {
    if (isEmpty()) return -1;
    return front.next.val;
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
}
