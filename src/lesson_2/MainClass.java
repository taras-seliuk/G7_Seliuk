package lesson_2;

public class MainClass {
    public static void main(String[] args) {
        CalcClass calcClass = new CalcClass();
        int rez1 = calcClass.sumDoubled(33,33);
        String rez2 = calcClass.sumDoubled(" Hello", " World!");
        String rez3 = calcClass.sumDoubled(3," копита ");
        int rez4 = calcClass.sumDoubled("95", 5);
        rez4 = calcClass.sumDoubled("9a5", 5) + 5;
        System.out.println(rez4);
        System.out.println("--- The End ---");
    }
}
