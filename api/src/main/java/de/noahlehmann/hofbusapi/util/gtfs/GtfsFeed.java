package de.noahlehmann.hofbusapi.util.gtfs;

import de.noahlehmann.hofbusapi.util.gtfs.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author nlehmann
 * A Java representation of the General Transit Feed Specification.
 * @see <a href="https://gtfs.org/schedule/reference/">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GtfsFeed {

    // TODO: 24.01.23 Annotations for validation with field types and required or recommended etc.

    /**
     * Transit agencies with service represented in this dataset.
     */
    private List<Agency> agencies;

    /**
     * Stops where vehicles pick up or drop off riders. Also defines stations and station entries.
     */
    private List<Stop> stops;

    /**
     * Transit routes. A route is a sequence of trips that are displayed to riders as a single service.
     */
    private List<Route> routes;

    /**
     * Trips for each route. A trip is a sequence of two or more stops that occur during a specific time period.
     */
    private List<Trip> trips;

    /**
     * Times that a vehicle arrives at and departs from stops for each trip.
     */
    private List<StopTime> stopTimes;

    /**
     * Service dates specified using a weekly schedule with start and end dates.
     * This list cannot be empty unless all dates of service are defined in the {@link GtfsFeed#calendarDates} list.
     */
    private List<Calendar> calendars;

    /**
     * Exceptions for the services defined in the {@link GtfsFeed#calendars} list.
     * If @{@link GtfsFeed#calendars} is empty, then this list is required and must contain all dates of service.
     */
    private List<CalendarDate> calendarDates;

    /**
     * Dataset metadata, including publisher, version and expiration information.
     */
    private List<FeedInfo> feedInfos;

}
