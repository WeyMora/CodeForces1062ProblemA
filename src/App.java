import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        String[] data = new String[firstNumber];
        for (int i = 0; i < firstNumber; i++) {
            data[i] = scanner.nextLine();
        }

        for (int i = 0; i < data.length; i++) {
            String[] a = data[i].split("\\s+");

            if (a.length != 4) {
                System.out.println("NO");
            } else if (a[0].equals(a[1]) && a[1].equals(a[2]) && a[2].equals(a[3])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}   