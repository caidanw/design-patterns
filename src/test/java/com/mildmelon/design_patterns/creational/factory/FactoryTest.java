package com.mildmelon.design_patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class FactoryTest {

    @Test
    public void createWebsites() {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        Assert.assertNotNull(blog);

        log.info("Blog:");
        log.info(String.valueOf(blog.getPages()));

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        Assert.assertNotNull(shop);

        log.info("Shop:");
        log.info(String.valueOf(shop.getPages()));
    }

}
