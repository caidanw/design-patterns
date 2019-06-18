package com.mildmelon.designpatterns.creational.factory.websites;

import com.mildmelon.designpatterns.creational.factory.Website;
import com.mildmelon.designpatterns.creational.factory.pages.CartPage;
import com.mildmelon.designpatterns.creational.factory.pages.ItemPage;
import com.mildmelon.designpatterns.creational.factory.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }

}
