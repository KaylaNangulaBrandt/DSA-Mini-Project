public class Main {
    public static void main(String[] args) {

        // ============================================================
        // TASK A1: QUEUE
        // ============================================================
        System.out.println("========== TASK A1: QUEUE ==========");

        Queue q = new Queue(10);

        System.out.println("\n--- Enqueueing 6 students ---");
        q.enqueue(new Student("221045678", "Maria",    "Registration", 12));
        q.enqueue(new Student("222034512", "Tomas",    "Student Card", 5));
        q.enqueue(new Student("2223041876","Ndapewa",  "Fees",         8));
        q.enqueue(new Student("221067341", "Simon",    "Documents",    4));
        q.enqueue(new Student("222098765", "Anna",     "Registration", 10));
        q.enqueue(new Student("221034567", "Petrus",   "Fees",         6));

        System.out.println("\n--- Queue after 6 arrivals ---");
        q.displayQueue();

        System.out.println("\n--- Serving 3 students (dequeue) ---");
        for (int i = 0; i < 3; i++) {
            Student s = q.dequeue();
            if (s != null) System.out.println("Served: " + s);
        }

        System.out.println("\n--- Queue after 3 served ---");
        q.displayQueue();

        System.out.println("\n--- Peek next student ---");
        System.out.println("Next: " + q.peek());

        System.out.println("\n--- Is queue empty? ---");
        System.out.println(q.isEmpty());

        // ============================================================
        // TASK A2: SINGLY LINKED LIST
        // ============================================================
        System.out.println("\n\n========== TASK A2: LINKED LIST ==========");

        StudentLinkedList list = new StudentLinkedList();

        System.out.println("\n--- 1. Insert at END: Maria, Tomas, Ndapewa ---");
        list.insertAtEnd(new Student("221045678", "Maria",    "Registration", 12));
        list.insertAtEnd(new Student("222034512", "Tomas",    "Student Card", 5));
        list.insertAtEnd(new Student("2223041876","Ndapewa",  "Fees",         8));
        list.displayStudents();

        System.out.println("\n--- 2. Insert at BEGINNING: Simon ---");
        list.insertAtBeginning(new Student("221067341", "Simon", "Documents", 4));
        list.displayStudents();

        System.out.println("\n--- 3. Insert at POSITION 3: Anna ---");
        list.insertAtPosition(new Student("222098765", "Anna", "Registration", 10), 3);
        list.displayStudents();

        System.out.println("\n--- 4. DELETE position 4 (Tomas) ---");
        list.deleteStudent(4);
        list.displayStudents();

        System.out.println("\n--- 5. SEARCH for 222034512 (Tomas - deleted) ---");
        Student found = list.searchStudent("222034512");
        System.out.println(found == null ? "Not found" : "Found: " + found);

        System.out.println("\n--- 6. SEARCH for 221067341 (Simon) ---");
        found = list.searchStudent("221067341");
        System.out.println(found == null ? "Not found" : "Found: " + found);

        System.out.println("\n--- 7. TRAVERSAL: final list ---");
        list.displayStudents();
    }
}