package com.springinaction.springidol.performers;

import com.springinaction.springidol.PerformanceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Juggler performer.
 */
public class Juggler extends Contestant {
    private static final Logger LOG = LoggerFactory.getLogger(Juggler.class);
    private int beanBags = 3;

    public Juggler(String email, int beanBags) {
        super(email);
        this.beanBags = beanBags;
    }

    public Juggler(String email) {
        super(email);
    }

    @Override
    protected void doPerformance() throws PerformanceException {
        LOG.info("JUGGLING {} BEANBAGS", beanBags);
    }
}
