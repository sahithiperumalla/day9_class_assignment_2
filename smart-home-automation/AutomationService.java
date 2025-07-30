package com.smart.home.automation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationService {

    private final User user;
    private final Device device;

    @Autowired
    public AutomationService(User user, Device device) {
        this.user = user;
        this.device = device;
    }

    public void controlDevice() {
        System.out.println("User " + user.getName() + " controlling " + device.getDeviceType());
        // Your logic here
    }
}
