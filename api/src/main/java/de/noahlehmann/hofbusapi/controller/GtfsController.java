package de.noahlehmann.hofbusapi.controller;

import de.noahlehmann.hofbusapi.util.gtfs.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
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

    @Operation(summary = "Transit agencies with service represented in this dataset.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully retrieved list of agencies",
                            content = @Content(schema = @Schema(implementation = Agency.class))),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/agency", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<Agency>> getAgencies() {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Stops where vehicles pick up or drop off riders. Also defines stations and station entrances.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of agencies"),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/stops", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<Stop>> getStops() {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Transit routes. A route is a group of trips that are displayed to riders as a single service.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of agencies"),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/routes", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<Route>> getRoutes() {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Trips for each route. A trip is a sequence of two or more stops that occur during a specific time period.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of agencies"),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/trips", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<Trip>> getTrips(
            @RequestParam(name = "route_id", required = false) String routeId,
            @RequestParam(name = "service_id", required = false) String serviceId
    ) {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Service dates specified using a weekly schedule with start and end dates. This file is required unless all dates of service are defined in calendar_dates.txt.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of agencies"),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/calendar", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<Calendar>> getCalendar() {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Exceptions for the services defined in the calendar.txt. If calendar.txt is omitted, then calendar_dates.txt is required and must contain all dates of service.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of agencies"),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/calendar_dates", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<CalendarDate>> getCalendarDates(
            @RequestParam(name = "date", required = false) Date date
    ) {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Times that a vehicle arrives at and departs from stops for each trip.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of agencies"),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/stop_times", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<StopTime>> getStopTimes(
            @RequestParam(name = "trip_id", required = false) String tripId,
            @RequestParam(name = "stop_id", required = false) String stopId
    ) {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Dataset metadata, including publisher, version, and expiration information.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of agencies"),
                    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
                    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden")
            })
    @GetMapping(value = "/feed_info", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<List<FeedInfo>> getFeedInfo() {
        return ResponseEntity.ok(null);
    }

}
