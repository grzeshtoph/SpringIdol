package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Juggler performer.
 */
public class Juggler implements Performer {
    private static final Logger LOG = LoggerFactory.getLogger(Juggler.class);
    private int beanBags = 3;

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler() {
    }

    @Override
    public void perform() throws PerformanceException {
        LOG.info("JUGGLING {} BEANBAGS", beanBags);
    }
}
