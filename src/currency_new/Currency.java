package currency_new;

abstract public class Currency {
    private double kursNBU;
    public double marga =1.1;// 10 %


    public Currency(double externalKursNBU){
        kursNBU=externalKursNBU;
        setMarga(marga);
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
        if (!(this instanceof IsFreeConverted)){
//знак ! для того, щоб заходити в об'єкт, коли не має цієї властивості
            this.marga = marga*1.2;
            System.out.println("This is Not real currency! ");
            System.out.println("So marga is changed. Current marga = " + this.marga);
        }else {
            if ((((IsFreeConverted)this).isFreeConv()==false)){
//this це об'єкт, з якого ми прийшли.(IsFreeConverted)this - цим вказуєм,що this буде мати властивості
                this.marga = marga*1.1;
                System.out.println("This is Not free converted currency");
                System.out.println("So marga is changed. Current marga = " + this.marga);
            }
        }
    }
    public double getKursSell() {
        return kursNBU / marga;
    }
    public double getKursBuy(){
        return kursNBU*marga;
    }
    abstract String getCurrencyName();
    public double exchangeGrnToCurrency(double numberOfGrn){
        Double tempResult = numberOfGrn / getKursBuy();
        System.out.println(String.format("For %s Grn you get %s %s by kurs %s (marga%s) ", numberOfGrn,tempResult,getKursBuy(),getCurrencyName(),marga));

        return tempResult;
    }
    public double exchangeCurrencyToGrn(double numberOfCurrency){
        Double tempResult = numberOfCurrency*getKursSell();

        System.out.println(String.format("For %s %s you get %s Grn by kurs %s (marga %s)" ,
                numberOfCurrency,getCurrencyName(),tempResult,getKursSell(),marga ));

        return tempResult;
    }

}