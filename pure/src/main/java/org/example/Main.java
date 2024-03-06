package org.example;

import java.util.Currency;
import java.util.Locale;
import org.example.dto.Money;

public class Main {


  public static void main(String[] args) {
    Currency yen = Currency.getInstance(Locale.JAPAN);
    Money money = new Money(100, yen);
    System.out.println(String.valueOf(money.getAmount()) + money.getCurrency());
  }
}