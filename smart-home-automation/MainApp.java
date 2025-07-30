package com.smart.home.automation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AutomationService automationService = context.getBean(AutomationService.class);
        automationService.controlDevice();

        context.close();
    }
}
