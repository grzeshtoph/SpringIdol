package com.springinaction.springidol.instruments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A concrete musical instrument - saxophone.
 */
public class Saxophone extends ContestInstrument {
    private static final Logger LOG = LoggerFactory.getLogger(Saxophone.class);

    @Override
    protected void playInstrument() {
        LOG.info("TOOT TOOT TOOT");
    }
}
