package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Poetic juggler. Juggles and recites a poem.
 */
public class PoeticJuggler extends Juggler {
    private static final Logger LOG = LoggerFactory.getLogger(PoeticJuggler.class);
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        LOG.info("While reciting...");
        poem.recite();
    }
}
