package homework_nr_6;

public class Main {

    public static void main(String[] args) {

        Invoice i1 = new Invoice("Asus", "Computer", -1, 299.9 );

        System.out.println(i1.getAmount());

        Date d1 = new Date(3, 11, 2023);

        d1.displayDate();

    }
}
