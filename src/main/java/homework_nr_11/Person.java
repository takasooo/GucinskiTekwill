package homework_nr_11;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private boolean isPayedByTheHour;


    public Person(String name, String surname, Integer age, boolean isPayedByTheHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByTheHour = isPayedByTheHour;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isPayedByTheHour() {
        return isPayedByTheHour;
    }

    public void setPayedByTheHour(boolean payedByTheHour) {
        isPayedByTheHour = payedByTheHour;
    }
}
