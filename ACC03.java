import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ACC03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        List<Long> steppingNumbers = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            generateSteppingNumbers(i, n, m, steppingNumbers);
        }

        Collections.sort(steppingNumbers);
        for (long num : steppingNumbers) {
            System.out.print(num + " ");
        }
    }

    public static void generateSteppingNumbers(long num, long n, long m, List<Long> steppingNumbers) {
        if (num > m) return;

        if (num >= n) {
            steppingNumbers.add(num);
        }

        long lastDigit = num % 10;

        if (lastDigit > 0) {
            generateSteppingNumbers(num * 10 + (lastDigit - 1), n, m, steppingNumbers);
        }
        if (lastDigit < 9) {
            generateSteppingNumbers(num * 10 + (lastDigit + 1), n, m, steppingNumbers);
        }

    }
}
