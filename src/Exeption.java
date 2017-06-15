import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Exeption   {
    public static void main(String[] args) throws DivisionByZero {
    int i=2;
        @NotNull String s=null;
    try {
        System.out.println(i / 0);
        throw new DivisionByZero("Division by zero");

    } catch (ArithmeticException divisionByZero) {
        divisionByZero.printStackTrace();
        throw new DivisionByZero("Division by zero");
    }


    }

    private static class DivisionByZero extends Throwable {
        DivisionByZero(String s) {
            super(s);
            System.out.println("You can't divide by zero");
        }


    }
}

