package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ticket {
    private static final Logger LOG = LoggerFactory.getLogger(Ticket.class);
    private int ticketNo;
    private boolean extraPrice;

    public Ticket(boolean extraPrice) {
        this.extraPrice = extraPrice;
    }

    public void init() {
        LOG.debug("Ticket number {} created", ticketNo);
        if (extraPrice)
            LOG.debug("Ticker has extra price, as the venue is special");
    }

    int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
}
