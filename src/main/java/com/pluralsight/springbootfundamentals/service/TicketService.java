package com.pluralsight.springbootfundamentals.service;

import com.pluralsight.springbootfundamentals.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> getAllTickets();
}
