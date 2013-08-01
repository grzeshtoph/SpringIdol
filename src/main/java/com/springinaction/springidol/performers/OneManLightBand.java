package com.springinaction.springidol.performers;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * one man light band that's based on properties, not on the intruments references.
 */
public class OneManLightBand extends Contestant {
    private static final Logger LOG = LoggerFactory.getLogger(OneManLightBand.class);
    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    @Override
    protected void doPerformance() throws PerformanceException {
        Enumeration<String> instrumentNames = (Enumeration<String>) instruments.propertyNames();
        while (instrumentNames.hasMoreElements()) {
            String instrumentName = instrumentNames.nextElement();
            LOG.info(instrumentName + ": " + instruments.getProperty(instrumentName));
        }
    }
}
