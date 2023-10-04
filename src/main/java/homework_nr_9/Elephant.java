package homework_nr_9;

public class Elephant implements Animal{

    @Override
    public void makeSound() {
        System.out.println("The elephant is trumpeting.");
    }

    @Override
    public void isMoving() {
        System.out.println("The elephant is slowly walking.");
    }

    @Override
    public void isEating() {
        System.out.println("The elephant is eating plants.");
    }


}
