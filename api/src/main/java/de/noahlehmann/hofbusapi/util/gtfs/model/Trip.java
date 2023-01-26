package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit trips represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#trips.txt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    /**
     * Identifies a route.
     * Must be unique for each route for each agency.
     * Conditionally Required:
     * - Required for all trips.
     */
    private String routeId;

    /**
     * Identifies a trip.
     * Must be unique for each trip for each agency.
     * Conditionally Required:
     * - Required for all trips.
     */
    private String tripId;

    /**
     * Identifies a trip as a variant of another trip.
     * Used to represent a variation of a trip that runs on the same physical road as another trip, but with slight variations in the route.
     * A trip is considered a variant of another trip if they have the same trip_id.
     */
    private String tripVariant;

    /**
     * Identifies the direction of the trip.
     * Used to distinguish between bi-directional trips with the same route_id.
     */
    private String directionId;

    /**
     * Identifies the block to which the trip belongs.
     * A block consists of two or more sequential trips made using the same vehicle, where a passenger can transfer from one trip to the next just by staying in the vehicle.
     */
    private String blockId;

    /**
     * Identifies the shape of the trip.
     * Used to determine the shape of the trip.
     */
    private String shapeId;

    /**
     * Identifies the service for the trip.
     * Must reference a service_id from the calendar.txt or calendar_dates.txt file.
     * Conditionally Required:
     * - Required for all trips.
     */
    private String serviceId;

    /**
     * Identifies the headsign of the trip.
     * The headsign is the text that appears on a sign that identifies the trip's destination to passengers.
     */
    private String tripHeadsign;

    /**
     * Identifies the short name of the trip.
     * This will often be a short, abstract identifier like "32", "100X", or "Green" that riders use to identify a trip,
     * but which doesn't give any indication of what places the trip serves.
     */
    private String tripShortName;

    /**
     * Identifies the type of bike allowed on the trip.
     */
    private String bikeAllowed;

    /**
     * Identifies the trip as a reverse trip.
     * A reverse trip is a trip that is identical to another trip, but in the opposite direction.
     */
    private String reverseTrip;
}
