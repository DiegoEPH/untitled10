public class MainController {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wert von i: " + i);
            if (i == 3) {
                System.out.println("Holdriho!");
            }
        }


        printSomeNumbers();
        printNumbers(5, 10);
        int sum = sumUp(1, 5);
        System.out.println("Summe: " + sum);
    }

    public static void printSomeNumbers() {
        for (int i = 6; i <= 23; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static int sumUp(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}