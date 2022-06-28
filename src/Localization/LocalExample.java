package Localization;

import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class LocalExample {
    public static void main(String[] args) {

        long number = 5000000;

        System.out.println(((Object)number).getClass().getSimpleName());

        NumberFormat numberFormat = NumberFormat.getInstance();

        System.out.println(numberFormat.format(number));

        NumberFormat numberFormatLocal = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(numberFormatLocal.format(number));

        NumberFormat numberFormatCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(numberFormatCurrency.format(number));

        DateFormat Date = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
        System.out.println(Date.format(new Date()));

        Currency currencyCode = Currency.getInstance(Locale.CHINA);
        System.out.println(currencyCode);

        Currency currencyName = Currency.getInstance(Locale.CHINA);
        System.out.println(currencyName.getDisplayName());
    }

}