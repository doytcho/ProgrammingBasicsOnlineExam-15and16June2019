import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serial = scan.nextLine();
        int sesons = Integer.parseInt(scan.nextLine());
        int epizods = Integer.parseInt(scan.nextLine());
        double duration = Double.parseDouble(scan.nextLine());
        double totalTime = duration * sesons * epizods * 1.2 + sesons * 10;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serial, Math.floor(totalTime));
    }
}
