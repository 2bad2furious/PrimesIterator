public class PrimesIterable implements Iterable<Integer> {
    @Override
    public PrimesIterator iterator() {
        return new PrimesIterator();
    }
}
