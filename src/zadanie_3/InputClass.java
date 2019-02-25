package zadanie_3;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.valueOf;

public class InputClass {
    public HashMap<Integer, Custumers> readData(String s) throws IOException {
        HashMap<Integer, Custumers> lista = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(s));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            Custumers custumers = readCustumer(line);
            lista.put(custumers.getId(), custumers);
        }
        bufferedReader.close();
        return lista;
    }

    private Custumers readCustumer(String line) {
        Custumers custum;
        String[] d = line.split(";");
        System.out.println(Arrays.toString(d));
        custum = new Custumers(Integer.valueOf(d[0]), d[1], d[2], Integer.valueOf(d[3]));
        return custum;
    }

}
