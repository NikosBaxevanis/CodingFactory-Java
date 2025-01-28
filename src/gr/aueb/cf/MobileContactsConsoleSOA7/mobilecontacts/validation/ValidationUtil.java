package gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.validation;

import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactUpdateDTO;

public class ValidationUtil {

    private ValidationUtil() {

    }

    public static String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5) errorResponse += "Phone number must be greater\n";
        if (insertDTO.getFirstname().length() <2 ) errorResponse += "First name must have 2 or more chars\n";
        if (insertDTO.getLastname().length() <2) errorResponse += "Last name must have 2 or more chars\n";
        return errorResponse;
    }

    public static String validateDTO(MobileContactUpdateDTO updateDTO) {
        String errorResponse = "";

        if (updateDTO.getPhoneNumber().length() <= 5) errorResponse += "Phone number must be greater\n";
        if (updateDTO.getFirstname().length() <2 ) errorResponse += "First name must have 2 or more chars\n";
        if (updateDTO.getLastname().length() <2) errorResponse += "Last name must have 2 or more chars\n";
        return errorResponse;
    }
}
