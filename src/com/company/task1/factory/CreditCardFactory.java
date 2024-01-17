package com.company.task1.factory;

import com.company.task1.card.CreditCard;

public class CreditCardFactory implements CardFactory{
    @Override
    public CreditCard createCard(int number) {
        return new CreditCard(number);
    }
}
