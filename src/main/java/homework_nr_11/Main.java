package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {

        Person p1 = new Person("Alina", "Rain", 20, true);
        Person p2 = new Person("Damian", "Garmon", 21, false);
        Person p3 = new Person("Carl", "Ticket", 43, false);
        Person p4 = new Person("Sinthia", "Good", 37, true);
        Person p5 = new Person("Ramon", "Pool", 31, false);
        Person p6 = new Person("Liam", "Garmin", 25, true);
        Person p7 = new Person("Sarah", "Thor", 34, true);
        Person p8 = new Person("Luck", "Skywalker", 27, false);
        Person p9 = new Person("Tasha", "James", 43, true);
        Person p10 = new Person("Simon", "Swap", 23, true);

        List<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        List<String> isOlderThat25AndIsPayedHourlyList = personList.stream()
                .filter(e -> e.isPayedByTheHour() && e.getAge() > 25)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(isOlderThat25AndIsPayedHourlyList);

        List<Person> IsOlderThan30AndTheSurnameStartsWithLetterAList = personList.stream()
                .filter(e -> e.getAge() > 30 && e.getSurname().startsWith("A"))
                .collect(Collectors.toList());

        Optional<Person> firstPersonAge37 = personList.stream()
                .filter(e -> e.getAge() == 37)
                .findFirst();

        if (firstPersonAge37.isPresent()) {
            System.out.println(firstPersonAge37.get().getName());
        } else {
            throw new IllegalArgumentException();
        }
    }
}
