package com.mildmelon.design_patterns.creational.factory.websites;

import com.mildmelon.design_patterns.creational.factory.pages.CartPage;
import com.mildmelon.design_patterns.creational.factory.pages.SearchPage;
import com.mildmelon.design_patterns.creational.factory.Website;
import com.mildmelon.design_patterns.creational.factory.pages.ItemPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }

}
