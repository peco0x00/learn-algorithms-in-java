package org.vny.algorithms.linear.ADT;

public class ArrayQueue {

  private int[] array;
  /**
   * front 指向第一个元素之前的位置，该位置不存放元素
   * */
  private int front;
  /**
   * rear 指向最后一个元素
   * */
  private int rear;

  public ArrayQueue() {
    this(10);
  }

  public ArrayQueue(int size) {
    array = new int[size + 1];
    front = rear = 0;
  }

  public boolean isEmpty() {
    return front == rear;
  }

  public boolean isFull() {
    return front == (rear + 1) % array.length;
  }

  public int size() {
    return (rear - front + array.length) % array.length;
  }

  public void enqueue(int x) {
    if (isFull()) return;
    rear = (rear + 1) % array.length;
    array[rear] = x;
  }

  public int dequeue() {
    if (isEmpty()) return -1;
    front = (front + 1) % array.length;
    return array[front];
  }

  public int peek() {
    if (isEmpty()) return -1;
    return array[(front + 1) % array.length];
  }

  public void print() {
    if (isEmpty()) return;
    int n = size();
    for (int i = 0; i < n; i++) {
      System.out.print(array[(i + front + 1) % array.length]);
      if (i < n - 1) System.out.print(" ");
    }
    System.out.println();
  }
}
