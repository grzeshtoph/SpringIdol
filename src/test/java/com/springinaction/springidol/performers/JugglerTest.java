package com.springinaction.springidol.performers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;

/**
 * In-container test case for {@link Juggler}.
 */
@ContextConfiguration("/spring-idol.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JugglerTest {
    @Autowired
    private Juggler duke;

    @Test
    public void dukeTest() {
        assertNotNull(duke);
    }
}
