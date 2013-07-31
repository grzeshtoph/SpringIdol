package com.springinaction.springidol;

import org.springframework.beans.factory.BeanNameAware;

/**
 * The main interface for sprigng performer beans.
 */
public interface Performer extends BeanNameAware {
    /**
     * Performs the trick.
     *
     * @throws PerformanceException sole checked exception
     */
    void perform() throws PerformanceException;
}
