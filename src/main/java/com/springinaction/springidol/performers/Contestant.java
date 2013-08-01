package com.springinaction.springidol.performers;

import com.springinaction.springidol.PerformanceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An abstract contestant that just has information about a name and displays it.
 */
public abstract class Contestant implements Performer {
    private static final Logger LOG = LoggerFactory.getLogger(Contestant.class);
    private String performerName;
    private String email;

    protected Contestant(String email) {
        this.email = email;
    }

    @Override
    public final void perform() throws PerformanceException {
        LOG.info("-----");
        LOG.info("Performance by '{}'", performerName);
        LOG.info("Email: {}", email);
        doPerformance();
    }

    protected abstract void doPerformance() throws PerformanceException;

    @Override
    public void setBeanName(String s) {
        performerName = s;
    }
}
