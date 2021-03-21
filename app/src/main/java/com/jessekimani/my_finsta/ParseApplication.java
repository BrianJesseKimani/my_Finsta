package com.jessekimani.my_finsta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PriLHKlJd58Bk49b9Nt0eEFMPO9mP3c0Q5edOukZ")
                .clientKey("wNT65IVwbtKs6as6iDS6ixFiHnS2hmnzttR8nhi9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
