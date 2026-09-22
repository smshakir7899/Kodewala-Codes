package com.rapido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rapido.entity.BookingEntity;
import com.rapido.request.BookingRequest;
import com.rapido.response.BookingResponse;
import com.rapido.service.BookingService;

@Controller
public class BookingController
{
	@Autowired
	BookingService bookingService;

	@GetMapping("bookingDetails")
	public String showBookPage()
	{
		return "booking-page";
	}

	@PostMapping("bookRide")
	public String acceptBooking(@ModelAttribute BookingRequest bookingRequest, Model model)
	{
		System.out.println("Mobile       : " + bookingRequest.getMobile());
		System.out.println("Source       : " + bookingRequest.getSource());
		System.out.println("Destination  : " + bookingRequest.getDestination());
		System.out.println("Ride Type    : " + bookingRequest.getRideType());
		System.out.println("Amount       : " + bookingRequest.getAmount());

		BookingResponse response = bookingService.bookRide(bookingRequest);
		// Set the response
//		model.addAttribute("riderName", "Akram");
//		model.addAttribute("bikeNo", "RJ19 SF 1852");
//		
//		model.addAttribute("eta", eta + " minutes");

		model.addAttribute("bookingResponse", response);
		return "booking-confirmation";
	}

	@GetMapping("bookingHistory")
	public String showBookingHistory(Model model)
	{
		List<BookingEntity> bookingList = bookingService.getBookingHistory();
		model.addAttribute("bookingList", bookingList);
		return "booking-history";
	}

	@GetMapping("getBookingHistoryById")
	public String showBookHistory(@RequestParam(value ="id",defaultValue="0") int id, Model model)
	{
		BookingEntity bookingList = bookingService.getBookHistory(id);
		model.addAttribute("bookingList", bookingList);
		return "particular-booking-history";
	}
}
