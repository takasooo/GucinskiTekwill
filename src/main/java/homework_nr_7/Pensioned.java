package homework_nr_7;

public abstract class Pensioned extends Person{

    private String retireDate;
    private String age;

    public Pensioned(String name, String surname, String retireDate, String age) {
        super(name, surname);
        setRetireDate(retireDate);
        setAge(age);
    }

    public String getRetireDate() {
        return retireDate;
    }

    public void setRetireDate(String retireDate) {
        this.retireDate = retireDate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
