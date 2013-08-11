package com.springinaction.springidol;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

/**
 * Test case for the {@link Ticket}.
 */
@ContextConfiguration("/spring-idol.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TicketTest {
    @Autowired
    Ticket ticket1;
    @Autowired
    Ticket ticket2;

    @Test
    public void ticketTest() {
        assertNotNull(ticket1);
        assertNotNull(ticket2);
        assertFalse(ticket1 == ticket2);
        assertEquals(1, ticket1.getTicketNo());
        assertEquals(2, ticket2.getTicketNo());
        Ticket ticket3 = new Ticket(false);
        assertEquals(3, ticket3.getTicketNo());
        ticket3.init();
    }

}
