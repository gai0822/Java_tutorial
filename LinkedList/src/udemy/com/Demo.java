package udemy.com;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        placeToVisit.add("Shanghai");
        placeToVisit.add("Tokyo");
        placeToVisit.add("Houston");
        placeToVisit.add("Altanta");
        placeToVisit.add("Dongying");
        placeToVisit.add("Qingdao");
        placeToVisit.add("Jinan");

        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }
}
