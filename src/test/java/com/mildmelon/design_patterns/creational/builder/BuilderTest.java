package com.mildmelon.designpatterns.creational.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class BuilderTest {

    @Test
    public void buildsFullLunchOrder() {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.meat("Ham").bread("Wheat").dressing("Mustard").condiments("Lettuce");

        LunchOrder lunchOrder = builder.build();

        log.info("Lunch Order:");
        log.info(lunchOrder.getMeat());
        log.info(lunchOrder.getBread());
        log.info(lunchOrder.getDressing());
        log.info(lunchOrder.getCondiments());
    }

    @Test
    public void buildsPartialLunchOrder() {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.meat("Ham").bread("Wheat");

        LunchOrder lunchOrder = builder.build();

        log.info("Lunch Order:");
        log.info(lunchOrder.getMeat());
        log.info(lunchOrder.getBread());
        log.info(lunchOrder.getDressing());
        log.info(lunchOrder.getCondiments());
    }

}
