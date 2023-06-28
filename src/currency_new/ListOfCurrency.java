package currency_new;

import java.util.HashMap;

public class ListOfCurrency {
    //клас, в якому зберігається список валют
    private static HashMap<String, Currency> currencyHashMap = new HashMap<>();


    public static void addCurrence(Currency currency) {
        //сюди передаєм об'єкт, який наслідується від Currency
        currencyHashMap.put( currency.getCurrencyName() , currency);

    }

    public static HashMap<String, Currency> getCurrencyHashMap() {
        return currencyHashMap;
    }

    ;


}
