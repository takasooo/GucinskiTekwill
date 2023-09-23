package homework_nr_7;

public class Main {

    public static void main(String[] args) {

        Manager m1 = new Manager("Devon", "Larratt", "Technosoft", 5, "Arm");
        Programmer p1 = new Programmer("Denis", "Cyplenkov", "Technosoft", "Java", 5);

        Person[] employees = new Person[]{
                m1, p1
        };

        for(int i = 0; i < employees.length; i++){
            if(employees[i] instanceof Manager tempObject)
                tempObject.work();
        }
    }
}
