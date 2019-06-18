package com.mildmelon.design_patterns.creational.abstract_factory.amex;

import com.mildmelon.design_patterns.creational.abstract_factory.CreditCard;
import com.mildmelon.design_patterns.creational.abstract_factory.Validator;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
