package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit calendar represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#calendartxt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calendar {

    /**
     * Identifies a service.
     * Must be unique for each service for each agency.
     */
    private String serviceId;

    /**
     * Indicates whether the service runs on Monday.
     */
    private Boolean monday;

    /**
     * Indicates whether the service runs on Tuesday.
     */
    private Boolean tuesday;

    /**
     * Indicates whether the service runs on Wednesday.
     */
    private Boolean wednesday;

    /**
     * Indicates whether the service runs on Thursday.
     */
    private Boolean thursday;

    /**
     * Indicates whether the service runs on Friday.
     */
    private Boolean friday;

    /**
     * Indicates whether the service runs on Saturday.
     */
    private Boolean saturday;

    /**
     * Indicates whether the service runs on Sunday.
     */
    private Boolean sunday;

    /**
     * The start date for the service.
     * The date is in the format YYYYMMDD.
     */
    private Integer startDate;

    /**
     * The end date for the service.
     * The date is in the format YYYYMMDD.
     */
    private Integer endDate;
}

