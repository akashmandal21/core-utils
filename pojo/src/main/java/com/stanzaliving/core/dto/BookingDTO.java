package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.BookingTypeEnum;
import com.stanzaliving.core.enums.Nationality;
import com.stanzaliving.core.dto.AddressTransformationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {

    private Long id;

    private String uuid;

    private String residentUuid;

    private String residentFirstName;

    private String residentLastName;

    private String residentName;

    private String residentCode;

    private String residentMobileNumber;

    private Nationality residentNationality;

    private AddressTransformationDTO residentCurrentAddress;

    private AddressTransformationDTO residentPermanentAddress;

    private LocalDate residentDOB;

    private String bookingNumber;

    private BookingTypeEnum bookingType;

    private String agreement;

    private LocalDate contractStartDate;

    private LocalDate contractEndDate;

    private String cityUuid;

    private String cityName;

    private String microMarketUuid;

    private String microMarketName;

    private String residenceUuid;

    private String residenceName;

    private Set<DocumentDTO> documents;

    private long uploadedDocuments;

    private long pendingDocuments;

    private long totalRequiredDocuments;

    private boolean hasPendingDocuments;

    private boolean hasAutoApprovedDocuments;

    private boolean hasManuallyApprovedDocuments;

    private boolean hasRejectedDocuments;

    private ApprovalStatus approvalStatus;
}