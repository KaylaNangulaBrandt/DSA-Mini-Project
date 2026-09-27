public class StudentLinkedList {

    class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public StudentLinkedList() {
        head = null;
    }

    public void insertAtBeginning(Student s) {
        Node newNode = new Node(s);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(Student s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(Student s, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(s);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Invalid position");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteStudent(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
        } else {
            temp.next = temp.next.next;
        }
    }

    public Student searchStudent(String studentNo) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.studentNo.equals(studentNo)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayStudents() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}