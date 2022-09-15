import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesA = new ArrayList<>();
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        for (int i = 0; i < namesA.size(); i++) {
            System.out.println("List A: " + namesA.get(i));
        }
        ArrayList<String> namesB = new ArrayList<>();
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        for (int i = 0; i < namesB.size(); i++) {
            System.out.println("List B: " + namesB.get(i));
        }
        ArrayList<String> namesC = new ArrayList<>();
        Collections.reverse(namesB);
        Iterator<String> iterA = namesA.iterator();
        Iterator<String> iterB = namesB.iterator();
        for (int i = 0; i < namesA.size(); i++) {

            namesC.add(iterA.next());
            namesC.add(iterB.next());
        }
        System.out.println(namesC);
        Collections.sort(namesC , new User());
        System.out.println("Sortirovka: "+namesC);

    }
}