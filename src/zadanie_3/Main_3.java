package zadanie_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main_3 {


    public static void main(String[] args) {
        HashMap<Integer, Custumers> client = new HashMap<>();

        Custumers custumers = new Custumers(154, "ksjfhd", "iseur", 607988984);
        client.put(custumers.getId(), custumers);

        Custumers custumers1 = new Custumers(153464, "ksjhd", "iseur", 45388984);
        client.put(custumers1.getId(), custumers1);

        Custumers custumers2 = new Custumers(1544, "sjfhd", "iseur", 63248984);
        client.put(custumers2.getId(), custumers2);

        Set<Map.Entry<Integer, Custumers>> entrySet = client.entrySet();
        Collection<Custumers> values = client.values();

        Set<Integer> integers = client.keySet();
        System.out.println(integers);

      //  Set<Map.Entry<Integer, Custumers>> entrySet1 = client.entrySet();

        for (Map.Entry<Integer, Custumers> integerCustumersEntry : entrySet) {
            System.out.println(integerCustumersEntry.getKey());
        }

        for (Custumers value : values) {
            System.out.println(value);
        }

        pytaniaOId(values);


    }

    private static void pytaniaOId(Collection<Custumers> values) {
        System.out.println("podaj id klinta" +
                "");
    }


}
