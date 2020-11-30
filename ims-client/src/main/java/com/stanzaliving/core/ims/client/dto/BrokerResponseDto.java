package com.stanzaliving.core.ims.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerResponseDto {

    private int id;

    private String name;

    private String email;

    private String mobile;

    private String createdBy;

    private String createdByName;

    private String createdByPhone;

    private Set<String> createdByRoles;

    private String status;

    private int statusOrdinal;

    private String panCard;

    private int panCardUploaded;

    private String gstNumber;

    private boolean GSTUploaded;

    private boolean cancelledChequeUploaded;

    private boolean GSTCertificateUploaded;

    private int cityId;

    private Set<BrokerDocumentRequestDTO> brokerDocuments = new HashSet<>(0);

    private BrokerPreferredPaymentMode preferredPaymentMode;

    private Date updated;

    private Date created;

    private int totalLeads = 0;

    private int totalClosure = 0;

    private int totalEarning = 0;

    private boolean enabled;

    private String paytmNumber;

    private String referrerPaytmNumber;

    private String referrerPaymentMethod;

    private String qrCodeLink;

    private String referralCode;

    private Boolean preferenceSubmitted;

    private Double tdsPercent;

    private Boolean allowUpdate;

}
