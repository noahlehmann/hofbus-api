package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit stop times represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#stop_timestxt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StopTime {

    /**
     * Identifies a trip.
     * Must reference a trip_id from the trips.txt file.
     */
    private String tripId;

    /**
     * Identifies a stop.
     * Must reference a stop_id from the stops.txt file.
     */
    private String stopId;

    /**
     * Identifies the order of the stops for a particular trip.
     */
    private int stopSequence;

    /**
     * Identifies the arrival time at a specific stop for a particular trip.
     * The time is measured from "noon minus 12h" (effectively midnight, except for days on which daylight saving time changes occur) at the beginning of the service date.
     * For times occurring after midnight on the service date, enter the time as a value greater than 24:00:00 in HH:MM:SS local time for the day on which the trip schedule begins.
     * If you don't have separate times for arrival and departure at a stop, enter the same value for arrival_time and departure_time.
     */
    private String arrivalTime;

    /**
     * Identifies the departure time from a specific stop for a particular trip.
     * The time is measured from "noon minus 12h" (effectively midnight, except for days on which daylight saving time changes occur)
     * private String departureTime;
     * <p>
     * /**
     * Identifies the stop as a timepoint.
     * If this value is 1, it means that this stop is a timepoint.
     * If this value is empty or 0, it means that this stop is not a timepoint.
     */
    private int timepoint;

    /**
     * Identifies the pickup type for the stop.
     * If this value is 1, it means that passengers are picked up at this stop.
     * If this value is 2, it means that passengers are not picked up at this stop.
     * If this value is empty or 0, it means that the pickup information for the stop is not specified.
     */
    private int pickupType;

    /**
     * Identifies the drop off type for the stop.
     * If this value is 1, it means that passengers are dropped off at this stop.
     * If this value is 2, it means that passengers are not dropped off at this stop.
     * If this value is empty or 0, it means that the drop off information for the stop is not specified.
     */
    private int dropOffType;

    /**
     * Identifies a specific stop as a shape point.
     * For example, a stop may be associated with a shape point if the stop is where a passenger boards a vehicle and the shape point is the location of the vehicle when it departs the stop.
     */
    private int shapeDistTravelled;

    /**
     * Identifies the time a vehicle arrives at a stop.
     */
    private String timepointArrival;

    /**
     * Identifies the time a vehicle departs a stop.
     */
    private String timepointDeparture;
}
