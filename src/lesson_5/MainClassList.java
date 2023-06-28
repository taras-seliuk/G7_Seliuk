package lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassList {
    public static void main(String[] args) {
        List<String> lis_1 = new ArrayList<>();
        System.out.println(lis_1);
        lis_1.add("Test_1");
        lis_1.add("Test_2");
        lis_1.add("");
        lis_1.add("Test_4");
        System.out.println(lis_1);
        System.out.println("Line 2 = " + lis_1.get(1));
        lis_1.add(0,"Test 0");
        System.out.println(lis_1);
        lis_1.set(1,"Test 1");
        lis_1.set(2, lis_1.get(2) + " + additional info");
        System.out.println(lis_1);
        lis_1.remove(1);
        System.out.println(lis_1);
        System.out.println("----------------------------");
        for (int i = 0; i < lis_1.size(); i++) {
            System.out.println(i+1 + "." + lis_1.get(i));
        }
        System.out.println("--------------");

        for (String element: lis_1) {
            System.out.println(element);}

        System.out.println("--------------");
        int count = 1;
        for (String element: lis_1) {
        System.out.println(count + ". " + element);
        count++;
        }
        System.out.println("--------------");

        ArrayList<Integer> list2_int = new ArrayList<>();
        list2_int.add(22);
        list2_int.add(11);
        list2_int.add(66);
        list2_int.add(44);
        System.out.println(list2_int);
        System.out.println(Collections.min(list2_int));
        Collections.sort(list2_int);
        System.out.println(list2_int);
        Collections.reverse(list2_int);
        System.out.println(list2_int);

        Calc.returnValue(5);
        System.out.println("---The End---");
    }
}
