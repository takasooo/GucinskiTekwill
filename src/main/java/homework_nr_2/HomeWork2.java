package homework_nr_2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        long currentWorldPopulation = 7811080815L;
        int carsProducedThisYear = 55235358;
        char firstLetterInAlphabet = 'A';
        boolean javaIsAmazing = true;
        float pi = 3.14159f;

        System.out.println(currentWorldPopulation);
        System.out.println(carsProducedThisYear);
        System.out.println(firstLetterInAlphabet);
        System.out.println(javaIsAmazing);
        System.out.println(pi);

        double price = 5.999d;
        double tax = 2.499d;
        int quantity = 500;
        double sum = 0;

        System.out.println(price);
        System.out.println(tax);
        System.out.println(quantity);
        System.out.println(sum);

        double total = price + tax * quantity + sum;
        System.out.println(total);
    }
}