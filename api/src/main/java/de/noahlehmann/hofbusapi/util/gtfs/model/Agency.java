package de.noahlehmann.hofbusapi.util.gtfs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nlehmann
 * Transit agencies with service represented in this dataset.
 * @see <a href="https://gtfs.org/schedule/reference/#agencytxt">GTFS reference for GTFS schedule</a>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agency {


    /**
     * Identifies a transit brand which is often synonymous with a transit agency.
     * Note that in some cases, such as when a single agency operates multiple separate services, agencies and brands are distinct.
     * A dataset may contain data from multiple agencies.
     * Conditionally Required:
     * - Required when the dataset contains data for multiple transit agencies.
     * - Optional otherwise.
     */
    private String agencyId;

    /**
     * Full name of the transit agency.
     */
    private String agencyName;

    /**
     * URL of the transit agency.
     */
    private String agencyUrl;

    /**
     * Timezone where the transit agency is located.
     * If multiple agencies are specified in the dataset, each must have the same agency_timezone.
     */
    private String agencyTimezone;

    /**
     * Primary language used by this transit agency.
     * Should be provided to help GTFS consumers choose capitalization rules and other language-specific settings for the dataset.
     */
    private String agencyLang;

    /**
     * A voice telephone number for the specified agency.
     * This field is a string value that presents the telephone number as typical for the agency's service area.
     * It may contain punctuation marks to group the digits of the number.
     * Dialable text (for example, TriMet's "503-238-RIDE") is permitted, but the field must not contain any other descriptive text.
     */
    private String agencyPhone;

    /**
     * URL of a web page that allows a rider to purchase tickets or other fare instruments for that agency online.
     */
    private String agencyFareUrl;

    /**
     * Email address actively monitored by the agency’s customer service department.
     * This email address should be a direct contact point where transit riders can reach a customer service representative at the agency.
     */
    private String agencyEmail;

}
