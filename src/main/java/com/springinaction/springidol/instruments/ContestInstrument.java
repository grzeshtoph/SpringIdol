package com.springinaction.springidol.instruments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * General implementation of contest instrument.
 */
public class ContestInstrument implements Instrument {
    private static final Logger LOG = LoggerFactory.getLogger(ContestInstrument.class);
    private String instrumentName;
    private InstrumentSound instrumentSound;

    @Override
    public final void play() {
        LOG.info("Playing {}", instrumentName);
        LOG.info(instrumentSound.getSound());
    }

    @Override
    public void setBeanName(String s) {
        this.instrumentName = s;
    }

    public void setInstrumentSound(InstrumentSound instrumentSound) {
        this.instrumentSound = instrumentSound;
    }
}
