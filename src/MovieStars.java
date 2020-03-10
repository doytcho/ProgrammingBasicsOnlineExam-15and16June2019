import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = 0;
        double budjet = Double.parseDouble(scan.nextLine());
        String imput = scan.nextLine();
        while (!imput.equals("ACTION")) {
            if (imput.length() > 15) {
                salary = 0.2 * budjet;
            } else {
                salary = Double.parseDouble(scan.nextLine());
            }
            budjet -= salary;
            if (budjet < 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(budjet));
                break;
            }
            imput = scan.nextLine();
        }
        if (budjet >= 0) {
            System.out.printf("We are left with %.2f leva.", budjet);
        }
    }
}
