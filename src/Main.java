import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayac = 1;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                System.out.print(i + " ");
                sayac = 1;
            } else {
                sayac = 1;
            }
        }
    }
}

