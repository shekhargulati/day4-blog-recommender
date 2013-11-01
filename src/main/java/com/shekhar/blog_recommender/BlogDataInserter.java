package com.shekhar.blog_recommender;

import io.prediction.Client;
import io.prediction.CreateItemRequestBuilder;

public class BlogDataInserter {

    private static final String API_KEY = "wwoTLn0FR7vH6k51Op8KbU1z4tqeFGZyvBpSgafOaSSe40WqdMf90lEncOA0SB13";

    public static void main(String[] args) throws Exception {
        Client client = new Client(API_KEY);
        addUsers(client);
        addBlogs(client);
        userItemViews(client);
        client.close();

    }

    private static void addUsers(Client client) throws Exception {
        String[] users = { "shekhar", "rahul"};
        for (String user : users) {
            System.out.println("Added User " + user);
            client.createUser(user);
        }

    }

    private static void addBlogs(Client client) throws Exception {
        CreateItemRequestBuilder blog1 = client.getCreateItemRequestBuilder("blog1", new String[]{"machine-learning"});
        client.createItem(blog1);
        
        CreateItemRequestBuilder blog2 = client.getCreateItemRequestBuilder("blog2", new String[]{"javascript"});
        client.createItem(blog2);
        
        CreateItemRequestBuilder blog3 = client.getCreateItemRequestBuilder("blog3", new String[]{"scala"});
        client.createItem(blog3);
        
        CreateItemRequestBuilder blog4 = client.getCreateItemRequestBuilder("blog4", new String[]{"artificial-intelligence"});
        client.createItem(blog4);
        
        CreateItemRequestBuilder blog5 = client.getCreateItemRequestBuilder("blog5", new String[]{"statistics"});
        client.createItem(blog5);
        
        CreateItemRequestBuilder blog6 = client.getCreateItemRequestBuilder("blog6", new String[]{"python"});
        client.createItem(blog6);
        
        CreateItemRequestBuilder blog7 = client.getCreateItemRequestBuilder("blog7", new String[]{"web-development"});
        client.createItem(blog7);
        
        CreateItemRequestBuilder blog8 = client.getCreateItemRequestBuilder("blog8", new String[]{"security"});
        client.createItem(blog8);
        
        CreateItemRequestBuilder blog9 = client.getCreateItemRequestBuilder("blog9", new String[]{"ruby"});
        client.createItem(blog9);
        
        CreateItemRequestBuilder blog10 = client.getCreateItemRequestBuilder("blog10", new String[]{"openshift"});
        client.createItem(blog10);
    }

    private static void userItemViews(Client client) throws Exception {
        client.identify("shekhar");
        client.userActionItem("view","blog1");
        client.userActionItem("view","blog4");
        client.userActionItem("view","blog5");
        
        
        client.identify("rahul");
        client.userActionItem("view","blog1");
        client.userActionItem("view","blog4");
        client.userActionItem("view","blog6");
        client.userActionItem("view","blog7");
        
    }

}
