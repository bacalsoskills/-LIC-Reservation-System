package com.g4Appdev.LICReservation.Repository;

import com.g4Appdev.LICReservation.Entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Long> {
}
