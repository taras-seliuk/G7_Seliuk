package lesson_2_HW;

public class MainClass_HW {
    public static void main(String[] args) {
        double x = 550;
        double y = 10;
        double z = 15;
        double q = -999.77;
        Calc_HW calc_hw = new Calc_HW();
        /*int multiRez = Calc_HW.multiplicationDoubled(2,2);
        int subtrRez = Calc_HW.subtractionDoubled(2,3);
        //int divRez = calc_hw.divisionDoubled(10,2);
        Number divRezDouble = (double) calc_hw.divisionDoubled(999124.5,3.6665);*/
        int rez1 = Calc_HW.subtractionDoubled((int)q,(int)x);
        int rez2 = Calc_HW.subtractionDoubled(rez1,(int)y);
        int rez = calc_hw.divisionDoubled(40,15);


        //Number rez = calc_hw.divisionDoubled();
        System.out.println(rez);




    }
}
