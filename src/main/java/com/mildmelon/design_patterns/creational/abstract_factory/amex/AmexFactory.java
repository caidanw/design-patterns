package com.mildmelon.design_patterns.creational.abstract_factory.amex;

import com.mildmelon.design_patterns.creational.abstract_factory.CardType;
import com.mildmelon.design_patterns.creational.abstract_factory.CreditCard;
import com.mildmelon.design_patterns.creational.abstract_factory.CreditCardFactory;
import com.mildmelon.design_patterns.creational.abstract_factory.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }
}
