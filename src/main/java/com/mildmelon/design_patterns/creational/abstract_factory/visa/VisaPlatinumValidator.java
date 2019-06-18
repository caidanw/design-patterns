package com.mildmelon.design_patterns.creational.abstract_factory.visa;

import com.mildmelon.design_patterns.creational.abstract_factory.CreditCard;
import com.mildmelon.design_patterns.creational.abstract_factory.Validator;

public class VisaPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }

}
