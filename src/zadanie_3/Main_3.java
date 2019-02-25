package zadanie_3;

import java.io.IOException;
import java.util.*;

public class Main_3 {

    public static void main(String[] args) throws IOException {

        InputClass input = new InputClass();
        Map<Integer, Custumers> client = input.readData("klienci.csv");

        Set<Map.Entry<Integer, Custumers>> entrySet = client.entrySet();
        Collection<Custumers> values = client.values();

        Set<Integer> integers = client.keySet();
        System.out.println(integers);

        for (Map.Entry<Integer, Custumers> iCE : entrySet) {
            System.out.print(iCE.getKey() + ", ");
        }
        System.out.println();

        for (Custumers value : values) {
            System.out.println(value);
        }
        printCustumer(questionOfCustumer(), client);
//        Collection<Custumers> idCust = printCustumer(questionOfCustumer(), client);
//        if (idCust == null) {
//            System.out.println("Nie ma klietna o tym id");
//        } else {
//            System.out.println(idCust);
//        }
    }

    private static void printCustumer(int questionOfCustumer, Map<Integer, Custumers> client) {
        Collection<Custumers> idValues = client.values();
        Collection<Custumers> idVal = null;

        boolean isCuctumer = false;
        for (Custumers idValue : idValues) {
            if (idValue.getId() == questionOfCustumer) {
                isCuctumer = true;
//                    idVal = (Collection) idValue;
                System.out.println(idValue);
            }
        }
//        if (!isCuctumer) {
//            System.out.println("Nie ma klietna o tym id");
//        }
//        return idVal;
    }

    private static int questionOfCustumer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Którego klienta wylisować ? podaj ID");
        int id = 0;
        boolean ok = false;
        do {
            try {
                id = scanner.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("podaj liczbę");
            } finally {
                scanner.nextLine();
            }
        }
        while (!ok);
        return id;
    }
}
