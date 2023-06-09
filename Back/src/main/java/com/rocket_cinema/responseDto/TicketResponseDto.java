package com.rocket_cinema.responseDto;

import com.rocket_cinema.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketResponseDto {
	private String movieName;
	private String theaterName;
	private String selectedShowtime;
	private String seatNo;
	private SeatType seatType;
	private int ticketAmount;
}
