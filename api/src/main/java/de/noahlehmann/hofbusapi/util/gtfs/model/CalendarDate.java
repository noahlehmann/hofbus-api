package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit calendar dates represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#calendar_datestxt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalendarDate {

    /**
     * Identifies a service.
     * Must reference a service_id from the calendar.txt file.
     */
    private String serviceId;

    /**
     * The date of the exception.
     * The date is in the format YYYYMMDD.
     */
    private Integer date;

    /**
     * Indicates whether the service is available on the date specified in the date field.
     *  1 if the service is available on the date specified in the date field.
     *  -1 if the service is not available on the date specified in the date field.
     */
    private Integer exceptionType;
}
