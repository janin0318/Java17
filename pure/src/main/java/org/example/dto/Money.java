package org.example.dto;

import java.util.Currency;
import java.util.Objects;

public class Money {

  private final int amount;
  private final Currency currency;

  public Money (final int amount, final Currency currency) {
    if (amount < 0) {
      throw new IllegalArgumentException("金額が0以下です。");
    }
    if (Objects.isNull(currency)) {
      throw new IllegalArgumentException("通貨を指定してください。");
    }
    this.amount = amount;
    this.currency = currency;
  }

  public Money add(Money other) {
    if (!this.currency.equals(other.currency)) {
      throw new IllegalArgumentException("通貨単位が違います。");
    }

    final int added = this.amount + other.amount;
    return new Money(added, this.currency);
  }

  public int getAmount() {
    return amount;
  }

  public Currency getCurrency() {
    return this.currency;
  }
}
