package com.springinaction.springidol.performers;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;

/**
 * One man band that can play on multiple instruments.
 */
public class OneManBand extends Contestant {
    private static final Logger LOG = LoggerFactory.getLogger(OneManBand.class);
    private Map<String, Instrument> instruments;

    public OneManBand(String email) {
        super(email);
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    protected void doPerformance() throws PerformanceException {

        for (Map.Entry<String, Instrument> entry : instruments.entrySet()) {
            LOG.info(entry.getKey() + ": ");
            entry.getValue().play();
        }
    }
}
