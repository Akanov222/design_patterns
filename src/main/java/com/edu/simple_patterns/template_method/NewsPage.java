package com.edu.simple_patterns.template_method;

public class NewsPage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("News!");
    }
}
