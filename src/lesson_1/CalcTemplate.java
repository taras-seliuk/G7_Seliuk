package lesson_1;

public class CalcTemplate {
    /**
     * // This method calculates the sum of two integers and prints the result
     * @param dodanok1
     * @param dodanok2
     */
    static void sum(int dodanok1, int dodanok2) {
        System.out.println("Result =  " + (dodanok1 + dodanok2));
    }
    /**
     * This method calculates the sum of two integers, doubles the result, and returns it
     * @param dodanok_sum
     * @param dodanok2
     * @return
     */
    public int sumDoubled(int dodanokDubled1, int dodanokDubled2) {
        int tempResult = (dodanokDubled1 + dodanokDubled2)*2;
        System.out.println("Result = " + tempResult);
        return tempResult;
    }
}
