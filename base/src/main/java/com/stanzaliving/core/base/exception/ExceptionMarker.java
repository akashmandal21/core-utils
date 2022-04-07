package com.stanzaliving.core.base.exception;

public enum ExceptionMarker {

     DS_001("Incorrect Otp request dto"),
     DS_002("Empty residence dispatch meal"),
     DS_003("Shortage submission failed "),
     DS_004("Leftover submission failed "),
     DS_005("residenceFoodId is mandatory"),
     DS_006("Required flow is already verified"),
     DS_007("Can't parse to double"),
     DS_008("Update food dispatch sequence is incorrect"),
     DS_009("latitude and longitude are mandatory to mark i have reached"),
     DS_010("Delivery request mismatched with residence food"),
     DS_011("MenuDate is not valid"),
     DS_012("Unable to upload receiving slip."),
     DS_013("Food receiving is not completed"),
     DS_014("Please ask the driver to tap on I Have Reached option on the app"),
     DS_015("Please give otp to driver to complete delivery handshake"),
     DS_016("Meal not dispatched"),
     DS_017("Update food dispatch sequence is incorrect"),
     DS_018("No Data found"),
     DS_019("No dispatched meal details found to initiate"),
     DS_020("No Food dispatched meal details found");

    private String message;

    ExceptionMarker(String message) {
        this.message = message;
    }

    public ApiValidationException getApiValidationException() {
        ApiValidationException apiValidationException = new ApiValidationException(this.message, this.name());
        return apiValidationException;
    }
}
