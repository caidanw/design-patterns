package com.mildmelon.design_patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class SingletonTest {

    @Test
    public void isSameInstance() {
        Singleton instance1 = Singleton.getInstance();
        log.info("Created singleton: instance1");

        Singleton instance2 = Singleton.getInstance();
        log.info("Created singleton: instance2");

        Assert.assertSame(instance1, instance2);
    }

}
