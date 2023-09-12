package homework_nr_4;

public class Circle {

    public static void main(String[] args) {

        Circle Pizza = new Circle(3);
        System.out.println(Pizza.calculateArea());
    }

    float radius;
    float pi = 3.14f;

    public float calculateArea(){
        return pi * (radius * radius);
    }

    public Circle(float radius){
        this.radius = radius;
    }
}

