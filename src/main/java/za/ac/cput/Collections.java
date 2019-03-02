package za.ac.cput;

import java.util.*;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * Kaylen Abrahams
 * Student Number: 216054664
 * Group: 3G
 *
 */
public class Collections {

        public static void main(String[] args) {

        List cars = new ArrayList();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");

        displayAll(cars);

        Set fruit = new HashSet();

        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");

        displayAll(fruit);

        Map colors = new HashMap();

        colors.put("b", "blue");
        colors.put("r", "red");
        colors.put("y", "yellow");

        displayAll(colors.keySet());
        displayAll(colors.values());

    }

    static void displayAll(Collection col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }
        System.out.println();
    }
}

