package com.mildmelon.design_patterns.creational.factory.websites;

import com.mildmelon.design_patterns.creational.factory.pages.AboutPage;
import com.mildmelon.design_patterns.creational.factory.pages.ContactPage;
import com.mildmelon.design_patterns.creational.factory.Website;
import com.mildmelon.design_patterns.creational.factory.pages.CommentPage;
import com.mildmelon.design_patterns.creational.factory.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }

}
