package patterns.generate.adapter;

import patterns.generate.adapter.convert.ConverterUsdToRubToTaxModel;
import patterns.generate.adapter.model.TaxAdapter;
import patterns.generate.adapter.model.TaxModel;
import patterns.generate.adapter.model.UsdToRub;

public class AdapterExample {

    public static String MY_BANK_NAME = "Мой-Банк";


    public static void main(String[] args) {
        UsdToRub usdToRub =  UsdToRubService.getActual();
        TaxAdapter taxAdapter = new TaxAdapter();
        TaxModel tm = ConverterUsdToRubToTaxModel.convert(usdToRub);
        taxAdapter.sendData(tm);
    }



}
