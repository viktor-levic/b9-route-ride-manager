package org.example.b9routeridemanager.tables.logistics_info;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tickets")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passenger_name", nullable = false)
    private String passengerName;

    @Column(name = "route_id", nullable = false)
    private Long routeId;

    @Column(name = "departure_id", nullable = false)
    private Long departureId;

    @Column(name = "arrival_id", nullable = false)
    private Long arrivalId;

    @Column(name = "ticket_status", nullable = false)
    private String ticketStatus;

    @Column(name = "seat_number", nullable = false)
    private Integer seatNumber;

    //DATA
    @Column(name = "date_of_selling", nullable = false)
    private LocalDate dateOfSelling;

    @Column(name = "cashier_id", nullable = false)
    private Long cashierId;


    public Tickets() {
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

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Long getDepartureId() {
        return departureId;
    }

    public void setDepartureId(Long departureId) {
        this.departureId = departureId;
    }

    public Long getArrivalId() {
        return arrivalId;
    }

    public void setArrivalId(Long arrivalId) {
        this.arrivalId = arrivalId;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getDateOfSelling() {
        return dateOfSelling.toString();
    }

    public void setDateOfSelling(LocalDate dateOfSelling) {
        this.dateOfSelling = dateOfSelling;
    }

    public Long getCashierId() {
        return cashierId;
    }

    public void setCashierId(Long cashierId) {
        this.cashierId = cashierId;
    }
}
