package com.springinaction.springidol.instruments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A concrete musical instrument - cymbal.
 */
public class Cymbal extends ContestInstrument {
    private static final Logger LOG = LoggerFactory.getLogger(Cymbal.class);

    @Override
    protected void playInstrument() {
        LOG.info("CRASH CRASH CRASH");
    }
}
