package com.edu.simple_patterns.builder2;

public class TravelService {
    public static void main(String[] args) {
        HotelOrder order = new HotelOrder
                .Builder("John Newman", "12/22/1973")
                .withCountry("Brazil")
                .withHotel("Sand Beach Hotel")
                .withDateOfTravel("07/20/2026")
                .withVacationsDays(14)
                .withVacationsMembers(4)
                .build();
        System.out.println("Заявка создана для путешественника: " + order.getFirstName());
        System.out.println("Детали заявки: " +
                "\n-страна: " + order.getCountry() +
                "\n-название отеля: " + order.getHotel() +
                "\n-дата заселения: " + order.getDateOfTravel() +
                "\n-количество отдыхающих: " + order.getVacationsMembers()
        );
    }
}
