public class Multiples {

    public static int main(int count) {
        for (int i = 1; i < 1000; i++) {
            count = doMultiples(count, i);
        }
        // System.out.println(count);
        return count;
    }

    private static int doMultiples(int count, int i) {
        boolean multipleOf3 = i % 3 == 0;
        boolean multipleOf5 = i % 5 == 0;

        if (multipleOf3 || multipleOf5) {
            count++;
        }
        return count;
    }
}
