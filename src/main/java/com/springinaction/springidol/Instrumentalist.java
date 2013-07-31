package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Musical performer
 */
public class Instrumentalist extends Contestant {
    private static final Logger LOG = LoggerFactory.getLogger(Instrumentalist.class);
    private String song;
    private int age;
    private Instrument instrument;

    @Override
    protected void doPerformance() throws PerformanceException {
        if (age > 0)
            LOG.info("at age {}", 37);

        LOG.info("Playing a song '{}'...", song);
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
