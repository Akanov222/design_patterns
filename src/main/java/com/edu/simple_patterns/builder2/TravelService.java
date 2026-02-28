package com.edu.simple_patterns.builder2;

import org.springframework.stereotype.Service;

@Service
public class TravelService {
    public void createTravel() {
        HotelOrder order = new HotelOrder
                .Builder("John Newman", "12/22/1973")
                .withCountry("Brazil")
                .withHotel("Sand Beach Hotel")
                .withDateOfTravel("07/20/2026")
                .withVacationsDays(14)
                .withVacationsMembers(4)
                .build();
        System.out.println("Заявка создана для путешественника: " + order.getFirstName());
    }
}
