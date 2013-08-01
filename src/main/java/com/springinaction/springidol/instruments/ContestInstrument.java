package com.springinaction.springidol.instruments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ContestInstrument implements Instrument {
    private static final Logger LOG = LoggerFactory.getLogger(ContestInstrument.class);
    private String instrumentName;

    @Override
    public final void play() {
        LOG.info("Playing {}", instrumentName);
        playInstrument();
    }

    protected abstract void playInstrument();

    @Override
    public void setBeanName(String s) {
        this.instrumentName = s;
    }
}
