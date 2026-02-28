package com.edu.simple_patterns.builder2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelOrder {

    // обязательные поля
    private final String firstName;
    private final String dateOfBirth;

    // необязательные поля
    private final String country;
    private final String hotel;
    private final String dateOfTravel;
    private final Integer vacationsDays;
    private final Integer vacationsMembers;

    protected HotelOrder(Builder builder) {
        this.firstName = builder.firstName;
        this.dateOfBirth = builder.dateOfBirth;
        this.country = builder.country;
        this.hotel = builder.hotel;
        this.dateOfTravel = builder.dateOfTravel;
        this.vacationsDays = builder.vacationsDays;
        this.vacationsMembers = builder.vacationsMembers;
    }

    public static class Builder {
        private String firstName;
        private String dateOfBirth;

        private String country;
        private String hotel;
        private String dateOfTravel;
        private Integer vacationsDays;
        private Integer vacationsMembers;

        protected Builder(String firstName, String dateOfBirth) {
            this.firstName = firstName;
            this.dateOfBirth = dateOfBirth;
        }

        protected Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        protected Builder withHotel(String hotel) {
            this.hotel = hotel;
            return this;
        }

        protected Builder withDateOfTravel(String dateOfTravel) {
            this.dateOfTravel = dateOfTravel;
            return this;
        }

        protected Builder withVacationsDays(Integer vacationsDays) {
            this.vacationsDays = vacationsDays;
            return this;
        }

        protected Builder withVacationsMembers(Integer vacationsMembers) {
            this.vacationsMembers = vacationsMembers;
            return this;
        }

        protected HotelOrder build() {
            return new HotelOrder(this);
        }
    }
}
