package currency_new;

public class Euro extends Currency implements IsFreeConverted{
    public Euro(double externalKursNBU) {
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