import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int tikets = Integer.parseInt(scan.nextLine());
        double tiketPrice = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());
        double totalSum = tiketPrice * days * tikets * (100 - percent) / 100;
        System.out.printf("The profit from the movie %s is %.2f lv.", movie, totalSum);
    }
}
