package com.stanzaliving.filixIntegration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.kafka.dto.KafkaDTO;
import com.stanzaliving.core.kafka.producer.NotificationProducer;
import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.filixIntegration.Dto.*;
import com.stanzaliving.filixIntegration.Enum.EventType;
import com.stanzaliving.filixIntegration.Enum.OracleServiceOwner;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.*;

@Service
@Transactional
public class CustomerCreationApiService extends CustomerApiFactory {

    private static final Logger logger = LoggerFactory.getLogger(CustomerCreationApiService.class);

    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    NotificationProducer notificationProducer;

    @Value("venta-integration")
    private String oracleIntegrationTopic;

    @Override
    public void produceOnKafkaForCreate(Map<Object, Object> dataMap) {
        logger.info("In CustomerCreationApiService packet received {} ",dataMap.toString());
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForCustomerCreation(dataMap));
        logger.info("final data map "+abstractOracleDto.getContextArgs());
        logger.info("In CustomerCreationApiService packet to produce {} ", abstractOracleDto);
        abstractOracleDto.setEventType(EventType.CREATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_CREATION);
        logger.info("In CustomerCreationApiService packet to produce {} ", abstractOracleDto);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "student", AbstractOracleDto.class.getName(), abstractOracleDto));
    }

    @Override
    public void produceOnKafkaForUpdate(Map<Object, Object> dataMap) {
        AbstractOracleDto abstractOracleDto = new AbstractOracleDto();
        abstractOracleDto.setContextArgs(getPayloadForCustomerCreation(dataMap));
        abstractOracleDto.setEventType(EventType.UPDATE);
        abstractOracleDto.setServiceOwner(OracleServiceOwner.CUSTOMER_CREATION);
        notificationProducer.publish(oracleIntegrationTopic,"student",new KafkaDTO("filix-integration", "student", AbstractOracleDto.class.getName(), abstractOracleDto));

    }

    private Map<String, Object> getPayloadForCustomerCreation(Map<Object, Object> dataMap) {
        Map<String, Object> mapToSend = new HashMap<>();
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            CustomerApiDto customerApiDto = objectMapper.readValue(dataMap.get("data").toString(), CustomerApiDto.class);
            logger.info("customerApiDto "+customerApiDto);
            if(null != customerApiDto) {
                FilixUserDetailResponseDto filixUserDetailResponseDto=customerApiDto.getFilixUserDetailResponseDto();
                FilixResidenceDetailsDto filixResidenceDetailsDto=customerApiDto.getFilixResidenceDetailsDto();
                FilixBookingDto booking = customerApiDto.getBooking();
                mapToSend.put(entityid,booking.getResidentId() );
                mapToSend.put(isPerson, Boolean.TRUE );
                mapToSend.put(salutation, Gender.MALE.toString().equals(filixUserDetailResponseDto.getGender()) ?"Mr":"Mrs" );
                mapToSend.put(firstName, filixUserDetailResponseDto.getFirstName());
                mapToSend.put(lastname, StringUtils.isNotEmpty(filixUserDetailResponseDto.getLastName()) ? filixUserDetailResponseDto.getLastName() : ".");
                mapToSend.put(custentity_xxflx_dateofbirth,filixUserDetailResponseDto.getBirthday());
                mapToSend.put(email, filixUserDetailResponseDto.getEmail());
                mapToSend.put(custentity_xxflx_gender, filixUserDetailResponseDto.getGender());
                mapToSend.put(phone,filixUserDetailResponseDto.getMobile());
                mapToSend.put(custentity_xxflx_nationality,".");
                mapToSend.put(bookingInfo, getBookingInfo(booking));
                mapToSend.put(addressbook, getAddressBook(booking,filixUserDetailResponseDto));

//                if(null != customerApiDto.getStudentOnboardingDetails()) {
//                    FilixIntegrationStudentOnboardingDetailsDto studentOnboardingDetails = customerApiDto.getStudentOnboardingDetails();
//                    mapToSend.put(custentity_xxflx_aadhar, StringUtils.isNotEmpty(studentOnboardingDetails.getAadhar()) ? studentOnboardingDetails.getAadhar() : "");
//                    mapToSend.put(custentity_xxflx_pantype, StringUtils.isNotEmpty(studentOnboardingDetails.getPanType()) ? studentOnboardingDetails.getPanType() : "");
//                    mapToSend.put(custentity_xxflx_pancard, StringUtils.isNotEmpty(studentOnboardingDetails.getPanCard()) ? studentOnboardingDetails.getPanCard() :"");
//                    mapToSend.put(custentity_xxflx_otherid, StringUtils.isNotEmpty(studentOnboardingDetails.getOtherIdName()) ? studentOnboardingDetails.getOtherIdName() : "");
//                    mapToSend.put(custentity_xxflx_otheridnumber, StringUtils.isNotEmpty(studentOnboardingDetails.getOtherId()) ? studentOnboardingDetails.getOtherId() : "");
//                }


                    mapToSend.put(custentity_xxflx_aadhar, ".");
                    mapToSend.put(custentity_xxflx_pantype, ".");
                    mapToSend.put(custentity_xxflx_pancard, ".");
                    mapToSend.put(custentity_xxflx_otherid, ".");
                    mapToSend.put(custentity_xxflx_otheridnumber, ".");

                mapToSend.put(custentity_xxflx_idnumber, ".");
                mapToSend.put(accountnumber, ".");
                mapToSend.put(receivablesaccount, "AR100");
                mapToSend.put(draccount, ".");
                mapToSend.put(pricelevel, ".");
                mapToSend.put(terms, ".");
                mapToSend.put(registrationtype,"Unregistered");
                mapToSend.put(isinactive, "F");
                mapToSend.put(currency, "INR");
                mapToSend.put(creditlimit,".");
                mapToSend.put(creditholdoverride, ".");

                mapToSend.put(taxregistration, getTaxregistration());

            }
        } catch (IOException e) {
            logger.error("Error occurred in getPayloadForCustomerCreation {}", e.getStackTrace());
        }
        return mapToSend;
    }


    private List<Map> getTaxregistration() {
        List<Map> itemList = new ArrayList<>();
        Map<String, Object> listMap = new HashMap<>();
        listMap.put(nexuscountry,".");
        listMap.put(nexus, ".");
        listMap.put(nexusstate, ".");
        listMap.put(taxregistrationnumber,".");
        listMap.put(address,".");
        listMap.put(default_str,".");
        itemList.add(listMap);
        return itemList;
    }

    private Object getAddressBook(FilixBookingDto bookingDto,FilixUserDetailResponseDto filixUserDetailResponseDto) {
        Map<String, List<Map>> addressBook = new HashMap<>();
        List<Map> itemList = new ArrayList<>();
        Map<String, Object> listMap = new HashMap<>();
        listMap.put(label, ".");
        listMap.put(defaultbilling, Boolean.FALSE);
        listMap.put(defaultshipping,Boolean.TRUE);
        listMap.put(addressbookaddress,getAddressBookAddress(bookingDto,filixUserDetailResponseDto));
        itemList.add(listMap);

        addressBook.put(items, itemList);

        return addressBook;
    }

    private Object getAddressBookAddress(FilixBookingDto bookingDto,FilixUserDetailResponseDto filixUserDetailResponseDto) {

        Map<String, Object> mapToSend = new HashMap<>();
        mapToSend.put(addressee,".");
        if(null != bookingDto) {
            mapToSend.put(addr1, ".");
            mapToSend.put(addr2, ".");
            mapToSend.put(addr3, ".");
            mapToSend.put(state,".");
            mapToSend.put(zip, ".");
        }
        else {
            mapToSend.put(addr1, ".");
            mapToSend.put(addr2, ".");
            mapToSend.put(addr3, ".");
            mapToSend.put(state,".");
            mapToSend.put(zip, ".");
        }

        mapToSend.put(addrephone,filixUserDetailResponseDto.getMobile().getMobile());
        mapToSend.put(country,"IN");

        return mapToSend;
    }

    private List<Map<String, Object>> getBookingInfo( FilixBookingDto bookingDto) {
        Map<String, Object> mapToSend = new HashMap<>();
        mapToSend.put(bookingid,String.valueOf(bookingDto.getResidentId()));
        mapToSend.put(bookingtype, bookingDto.getBookingType().toString());
        mapToSend.put(startdate, DateUtil.convertDateToString(bookingDto.getContractStartDate(), DateUtil.dd_MMM_yyyy_Slash_Format));
        mapToSend.put(enddate, DateUtil.convertDateToString(bookingDto.getContractEndDate(), DateUtil.dd_MMM_yyyy_Slash_Format));
        mapToSend.put(agreementurl, "StringUtils.isNoneEmpty(student.getAgreementUrl()) ? student.getAgreementUrl() : ");
        mapToSend.put(addendumurl, "StringUtils.isNoneEmpty(student.getAddendumUrl()) ? student.getAddendumUrl() : ");
        return Arrays.asList(mapToSend);
    }


    private String entityid="entityid";
    private String isPerson="isPerson";
    private String salutation="salutation";
    private String firstName="firstName";
    private String lastname="lastname";
    private String custentity_xxflx_dateofbirth="custentity_xxflx_dateofbirth";
    private String email="email";
    private String custentity_xxflx_gender="custentity_xxflx_gender";
    private String phone="phone";
    private String custentity_xxflx_nationality="custentity_xxflx_nationality";
    private String bookingInfo = "bookingInfo";
    private String addressbook ="addressbook";
    private String addressbookaddress ="addressbookaddress";
    private String items ="items";
    private String bookingid="bookingid";
    private String bookingtype="bookingtype";
    private String startdate="startdate";
    private String enddate="enddate";
    private String agreementurl="agreementurl";
    private String addendumurl="addendumurl";
    private String label="label";
    private String defaultbilling="defaultbilling";
    private String defaultshipping=	"defaultshipping";
    private String addressee="addressee";
    private String addr1="addr1";
    private String addr2="addr2";
    private String addr3="addr3";
    private String addrephone="addrephone";
    private String country="country";
    private String state="state";
    private String zip="zip";
    private String custentity_xxflx_aadhar="custentity_xxflx_aadhar";
    private String custentity_xxflx_pantype="custentity_xxflx_pantype";
    private String custentity_xxflx_pancard="custentity_xxflx_pancard";
    private String registrationtype="registrationtype";
    private String custentity_xxflx_otherid="custentity_xxflx_otherid";
    private String custentity_xxflx_otheridnumber="custentity_xxflx_otheridnumber";
    private String custentity_xxflx_idnumber="custentity_xxflx_idnumber";
    private String isinactive="isinactive";
    private String accountnumber="accountnumber";
    private String receivablesaccount="receivablesaccount";
    private String draccount="draccount";
    private String pricelevel="pricelevel";
    private String terms="terms";
    private String currency="currency";
    private String creditlimit="creditlimit";
    private String creditholdoverride="creditholdoverride";
    private String taxregistration = "taxregistration";
    private String nexuscountry="nexuscountry";
    private String nexus="nexus";
    private String nexusstate="nexusstate";
    private String taxregistrationnumber="taxregistrationnumber";
    private String address=	"address";
    private String default_str=	"default";
    private String method = "HttpMethod";
    private String url_string = "url";
    private String url = "https://5742638-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=433&deploy=1";

}
