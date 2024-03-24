package org.example.b9routeridemanager.tables.logistics_info;

import jakarta.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "routes")
public class Routes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "departure_city_id", nullable = false)
    private Long departureCityId;

    @Column(name = "arrival_city_id", nullable = false)
    private String arrivalCityId;

    @Column(name = "user_ticket_price", nullable = false)
    private Integer userTicketPrice;

    @Column(name = "departure_time", nullable = false)
    private ZonedDateTime departureTime;

    @Column(name = "arrivalTime", nullable = false)
    private ZonedDateTime arrivalTime;

    @Column(name = "baggage_ticket_price", nullable = false)
    private Integer baggageTicketPrice;


    public Routes() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepartureCityId() {
        return departureCityId;
    }

    public void setDepartureCityId(Long departureCityId) {
        this.departureCityId = departureCityId;
    }

    public String getArrivalCityId() {
        return arrivalCityId;
    }

    public void setArrivalCityId(String arrivalCityId) {
        this.arrivalCityId = arrivalCityId;
    }

    public Integer getUserTicketPrice() {
        return userTicketPrice;
    }

    public void setUserTicketPrice(Integer userTicketPrice) {
        this.userTicketPrice = userTicketPrice;
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    public void setDepartureTime(ZonedDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime.toString();
    }

    public void setArrivalTime(ZonedDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getBaggageTicketPrice() {
        return baggageTicketPrice;
    }

    public void setBaggageTicketPrice(Integer baggageTicketPrice) {
        this.baggageTicketPrice = baggageTicketPrice;
    }
}
