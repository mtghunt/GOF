package patterns.generate.adapter.convert;

import patterns.generate.adapter.AdapterExample;
import patterns.generate.adapter.model.TaxModel;
import patterns.generate.adapter.model.UsdToRub;

public class ConverterUsdToRubToTaxModel {

    public static TaxModel convert(UsdToRub usdToRub){
        return new TaxModel(AdapterExample.MY_BANK_NAME + usdToRub.getValue());
    }
}
