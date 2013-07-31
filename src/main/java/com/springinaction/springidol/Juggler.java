package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Juggler performer.
 */
public class Juggler implements Performer {
    private static final Logger LOG = LoggerFactory.getLogger(Juggler.class);
    private int beanBags = 3;
    private String beanName;

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler() {
    }

    @Override
    public void perform() throws PerformanceException {
        LOG.info("Performance by '{}'", beanName);
        LOG.info("JUGGLING {} BEANBAGS", beanBags);
    }

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }
}
