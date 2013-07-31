package com.springinaction.springidol;

/**
 * The main interface for sprigng performer beans.
 */
public interface Performer {
    /**
     * Performs the trick.
     *
     * @throws PerformanceException sole checked exception
     */
    void perform() throws PerformanceException;
}
