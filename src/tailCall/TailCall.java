package tailCall;

import java.util.function.Supplier;

/**
 * Created by n0ld on 13.05.2017.
 */
public abstract class TailCall<T> {

    public abstract TailCall<T> resume();
    public abstract T eval();
    public abstract boolean isSuspend();

    private TailCall() {}

    public static class Return<T> extends TailCall<T> {

        private final T t;

        public Return (T t) {
            this.t = t;
        }

        public T eval() {
            return t;
        }

        public boolean isSuspend() {
            return false;
        }

        public TailCall<T> resume() {
            throw new IllegalStateException("Return has no resume");
        }
    }

    public static class Suspend<T> extends TailCall<T> {

        private final Supplier<TailCall<T>> resume;

        public Suspend (Supplier<TailCall<T>> resume) {
            this.resume = resume;
        }

        public T eval() {
            TailCall<T> tailRec = this;
            while (tailRec.isSuspend()) {
                tailRec = tailRec.resume();
            }
            return tailRec.eval();
        }

        public boolean isSuspend() {
            return true;
        }

        public TailCall<T> resume() {
            return resume.get();
        }

        public static <T> Suspend<T> sus (Supplier<TailCall<T>> s) {
            return new Suspend<>(s);
        }

        public static <T> Return<T> ret (T t) {
            return new Return<>(t);
        }
    }
}
