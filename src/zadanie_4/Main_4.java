package zadanie_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        File file = new File("liczby.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        System.out.println();
        System.out.println(list);
    }

}

