package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit feed info represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#feed_infotxt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FeedInfo {

    /**
     * The feed publisher.
     * A unique identifier for the feed publisher.
     * This should be the same for all feeds produced by the same publisher.
     */
    private String feedPublisherName;

    /**
     * The feed publisher's URL.
     * This should be the URL of the feed publisher.
     */
    private String feedPublisherUrl;

    /**
     * The feed's start date.
     * The date is in the format YYYYMMDD.
     */
    private Integer feedStartDate;

    /**
     * The feed's end date.
     * The date is in the format YYYYMMDD.
     */
    private Integer feedEndDate;

    /**
     * The feed's version.
     */
    private String feedVersion;
}
