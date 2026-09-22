package com.rapido.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapido.entity.BookingEntity;
import com.rapido.repository.BookingRepository;
import com.rapido.request.BookingRequest;
import com.rapido.response.BookingResponse;

@Service
public class BookingService
{
	@Autowired
	BookingRepository bookingRepository;

	public BookingResponse bookRide(BookingRequest bookingRequest)
	{
		System.out.println("BookingService.bookRide()::::::::::::::::::::;");

		BookingResponse bookingResponse = null;
		String mobile = bookingRequest.getMobile();
		String amount = bookingRequest.getAmount();
		String destination = bookingRequest.getDestination();
		String source = bookingRequest.getSource();
		String rideType = bookingRequest.getRideType();

		int bookingId = bookingRepository.createBooking(mobile, source, destination, rideType, amount);

		if (bookingId > 0)
		{
			bookingResponse = constructResponse();
		}

		return bookingResponse;

	}

	public List<BookingEntity> getBookingHistory()
	{
		System.out.println("BookingService.getBookingHistory()::::::::::::::::::::::::");
		List<BookingEntity> bookingList = bookingRepository.getBookingHistory();

		return bookingList;
	}

	public BookingEntity getBookHistory(int id)
	{
		System.out.println("BookingService.getBookHistory()::::::::::::::::::::::::::");
		BookingEntity bookList = bookingRepository.getBooking(id);

		return bookList;
	}

	private BookingResponse constructResponse()
	{
		BookingResponse bookingResponse = new BookingResponse();

		Random random = new Random();

		int otp = 1000 + random.nextInt(9000);
		int eta = 1 + random.nextInt(9);

		bookingResponse.setCarNo("RJ19 SF 1852");
		bookingResponse.setRiderName("Sayyed");
		bookingResponse.setOtp(otp);
		bookingResponse.setEta(eta);
		return bookingResponse;
	}

}
