package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String... args) throws PerformanceException {
        LOG.debug("Hello World!");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
