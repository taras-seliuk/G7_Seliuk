package lesson_2;

public class CalcClass {
    public int sumDoubled(int dodanok1, int dodanok2) {
        int result = (dodanok1 + dodanok2)*2;
        System.out.println("Result (sumDoubled, int) = " + result);
        return result;
    }
    public String sumDoubled(String dodanok3, String dodanok4) {
        String result = dodanok3 + dodanok4 + dodanok3 + dodanok4;
        System.out.println("Result (sumDoubled, String) = " + result);
        return result;
    }
    public String sumDoubled(int dodanok5, String dodanok6) {
        String result = dodanok5 + dodanok6 + dodanok5 + dodanok6;
        System.out.println("Result (sumDoubled, int+String) = " + result);
        return result;
    }
    public int sumDoubled(String dodanok7, int dodanok8) {
        try{
            int result = (Integer.parseInt(dodanok7) + dodanok8)*2;
            System.out.println("Result (sumDoubled, String+int) = " + result);
            return result;
        }catch (NumberFormatException e) {
            System.out.println("ERROR " + e);
            return 888;
        }catch (Exception e) {
            System.out.println("ERROR " + e);
            System.out.println("Returned + " + 999);
            return 999;
        }finally {
            System.out.println("Block finally");
        }
    }
}
