package currency_new;

public class Som extends Currency implements IsFreeConverted{
    public Som(double externalKursNBU){
        super(externalKursNBU);
    }
    @Override
    String getCurrencyName() {
        return "Som";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
