package com.pluralsight.springbootfundamentals.service;

import com.pluralsight.springbootfundamentals.entity.Ticket;
import com.pluralsight.springbootfundamentals.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public Iterable<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
