public class MainController {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wert von i: " + i);
            if (i == 3) {
                System.out.println("Holdriho!");
            }
        }


        printSomeNumbers();
    }

    public static void printSomeNumbers() {
        for (int i = 6; i <= 23; i++) {
            System.out.println(i);
        }

}
}