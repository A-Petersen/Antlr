package tuple;

/**
 * Created by n0ld on 18.06.2017.
 */
public class Tuple<T, U> {
    public final T _1;
    public final U _2;

    public Tuple(T t, U u) {
        this._1 = t;
        this._2 = u;
    }
}
