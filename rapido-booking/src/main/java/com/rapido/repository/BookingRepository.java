package com.rapido.repository;

import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rapido.entity.BookingEntity;

@Repository
public class BookingRepository
{
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public int createBooking(String mobile, String source, String destination, String type, String amount)
	{
		System.out.println("BookingRepository.createBooking():::::::");

		Session session = sessionFactory.getCurrentSession();

		BookingEntity bookingEntity = new BookingEntity();
		bookingEntity.setAmount(amount);
		bookingEntity.setDestination(destination);
		bookingEntity.setMobile(mobile);
		bookingEntity.setRideType(type);
		bookingEntity.setSource(source);

		session.persist(bookingEntity); // This will insert one record in DB

		if (bookingEntity.getId() > 0)
		{
			return bookingEntity.getId();
		}

		return 0;
	}

	@Transactional
	public BookingEntity getBooking(int bookId)
	{

		System.out.println("BookingRepository.getBookingHistory()::::::::::::::::");

		Session session = sessionFactory.getCurrentSession();
		BookingEntity book = session.find(BookingEntity.class, bookId);

		return book;
	}

	@Transactional
	public List<BookingEntity> getBookingHistory()
	{

		System.out.println("BookingRepository.getBookingHistory()::::::::::::::::");

		Session session = sessionFactory.getCurrentSession();

		List<BookingEntity> bookingList = session.createQuery("from BookingEntity", BookingEntity.class)
				.getResultList();

		return bookingList;
	}
}
