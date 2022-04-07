package com.stanzaliving.core.base.exception;

public enum ExceptionMarker {

     DS001("Shortage submission failed "),
     DS002("Leftover submission failed "),
     DS003("No Data found"),
     DS004("No dispatched meal details found to initiate"),
     DS005("No Food dispatched meal details found"),
     FS001("Unable to update dispatch summary"),
     FS002("Unable to receive food"),
     FS003("Failed to generate menu group"),
     FS004("Failed to capture request"),
     FS005("Failed to update status"),
     FS006("Failed to generate QR"),
     FS007("This is not a valid Stanza QR code."),
     FS008("Failed to update user hostel"),
     FS009("No Active Meal found for hostel"),
     FS010("Fail to add special event in the calendar"),
     FS011("Monthly budget planner details not found");

    private String message;

    ExceptionMarker(String message) {
        this.message = message;
    }

    public ApiValidationException getApiValidationException() {
        ApiValidationException apiValidationException = new ApiValidationException(this.message, this.name());
        return apiValidationException;
    }
}
