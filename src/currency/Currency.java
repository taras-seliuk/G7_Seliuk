package currency;

abstract public class Currency {
    private double kursNBU;
    public double marga = 1.1;// 10 %


    public Currency(double externalKursNBU) {
        kursNBU = externalKursNBU;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double getKursBuy() {
        return kursNBU * marga;
    }

    public double getKursSell() {
        return kursNBU / marga;
    }
abstract String getCurrencyName();
    public double exchangeGrivnaToCurrency(double numberOfGrivna) {
        Double tempResult = numberOfGrivna / getKursBuy();
        System.out.println(String.format("For %s Grn you get %s %s by kurs %s (marga %s)", numberOfGrivna, tempResult, getCurrencyName(), getKursBuy(), marga));

        return tempResult;
    }

    public double exchangeCurrencyToGrivna(double numberOfCurrency) {
        Double tempResult = numberOfCurrency * getKursSell();
        System.out.println(String.format("For %s %s you get %s Grn by kurs %s (marga %s)", getCurrencyName(), numberOfCurrency, tempResult, getKursBuy(), marga));
    return tempResult;
    }


}

