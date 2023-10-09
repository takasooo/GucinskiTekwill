package homework_nr_8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(getToDoList());

        System.out.println(uniqueValues(getToDoList()));


        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("key", "cheie");
        dictionary.put("car", "masina");
        dictionary.put("human", "om");
        dictionary.put("man", "barbat");
        dictionary.put("woman", "femeie");
        dictionary.put("microphone", "microfon");
        dictionary.put("plane", "avion");
        dictionary.put("phone", "telefon");
        dictionary.put("water", "apa");
        dictionary.put("window", "fereastra");

        System.out.println("Phone in romanian is " + dictionary.get("phone"));

    }

    public static ArrayList<String> getToDoList(){

        ArrayList<String> toDoList = new ArrayList<>();

        toDoList.add("Resolve homework");
        toDoList.add("Clean the room");
        toDoList.add("Java Course");
        toDoList.add("Java Course");

        return toDoList;
    }

    public static Set<String> uniqueValues(List<String> inputList){
        HashSet<String> uniqueValues = new HashSet<>();
        for (String value:
             inputList) {
            uniqueValues.add(value);
        }
        return uniqueValues;
    }
}
