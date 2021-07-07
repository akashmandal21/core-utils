package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.vendor.enums.VendorType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OracleIntegrationVendorDto extends AbstractOracleDto {

    @NotNull
    @JsonProperty("entityid")
    private String entityid;  //set

    @NotNull
    @JsonProperty("isperson")
    private String isperson; //set

    @JsonProperty("salutation")
    private String salutation;

    @JsonProperty("firstName")
    private String firstName;  //set

    @JsonProperty("middlename")
    private String middlename;

    @JsonProperty("lastname")
    private String lastname;

    @NotNull
    @JsonProperty("companyname")
    private String companyname; //set

    @JsonProperty("url")
    private String url; //set

    @JsonProperty("brand")
    private String brand;  //set

    @JsonProperty("companyType")
    private String companyType; //set

    @JsonProperty("incorporationCertificate")
    private String incorporationCertificate; //set

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("vendorCode")
    private String vendorCode; //set

    @JsonProperty("vendorType")
    private VendorType vendorType; //set

    @JsonProperty("creatorDepartment")
    private String creatorDepartment;  //set

    @JsonProperty("addressbook")
    private OracleVendorAddressBookDto addressbook;  //set

    @JsonProperty("custentity_xxflx_msme_registered")
    private String custentityXxflxMsmeRegistered;  //set

    @JsonProperty("custentity_xxflx_msme_certificate_no")
    private String custentityXxflxMsmeCertificateNo;  //set

    @JsonProperty("msmeCertificate")
    private String msmeCertificate;  //set

    @JsonProperty("custentity_xxflx_fssai_registered")
    private String custentityXxflxFssaiRegistered;  //set

    @JsonProperty("custentity_xxflx_fssai_certification_no")
    private String custentityXxflxFssaiCertificationNo;  //set

    @JsonProperty("fssaiCertificate")
    private String fssaiCertificate;  //set

    @JsonProperty("custentity_xxflx_permanent_est_in_india")
    private String custentityXxflxPermanentEstInIndia;   //set

    @JsonProperty("custentity_xxflx_cin")
    private String custentityXxflxCin;    //set

    @JsonProperty("custentity_xxflx_tax_registered")
    private Boolean custentityXxflxTaxRegistered;   //set

    @JsonProperty("banks")
    private List<OracleVendorBankDto> banks;  //set

    @JsonProperty("custentity_xxflx_adv_credit_period_d")
    private Integer custentityXxflxAdvCreditPeriodD;  //set

    @JsonProperty("custentity_xxflx_retention_cr_period_d")
    private Integer custentityXxflxRetentionCrPeriodD;  //set

    @JsonProperty("custentity_xxflx_general_cr_period_d")
    private Integer custentityXxflxGeneralCrPeriodD;  //set

    @NotNull
    @JsonProperty("isinactive")
    private String isinactive;  //set

    @NotNull
    @JsonProperty("datecreated")
    private String datecreated;  //set

    @JsonProperty("accountnumber")
    private String accountnumber;

    @JsonProperty("expenseaccount")
    private String expenseaccount;

    @JsonProperty("payablesaccount")
    private String payablesaccount;

    @JsonProperty("incoterm")
    private String incoterm;

    @JsonProperty("currency")
    private String currency;  //set

    @JsonProperty("creditlimit")
    private String creditlimit;

    @NotNull
    @JsonProperty("panavailability")
    private String panavailability;  //set

    @NotNull
    @JsonProperty("custentity_permanent_account_number")
    private String custentityPermanentAccountNumber;  //set

    @JsonProperty("panCopy")
    private String panCopy;  //set

    @JsonProperty("otherSupportingDocument")
    private String otherSupportingDocument;

    @JsonProperty("form10f")
    private String form10f;  //set

    @JsonProperty("taxRegistrationCertificate")
    private String taxRegistrationCertificate;  //set

    @JsonProperty("referencenumber")
    private String referencenumber;

    @JsonProperty("custentity_in_tin_number")
    private String custentityInTinNumber;

    @NotNull
    @JsonProperty("custentity_in_gst_vendor_regist_type")
    private String custentityInGstVendorRegistType;   //set

    @JsonProperty("purchaseorderamount")
    private String purchaseorderamount;

    @JsonProperty("purchaseorderquantitydiff")
    private String purchaseorderquantitydiff;

    @JsonProperty("receiptquantity")
    private String receiptquantity;

    @JsonProperty("receiptamount")
    private String receiptamount;

    @JsonProperty("receiptquantitydiff")
    private String receiptquantitydiff;

    @JsonProperty("taxregistration")
    private OracleVendorTaxRegistrationDto taxregistration;  //set

    @JsonProperty("financialHealth")
    private List<OracleFinancialHealthDto> financialHealth;  //set

    @JsonProperty("contactdetails")
    private List<OracleContactDetailsDto> contactdetails;  //set

    @JsonProperty("teamProductionDetails")
    private List<OracleTeamProductionDetailsDto> teamProductionDetails;  //set

    @JsonProperty("GSTCertificates")
    private List<OracleGSTCertificatesDto> GSTCertificates;

    /*@JsonProperty("taxregistration")
    private String taxregistration;*/

}
