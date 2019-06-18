package com.mildmelon.design_patterns.creational.abstract_factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class AbstractFactoryTest {

    @Test
    public void createCreditCards() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard platinumCard = abstractFactory.getCreditCard(CardType.PLATINUM);
        log.info(String.valueOf(platinumCard.getClass()));

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard goldCard = abstractFactory.getCreditCard(CardType.GOLD);
        log.info(String.valueOf(goldCard.getClass()));
    }

}
