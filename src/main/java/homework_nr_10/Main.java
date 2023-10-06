package homework_nr_10;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


        Predicate<Integer> testIfNumberIsOdd = (Integer i) -> {
            return i % 2 != 0;
        };

        Consumer<String> returnInputString = (String s) -> {
            System.out.println(s);
        };

        Function<Integer, Integer> multiplyByTwo = (Integer i) -> {
            return i * 2;
        };

        Supplier<Integer> getRandomNumber = () -> {
            Random random = new Random();
            return random.nextInt();
        };

        predicateTest(3, testIfNumberIsOdd);
        consumerTest("Larratt", returnInputString);
        functionTest(4, multiplyByTwo);
        Integer randomNumber = supplierTest(getRandomNumber);
        System.out.println(randomNumber);

        System.out.println("--------------------------------");

        Employee e1 = new Employee("Ben", "Aflek", 21, "Software Engineering");


        Predicate<Employee> checkIfDepartmentIsSoftwareEngineering = (Employee e) -> {
            return e.department.equals("Software Engineering");
        };

        Predicate<Employee> checkIfOlderThanTwenty = (Employee e) -> {
            return e.age > 20;
        };

        Predicate<Employee> checkIfNameStartsWithA = (Employee e) -> {
            return e.name.startsWith("A");
        };

        testEmployee(e1, checkIfDepartmentIsSoftwareEngineering);
        testEmployee(e1, checkIfOlderThanTwenty);
        testEmployee(e1, checkIfNameStartsWithA);

    }

    public static void testEmployee(Employee e, Predicate<Employee> testMethod){
        if(testMethod.test(e))
            System.out.println("The employee " + e.name + " " + e.surname + " is matching the requirement.");
        else
            System.out.println("The employee " + e.name + " " + e.surname + " is not matching the requirement.");
    }

    public static void predicateTest(Integer i, Predicate<Integer> predicate) {
            if (predicate.test(i))
                System.out.println(i + " The number is odd.");
            else
                System.out.println("The number is not odd.");
    }

    public static void consumerTest(String s, Consumer<String> consumer) {
        consumer.accept(s);
    }

    public static void functionTest(Integer i, Function<Integer, Integer> function) {
        System.out.println(function.apply(i));
    }

    public static int supplierTest(Supplier<Integer> supplier){
        return supplier.get();
    }

}
