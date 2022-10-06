public class TaskCounter {
    private static int nextCount = 0;
    public static void printThisTaskNumber() {
        nextCount++;
        System.out.printf("\n********* Задание № %d *********\n\n", nextCount);
    }
}
