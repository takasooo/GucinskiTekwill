package homework_nr_13;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        Airplane.createAirplaneLYBL("Boeing", "A304", 3);
        Airplane.createAirplaneEAFP("", "195", 4);
        Airplane.createAirplaneLYBL("Airbus", "", 2);
        Airplane.createAirplaneEAFP("Airbus", "A400M", 0);

        countDivisibleBy7Numbers(7, 70);
        countDivisibleBy7Numbers(70, 7);
    }

    public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws Exception {
        List<Integer> correctNumbers = new ArrayList<>();
        if (inferiorLimit > superiorLimit)
            throw new InvalidRangeException("Invalid range.");
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0)
                correctNumbers.add(i);
        }
        System.out.println("The list of numbers is: " + correctNumbers);
        System.out.println("The count of numbers is: " + correctNumbers.size());
    }
}
