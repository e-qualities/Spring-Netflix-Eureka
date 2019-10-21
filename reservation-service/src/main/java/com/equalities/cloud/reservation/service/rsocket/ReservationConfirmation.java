package com.equalities.cloud.reservation.service.rsocket;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationConfirmation {
  
  enum Status {
    BOOKED,
    CANCELLED,
    REJECTED;
  }
  
  private String reservationName;
  private Status status;
}
