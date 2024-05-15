package org.example.b9routeridemanager.entities;

import jakarta.persistence.*;
import org.example.b9routeridemanager.entities.LogisticsInfo.City;
import org.example.b9routeridemanager.entities.LogisticsInfo.Route;
import org.example.b9routeridemanager.entities.RolesInfo.Cashier;

import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "departure_id")
    private City departureCity;

    @ManyToOne
    @JoinColumn(name = "arrival_id")
    private City arrivalCity;

    private String ticketNumber;
    private String seatNumber;
    private LocalDateTime dateOfSelling;

    @ManyToOne
    @JoinColumn(name = "cashier_id")
    private Cashier cashier;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    private double price;

    public Ticket() {}

    public Ticket(Long id, String passengerName, Route route, City departureCity, City arrivalCity, String ticketNumber, String seatNumber, LocalDateTime dateOfSelling, Cashier cashier) {
        this.id = id;
        this.passengerName = passengerName;
        this.route = route;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.ticketNumber = ticketNumber;
        this.seatNumber = seatNumber;
        this.dateOfSelling = dateOfSelling;
        this.cashier = cashier;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
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

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getDateOfSelling() {
        return dateOfSelling;
    }

    public void setDateOfSelling(LocalDateTime dateOfSelling) {
        this.dateOfSelling = dateOfSelling;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
