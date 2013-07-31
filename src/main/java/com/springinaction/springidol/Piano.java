package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A concrete musical instrument - piano.
 */
public class Piano implements Instrument {
    private static final Logger LOG = LoggerFactory.getLogger(Piano.class);

    @Override
    public void play() {
        LOG.info("PLINK PLINK PLINK");
    }
}
