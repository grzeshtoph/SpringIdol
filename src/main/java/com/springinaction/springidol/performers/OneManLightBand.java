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
    private Map<String, String> instrumentSounds;

    public void setInstrumentSounds(Map<String, String> instrumentSounds) {
        this.instrumentSounds = instrumentSounds;
    }

    @Override
    protected void doPerformance() throws PerformanceException {
        for (Map.Entry<String, String> entry : instrumentSounds.entrySet()) {
            LOG.info("{}: {}", entry.getKey(), entry.getValue());
        }
    }
}
