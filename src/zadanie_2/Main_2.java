package zadanie_2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj ile chcesz wprowadzić liczb ");
        int ileLiczby = scaner.nextInt();

        Queue<Integer> liczba = new PriorityQueue<>();

        for (int i = 0; i <ileLiczby ; i++) {
            int numbes = scaner.nextInt();
            liczba. offer(numbes);
        }

        while (!liczba.isEmpty()){
            System.out.println(Math.pow(liczba.poll(),2));
        }

    }

}
