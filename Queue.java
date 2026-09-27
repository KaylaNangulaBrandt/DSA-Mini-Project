public class Queue {
    private Student[] queue;
    private int front, rear, size;

    public Queue(int size) {
        this.size = size;
        queue = new Student[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(Student s) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            queue[rear] = s;
        } else {
            rear++;
            queue[rear] = s;
        }
    }

    public Student dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
            return null;
        } else if (front == rear) {
            Student temp = queue[front];
            front = -1;
            rear = -1;
            return temp;
        } else {
            Student temp = queue[front];
            front++;
            return temp;
        }
    }

    public Student peek() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public void displayQueue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}