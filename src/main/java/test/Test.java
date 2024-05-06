package test;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
// import org.jetbrains.annotations.NotNull;
// import javax.annotation.Nonnull;
// import javax.annotation.Nullable;
// import javax.annotation.ParametersAreNonnullByDefault;
import test.test2.Test12;

//@ParametersAreNonnullByDefault
public class Test {

    public static class Test12 {

        public String x;
    }

    public static void test(Test12 test) {}

    public static void main(String[] args) {
        var lst = new Test12();
        System.err.println(lst.x);
        test(null);
    }
}
