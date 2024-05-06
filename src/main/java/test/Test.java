package test;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

// import org.jetbrains.annotations.NotNull;
// import javax.annotation.Nonnull;
// import javax.annotation.Nullable;
// import javax.annotation.ParametersAreNonnullByDefault;
public class Test {

    public static void test(Integer test) {}

    public static void main(String[] args) {
        //   var lst = new Test12();
        test(null);
    }
}
