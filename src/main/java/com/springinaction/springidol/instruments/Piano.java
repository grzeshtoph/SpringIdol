package com.springinaction.springidol.instruments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A concrete musical instrument - piano.
 */
public class Piano extends ContestInstrument {
    private static final Logger LOG = LoggerFactory.getLogger(Piano.class);

    @Override
    protected void playInstrument() {
        LOG.info("PLINK PLINK PLINK");
    }
}
