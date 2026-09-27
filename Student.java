public class Student {
    String studentNo;
    String name;
    String serviceType;
    int estimatedServiceTime;

    public Student(String studentNo, String name, String serviceType, int estimatedServiceTime) {
        this.studentNo = studentNo;
        this.name = name;
        this.serviceType = serviceType;
        this.estimatedServiceTime = estimatedServiceTime;
    }

    public String toString() {
        return studentNo + " | " + name + " | " + serviceType + " | " + estimatedServiceTime + " min";
    }
}