package homework_nr_12;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Months.values()));

        System.out.println(FuelTypes.GASOLINE.isLiquid());
        System.out.println(FuelTypes.LPG.isLiquid());

        int x = 3;
        int y = 2;
        int z = -1;

        checkAndPrintResult(x, CheckInteger.CHECK_IF_ODD);
        checkAndPrintResult(y, CheckInteger.CHECK_IF_ODD);
        checkAndPrintResult(y, CheckInteger.CHECK_IF_EVEN);
        checkAndPrintResult(x, CheckInteger.CHECK_IF_EVEN);
        checkAndPrintResult(x, CheckInteger.CHECK_IF_POSITIVE);
        checkAndPrintResult(z, CheckInteger.CHECK_IF_POSITIVE);
        checkAndPrintResult(z, CheckInteger.CHECK_IF_NEGATIVE);
        checkAndPrintResult(x, CheckInteger.CHECK_IF_NEGATIVE);
    }

    public static void checkAndPrintResult(int x, CheckInteger checkInteger){
        System.out.println("The answer is: " + checkInteger.getCheckInteger().test(x));
    }

}

