package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit stops represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#stopstxt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stop {

    /**
     * Identifies a stop or station.
     * Must be unique for each stop or station within a service area.
     * Conditionally Required:
     * - Required for all stops or stations.
     */
    private String stopId;

    /**
     * Name of the stop or station.
     * Conditionally Required:
     * - Required for all stops or stations.
     */
    private String stopName;

    /**
     * Description of the stop or station.
     */
    private String stopDesc;

    /**
     * Latitude of the stop or station.
     * Conditionally Required:
     * - Required for all stops or stations.
     */
    private Double stopLat;

    /**
     * Longitude of the stop or station.
     * Conditionally Required:
     * - Required for all stops or stations.
     */
    private Double stopLon;

    /**
     * Zone identifier for the stop or station.
     * This can be used in conjunction with the fare attribute field in the fare_rules.txt file to define fare zones.
     */
    private String stopCode;

    /**
     * URL of a web page about a particular stop or station.
     */
    private String stopUrl;

    /**
     * Type of location.
     * Conditionally Required:
     * - Required for all stops or stations.
     */
    private String locationType;

    /**
     * Identifies the parent station of a stop.
     * If this stop is a parent station, this value is empty.
     */
    private String parentStation;

    /**
     * Identifies the timezone of the stop or station.
     * This timezone is used to calculate time-dependent information, such as the arrival and departure times of a particular trip at this stop or station.
     */
    private String stopTimezone;

    /**
     * Identifies the wheelchair accessibility of the stop or station.
     * This field can be used to indicate whether a stop or station is wheelchair accessible.
     */
    private String wheelchairBoarding;

}
