package currency;


public class Euro extends Currency {
    public Euro(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }
}
