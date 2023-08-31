package com.pluralsight.springbootfundamentals.repository;

import com.pluralsight.springbootfundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
