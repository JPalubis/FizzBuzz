public class Reduce {
    public static int main(int n) {
        int steps = 0;
        for (; n > 0; steps++) {
            n = doReduce(n);
        }
        return steps;
    }

    private static int doReduce(int n) {
        if (n % 2 == 1) {
            n--;
        } else {
            n = n / 2;
        }
        return n;
    }
}
