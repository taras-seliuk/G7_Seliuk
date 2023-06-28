package lesson_5_HW4;

import java.util.ArrayList;

public class Worker {
    public Integer findMaxValue(ArrayList<Integer> list) {
        int max = list.get(0);

        for (Integer i : list) {
            max = Math.max(max, i);
        }

        System.out.println("Maximum value in the list: " + max);
        return max;
    }

    public ArrayList<Integer> reverseOfList(ArrayList<Integer> list) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            resultList.add(list.get(i));
        }
        System.out.println(resultList);
        return resultList;
    }

}

