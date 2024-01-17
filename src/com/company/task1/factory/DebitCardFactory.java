package com.company.task1.factory;

import com.company.task1.card.DebitCard;

public class DebitCardFactory implements CardFactory {

    @Override
    public DebitCard createCard(int number) {
        return new DebitCard(number);
    }
}
