package Collection;

import iterator.Iterator;

/**
 * Created by n0ld on 17.06.2017.
 */
public interface collection<E> extends Iterator<E> {

    int length();
    boolean isEmpty();
    boolean setHead(E o);
//    boolean remove();

//    boolean equals(Object o);
}
