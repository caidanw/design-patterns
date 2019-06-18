package com.mildmelon.designpatterns.creational.factory;

import com.mildmelon.designpatterns.creational.factory.websites.Blog;
import com.mildmelon.designpatterns.creational.factory.websites.Shop;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }

}
