public class Reduce {
    public int main(int n) {
        int steps = 0;
        for (; n > 0; steps++) {
            if (n % 2 == 1) {
                n--;
            } else {
                n = n / 2;
            }
        }
        return steps;
    }
}
