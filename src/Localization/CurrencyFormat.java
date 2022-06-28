package Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("ngn","NGN"));
        String currency = numberFormat.format(700) ;
        System.out.println(currency);
    }
}
