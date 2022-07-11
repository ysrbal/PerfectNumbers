import java.util.Scanner;

public class MukemmelSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int j = 0;

        System.out.print("Bir Sayi Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j += i;
            }
        }
        if (j - n == n) {
            System.out.println(n + " Mukemmel Sayidir.");
        } else {
            System.out.println(n + " Mukemmel Sayi Degildir.");
        }
    }
}

