package de.noahlehmann.hofbusapi.util.gtfs.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "Agency", description = "Transit agencies with service represented in this dataset.")
public class Agency {


    /**
     * Identifies a transit brand which is often synonymous with a transit agency.
     * Note that in some cases, such as when a single agency operates multiple separate services, agencies and brands are distinct.
     * A dataset may contain data from multiple agencies.
     * Conditionally Required:
     * - Required when the dataset contains data for multiple transit agencies.
     * - Optional otherwise.
     */
    @Schema(name = "agency_id",
            description = "Identifies a transit brand which is often synonymous with a transit agency. " +
                    "Note that in some cases, such as when a single agency operates multiple separate services, " +
                    "agencies and brands are distinct. A dataset may contain data from multiple agencies.",
            example = "hofbus"
    )
    private String agencyId;

    /**
     * Full name of the transit agency.
     */
    @Schema(name = "agency_name",
            description = "Full name of the transit agency.",
            example = "HofBus GmbH"
    )
    private String agencyName;

    /**
     * URL of the transit agency.
     */
    @Schema(name = "agency_url",
            description = "URL of the transit agency.",
            example = "www.hofbus.de"
    )
    private String agencyUrl;

    /**
     * Timezone where the transit agency is located.
     * If multiple agencies are specified in the dataset, each must have the same agency_timezone.
     */
    @Schema(name = "agency_timezone",
            description = "Timezone where the transit agency is located." +
                    "If multiple agencies are specified in the dataset, each must have the same agency_timezone.",
            example = "Europe/Berlin"
    )
    private String agencyTimezone;

    /**
     * Primary language used by this transit agency.
     * Should be provided to help GTFS consumers choose capitalization rules and other language-specific settings for the dataset.
     */
    @Schema(name = "agency_lang",
            description = "Primary language used by this transit agency." +
                    "Should be provided to help GTFS consumers choose capitalization rules and " +
                    "other language-specific settings for the dataset.",
            example = "de"
    )
    private String agencyLang;

    /**
     * A voice telephone number for the specified agency.
     * This field is a string value that presents the telephone number as typical for the agency's service area.
     * It may contain punctuation marks to group the digits of the number.
     * Dialable text (for example, TriMet's "503-238-RIDE") is permitted, but the field must not contain any other descriptive text.
     */
    @Schema(name = "agency_phone",
            description = "A voice telephone number for the specified agency." +
                    "This field is a string value that presents the telephone number as typical for the agency's service area." +
                    "It may contain punctuation marks to group the digits of the number." +
                    "Dialable text (for example, TriMet's \"503-238-RIDE\") is permitted, " +
                    "but the field must not contain any other descriptive text.",
            example = "0123 4567890"
    )
    private String agencyPhone;

    /**
     * URL of a web page that allows a rider to purchase tickets or other fare instruments for that agency online.
     */
    @Schema(name = "agency_fare_url",
            description = "URL of a web page that allows a rider to purchase tickets or other fare instruments for that agency online.",
            example = "www.hofbus.de/tickets"
    )
    private String agencyFareUrl;

    /**
     * Email address actively monitored by the agency’s customer service department.
     * This email address should be a direct contact point where transit riders can reach a customer service representative at the agency.
     */
    @Schema(name = "agency_email",
            description = "Email address actively monitored by the agency’s customer service department.",
            example = "info@hofbus.de"
    )
    private String agencyEmail;

}
