package currency_new;

public class CurrencyExchange {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(38);
        Euro euro = new Euro(41);
        Som som = new Som(3);

        ListOfCurrency.addCurrence(dollar);
        ListOfCurrency.addCurrence(euro);
        ListOfCurrency.addCurrence(som);

        final int EXIT_NUMBER = 100;
        int currencyNumber;
        do{
            MenuCurrency.printCurrencyMenu();
            currencyNumber = MenuCurrency.getNumbetFromConsole();

            System.out.println("Was entered " + currencyNumber);
        }while (currencyNumber != EXIT_NUMBER);

        System.out.println("Goodbye!");



    }
}
