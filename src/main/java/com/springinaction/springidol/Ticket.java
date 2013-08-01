package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ticket {
    private static final Logger LOG = LoggerFactory.getLogger(Ticket.class);
    private static int ticketsCounter;
    private final int ticketNo = ++ticketsCounter;

    public void init() {
        LOG.debug("Ticket number {} created", ticketNo);
    }
}
