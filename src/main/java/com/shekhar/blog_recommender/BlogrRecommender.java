package com.shekhar.blog_recommender;

import io.prediction.Client;

import java.util.Arrays;

public class BlogrRecommender {

    public static void main(String[] args) throws Exception {

        Client client = new Client("wwoTLn0FR7vH6k51Op8KbU1z4tqeFGZyvBpSgafOaSSe40WqdMf90lEncOA0SB13");
        client.identify("shekhar");
        String[] recommendedItems = client.getItemSimTopN("engine1", "blog1", 5);

        System.out.println(String.format("User %s is recommended %s", "shekhar", Arrays.toString(recommendedItems)));

        client.close();

    }
}
