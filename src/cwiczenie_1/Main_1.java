package cwiczenie_1;

import java.util.*;

public class Main_1 {
    public static void main(String[] args) {


        Queue<Person> persons = new LinkedList<>();
        persons.offer(new Person("Jan", "Kowalski", "666464"));
        persons.offer(new Person("Jan11", "Kowalski123", "32464"));
        persons.offer(new Person("Jan12", "Kowalski123", "63245"));


        while (!persons.isEmpty()) {
            System.out.println("Pacjent " + persons.peek() + " proszony do gabinetu");
            System.out.println("Pacjent " + persons.poll() + " obsłużony");
        }
    }


}
