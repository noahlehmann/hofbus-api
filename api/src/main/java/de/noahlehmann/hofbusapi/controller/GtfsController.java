package de.noahlehmann.hofbusapi.controller;

import de.noahlehmann.hofbusapi.util.gtfs.model.Agency;
import de.noahlehmann.hofbusapi.util.gtfs.model.Calendar;
import de.noahlehmann.hofbusapi.util.gtfs.model.CalendarDate;
import de.noahlehmann.hofbusapi.util.gtfs.model.FeedInfo;
import de.noahlehmann.hofbusapi.util.gtfs.model.Route;
import de.noahlehmann.hofbusapi.util.gtfs.model.Stop;
import de.noahlehmann.hofbusapi.util.gtfs.model.StopTime;
import de.noahlehmann.hofbusapi.util.gtfs.model.Trip;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("gtfs")
public class GtfsController {

    @GetMapping("/agency")
    public ResponseEntity<List<Agency>> getAgencies() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/stops")
    public ResponseEntity<List<Stop>> getStops() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/routes")
    public ResponseEntity<List<Route>> getRoutes() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/trips")
    public ResponseEntity<List<Trip>> getTrips(
            @RequestParam(name = "route_id", required = false) String routeId,
            @RequestParam(name = "service_id", required = false) String serviceId
    ) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/calendar")
    public ResponseEntity<List<Calendar>> getCalendar() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/calendar_dates")
    public ResponseEntity<List<CalendarDate>> getCalendarDates(
            @RequestParam(name = "date", required = false) Date date
    ) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/stop_times")
    public ResponseEntity<List<StopTime>> getStopTimes(
            @RequestParam(name = "trip_id", required = false) String tripId,
            @RequestParam(name = "stop_id", required = false) String stopId
    ) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/feed_info")
    public ResponseEntity<List<FeedInfo>> getFeedInfo() {
        return ResponseEntity.ok(null);
    }

}
