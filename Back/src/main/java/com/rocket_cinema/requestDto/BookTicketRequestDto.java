package com.rocket_cinema.requestDto;

import lombok.Data;

import java.util.List;

@Data
public class BookTicketRequestDto {
	private List<String> requestedSeats;
	private String requestedShowtime;
	private int showId;
	private Long userId;

}