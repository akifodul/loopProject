import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("count: " + count);

        if (count > 0) {
            int average = sum / count;
            System.out.println("0'dan " + n + "'e kadar 3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("0'dan " + n + "'e kadar 3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
