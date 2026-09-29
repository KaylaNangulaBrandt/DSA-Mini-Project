public class ArrayStatistics {

    public static void main(String[] args) {

        // Service times (in minutes) of students served today
        int[] serviceTimes = {12, 5, 8, 4, 10, 6, 15, 3, 7, 9, 11, 2};

        int totalStudents = 0;
        int totalServiceTime = 0;
        int highestServiceTime = serviceTimes[0];
        int lowestServiceTime = serviceTimes[0];
        int countLongerThan10 = 0;

        // Algorithmic traversal no built in max(), min(), or sum()
        for (int i = 0; i < serviceTimes.length; i++) {
            totalStudents = totalStudents + 1;
            totalServiceTime = totalServiceTime + serviceTimes[i];

            if (serviceTimes[i] > highestServiceTime) {
                highestServiceTime = serviceTimes[i];
            }

            if (serviceTimes[i] < lowestServiceTime) {
                lowestServiceTime = serviceTimes[i];
            }

            if (serviceTimes[i] > 10) {
                countLongerThan10 = countLongerThan10 + 1;
            }
        }

        double averageServiceTime = (double) totalServiceTime / totalStudents;

        System.out.println("========== TASK A4: DAILY STATISTICS ==========");
        System.out.println();
        System.out.println("Service times array: [12, 5, 8, 4, 10, 6, 15, 3, 7, 9, 11, 2]");
        System.out.println();
        System.out.println("Total students served:            " + totalStudents);
        System.out.println("Total service time:               " + totalServiceTime + " min");
        System.out.println("Average service time:             " + String.format("%.2f", averageServiceTime) + " min");
        System.out.println("Highest service time:             " + highestServiceTime + " min");
        System.out.println("Lowest service time:              " + lowestServiceTime + " min");
        System.out.println("Number of services > 10 minutes:  " + countLongerThan10);
    }
}
