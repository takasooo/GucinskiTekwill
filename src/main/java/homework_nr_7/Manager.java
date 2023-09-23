package homework_nr_7;

public class Manager extends Employee{

    private int teamSize;
    private String teamName;

    public Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        setTeamName(teamName);
        setTeamSize(teamSize);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void work() {
        System.out.println("The manager has a team of: " + teamSize + " people and its name is: " + teamName + ".");
    }
}
