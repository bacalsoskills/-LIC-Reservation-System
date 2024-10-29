package com.g4Appdev.LICReservation.Controller;

import com.g4Appdev.LICReservation.Entity.BookingEntity;
import com.g4Appdev.LICReservation.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/getAllBookings")
    public List<BookingEntity> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping("/createBooking")
    public BookingEntity createBooking(@RequestBody BookingEntity booking) {
        return bookingService.createBooking(booking);
    }

    @PutMapping("/updateBooking/{id}")
    public BookingEntity updateBooking(@PathVariable Long id, @RequestBody BookingEntity bookingDetails) {
        return bookingService.updateBooking(id, bookingDetails);
    }


    @DeleteMapping("/deleteBooking/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.ok().build();
    }
}
