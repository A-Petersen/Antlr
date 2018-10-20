package iterator;

/**
 * Created by n0ld on 16.06.2017.
 */
public interface Iterator<E> {
    public boolean hasNext();
    public E next();
    public void remove(E e);
}
