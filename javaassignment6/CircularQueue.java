public class CircularQueue {
    int[] queue = new int[5];
    int front = -1, rear = -1, size = 0;

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % 5;
        queue[rear] = val;
        if (front == -1) front = 0;
        size++;
    }

    public int dequeue() {
        if (size == 0) throw new RuntimeException("Queue is empty");
        int val = queue[front];
        front = (front + 1) % 5;
        size--;
        return val;
    }
    public int peek() {
        if (size == 0) throw new RuntimeException("Queue is empty");
        return queue[front];
    }
    public boolean isFull() {
        return size == 5;
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println("Front: " + cq.peek());
        cq.dequeue();
        System.out.println("Front after dequeue: " + cq.peek());
    }
}
