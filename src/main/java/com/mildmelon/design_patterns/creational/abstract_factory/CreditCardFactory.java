package com.mildmelon.design_patterns.creational.abstract_factory;

import com.mildmelon.design_patterns.creational.abstract_factory.amex.AmexFactory;
import com.mildmelon.design_patterns.creational.abstract_factory.visa.VisaFactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);

}
