package com.springinaction.springidol.instruments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A concrete musical instrument - guitar.
 */
public class Guitar extends ContestInstrument {
    private static final Logger LOG = LoggerFactory.getLogger(Guitar.class);

    @Override
    protected void playInstrument() {
        LOG.info("STRUM STRUM STRUM");
    }
}
