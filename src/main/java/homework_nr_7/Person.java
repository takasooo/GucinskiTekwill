package homework_nr_7;

public abstract class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void printMyName(){

        System.out.println("My name is " + name + " " + surname + ".");
    }
}
