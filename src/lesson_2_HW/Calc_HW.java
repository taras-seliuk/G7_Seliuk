package lesson_2_HW;

public class Calc_HW {
    public static int multiplicationDoubled(int var1, int var2) {
        int result = (var1 * var2) * 2;
        System.out.println("Result of doubled multiplecation is " + result);
        return result;
    }

    public static int subtractionDoubled(int var1, int var2) {
        int result = (var1 - var2) * 2;
        System.out.println("Result of doubled subtraction is " + result);
        return result;
    }

    public int divisionDoubled(int var1, int var2) {
        try {
            int result = (var1 / var2) * 2;
            System.out.println("Result of doubled division is " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("ERROR " + e);
            return 88888;
        } catch (Exception e) {
            System.out.println("ERROR " + e);
            return 99999;
        }
    }

    public double divisionDoubled(double var1, double var2) {
        if (var2 == 0) {
            System.out.println("ERROR " + 88888);
            int e = 88888;
            return e;
        } else {
            try {
                double result = (var1 / var2) * 2;
                System.out.println("Result of doubled division is (double) " + result);
                return result;
            } catch (ArithmeticException e) {
                System.out.println("ERROR " + e);
                return 88888;
            } catch (Exception e) {
                System.out.println("ERROR " + e);
                return 99999;
            }
        }

    }


}
