package CConverter.model;

import java.util.ArrayList;
import java.util.List;

public class Currency {

    private static Currency theCurrency;
    public static void setCurrency(Currency currency) {
        theCurrency = currency;
    }
    public static Currency getCurrency() {
        return theCurrency;
    }

    private List<String> allCurrencies = new ArrayList<String>();

    public Currency() {

    }

    public List<String> getAllCurrencies() {
        allCurrencies.add("US Dollar (USD)");
        allCurrencies.add("Euro (EUR)");
        allCurrencies.add("Great British Pound (GBP)");
        allCurrencies.add("Swiss Franc (CHF)");
        allCurrencies.add("Japanese Yen (JPY)");
        allCurrencies.add("Canadian Dollar (CAD)");

        return allCurrencies;
    }
}
