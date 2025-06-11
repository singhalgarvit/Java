package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Declaring an ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        //Add new Element
        l1.add(5);
        l1.add(6);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        l1.add(12);
        l1.add(34);
        System.out.println(l1);

        //get an Element at index i
        System.out.println(l1.get(3));

        //get size of arryList
        System.out.println(l1.size());

        //adding an element at index i 
        l1.add(2,100);
        System.out.println(l1);

        //modifying an element at index i
        l1.set(2,-12 );
        System.out.println(l1);

        //removing an element at index i
        l1.remove(2);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);

        //checking if an element exist
        System.out.println(l1.contains(3));
    }
}
