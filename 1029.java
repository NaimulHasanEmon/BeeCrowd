import java.util.Scanner;

class Fib {
    int count = 0, calls = 0;

    public int fib(int n) {
        if (n == 0 || n == 1) {
            count++;
            return n;
        } else {
            count++;
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public int getCount() {
        int result = count;
        count = 0;
        return result - 1;
    }

    public int getCalls() {
        return calls;
    }

    public void setCalls() {
        calls = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Fib f = new Fib();
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int result = f.fib(n);
            int count = f.getCount();
            System.out.printf("fib(%d) = %d calls = %d\n", n, count, result);
            f.setCalls();
        }
        sc.close();
    }
}
