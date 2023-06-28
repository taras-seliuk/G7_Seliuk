package currency_new;

public class Bitcoin extends Currency implements CryptoCurrency{
    public Bitcoin(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }


    @Override
    public boolean isCryptoCurrency() {
        return true;
    }

    @Override
    public double exchangeGrnToCurrency(double numberOfGrn){
        System.out.println(" заборонено нацбанком");
        return numberOfGrn;
    }

}