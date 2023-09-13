public class Multiples {

    public int main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleof5 = i % 5 == 0;

            if (multipleOf3 || multipleof5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
