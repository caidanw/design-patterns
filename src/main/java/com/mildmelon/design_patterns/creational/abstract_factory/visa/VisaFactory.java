package com.mildmelon.design_patterns.creational.abstract_factory.visa;

import com.mildmelon.design_patterns.creational.abstract_factory.CardType;
import com.mildmelon.design_patterns.creational.abstract_factory.CreditCard;
import com.mildmelon.design_patterns.creational.abstract_factory.CreditCardFactory;
import com.mildmelon.design_patterns.creational.abstract_factory.Validator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
            default:
                return null;
        }
    }

}
