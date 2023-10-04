package homework_nr_9;

public class Main {

    public static void main(String[] args) {

        Elephant e1 = new Elephant();

        Animal.hangAround();
        e1.isMoving();
        e1.isEating();
        e1.makeSound();

        Herbivore Elephant = new Herbivore("Lucky", 5) {
            @Override
            public void isEating() {
                System.out.println("The elephant is eating plants.");
            }
        };

        Elephant.rest();
        Elephant.isEating();
    }
}
