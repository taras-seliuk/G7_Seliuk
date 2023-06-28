package currency;

public class Dollar extends Currency{
    public Dollar(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Euro";
    }
}
