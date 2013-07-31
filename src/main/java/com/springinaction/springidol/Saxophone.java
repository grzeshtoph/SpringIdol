package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A concrete musical instrument - saxophone.
 */
public class Saxophone implements Instrument {
    private static final Logger LOG = LoggerFactory.getLogger(Saxophone.class);

    @Override
    public void play() {
        LOG.info("TOOT TOOT TOOT");
    }
}
