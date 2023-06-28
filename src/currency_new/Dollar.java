package currency_new;

public class Dollar extends Currency implements IsFreeConverted{
    public Dollar(double externalKursNBU) {
        super(externalKursNBU);

    }

    @Override
    String getCurrencyName() {
        return null;
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
