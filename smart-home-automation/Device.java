package com.smart.home.automation;


import org.springframework.stereotype.Component;

@Component
public class Device {
    private String deviceType = "AC";
    private boolean status = false; // false = off, true = on

    // Getters and setters
    public String getDeviceType() {
        return deviceType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
