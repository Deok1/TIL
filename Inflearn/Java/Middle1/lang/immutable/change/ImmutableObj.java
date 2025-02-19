package lang.immutable.change;

import java.util.Objects;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
        /*
        ImmutableObj immutableObj = new ImmutableObj(result)
        return immutableObj
         */
    }
    public int getValue() {
        return value;
    }
}
