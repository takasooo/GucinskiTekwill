package homework_nr_9;

public interface Animal {

    void isMoving();

    void isEating();

    static void hangAround(){
        System.out.println("The animal is hanging around.");
    }

    default void makeSound(){
    }
}
