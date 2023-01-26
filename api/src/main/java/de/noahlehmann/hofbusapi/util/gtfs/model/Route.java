package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit routes represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#routestxt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Route {

    /**
     * Identifies a transit agency.
     * Must be unique for each agency and referenced by all routes.
     */
    private String agencyId;

    /**
     * Identifies a route.
     * Must be unique for each route for each agency.
     */
    private String routeId;

    /**
     * Short name of the route.
     * This will often be a short, abstract identifier like "32", "100X", or "Green" that riders use to identify a route,
     * but which doesn't give any indication of what places the route serves.
     */
    private String routeShortName;

    /**
     * Full name of the route.
     * This name is generally more descriptive than the route_short_name and will often include the route's destination or stop.
     */
    private String routeLongName;

    /**
     * Description of the route.
     */
    private String routeDesc;

    /**
     * Type of transportation used on the route.
     */
    private int routeType;

    /**
     * URL of a web page about the route.
     */
    private String routeUrl;

    /**
     * Color that corresponds to a route.
     */
    private String routeColor;

    /**
     * Text color that corresponds to a route.
     */
    private String routeTextColor;
}
