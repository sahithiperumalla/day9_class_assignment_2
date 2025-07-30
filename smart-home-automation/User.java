package com.smart.home.automation;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Sahithi";
    private String homeId = "HOME123";

    // Getters
    public String getName() {
        return name;
    }

    public String getHomeId() {
        return homeId;
    }

    // Optional setters or constructor can be added if needed
}
