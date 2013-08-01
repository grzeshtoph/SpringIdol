package com.springinaction.springidol.instruments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A concrete musical instrument - harmonica.
 */
public class Harmonica extends ContestInstrument {
    private static final Logger LOG = LoggerFactory.getLogger(Harmonica.class);

    @Override
    protected void playInstrument() {
        LOG.info("HUM HUM HUM");
    }
}
