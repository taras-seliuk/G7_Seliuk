package currency_new;

import java.util.Scanner;

public class Menu {
    public static int getNumbetFromConsole() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch (Exception e){
            return 0;
        }

    }
}
