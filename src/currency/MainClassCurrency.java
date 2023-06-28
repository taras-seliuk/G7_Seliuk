package currency;

    public class MainClassCurrency {
        public static void main(String[] args) {
            Dollar dollar = new Dollar(28.2);
            System.out.println(dollar.getKursNBU());
            dollar.setKursNBU(29.0);
            System.out.println(dollar.getKursNBU());

            System.out.println(dollar.getMarga());

            dollar.exchangeGrivnaToCurrency(3000);
            dollar.exchangeCurrencyToGrivna(100);

            Euro euro = new Euro(41);
            euro.exchangeCurrencyToGrivna(100);



        }
    }

