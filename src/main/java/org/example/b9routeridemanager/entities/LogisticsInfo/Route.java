package org.example.b9routeridemanager.entities.LogisticsInfo;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "departure_city_id")
    private City departureCity;

    @ManyToOne
    @JoinColumn(name = "arrival_city_id")
    private City arrivalCity;

    private BigDecimal userTicketPrice;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private BigDecimal backageTicketPrice;


    public Route() {}

    public Route(Long id, City departureCity, City arrivalCity, BigDecimal userTicketPrice, LocalDateTime departureTime, LocalDateTime arrivalTime, BigDecimal backageTicketPrice) {
        this.id = id;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.userTicketPrice = userTicketPrice;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.backageTicketPrice = backageTicketPrice;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(City departureCity) {
        this.departureCity = departureCity;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(City arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public BigDecimal getUserTicketPrice() {
        return userTicketPrice;
    }

    public void setUserTicketPrice(BigDecimal userTicketPrice) {
        this.userTicketPrice = userTicketPrice;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public BigDecimal getBackageTicketPrice() {
        return backageTicketPrice;
    }

    public void setBackageTicketPrice(BigDecimal backageTicketPrice) {
        this.backageTicketPrice = backageTicketPrice;
    }
}

