import java.util.Iterator;

public class PrimesIterator implements Iterator<Integer> {

    private int i = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int j = i + 1;
        for (; !isPrime(j); j++) ;
        i = j;
        return i;
    }


    public static void main(String[] args) {
        for (int prime : new PrimesIterable()) {
            System.out.println(prime);
        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
