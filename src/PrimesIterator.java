import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesIterator implements Iterator<Integer> {
    
    private final List<Integer> primeCache = new ArrayList<>();
    private int i = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        do {
            i++;
        } while (!isPrime(i));
        primeCache.add(i);
        return i;
    }

    private boolean isPrime(int i) {
        int sqroot = (int) Math.sqrt(i);
        /*for (int prime : primeCache) {
            if (prime > sqroot) break;
            if (i % prime == 0) return false;
        }
        return true;*/
        return primeCache.stream()
                .takeWhile(prime -> prime <= sqroot) // this works as long as the cache is sorted
                .noneMatch(prime -> i % prime == 0);
    }
}
