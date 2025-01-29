package gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.core.serializer;

import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactReadOnlyDTO;

public class Serializer {

    private Serializer () {

    }

    public static String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID: " +readOnlyDTO.getId() + ", Όνομα" + readOnlyDTO.getFirstname() + "Επώνυμο " + readOnlyDTO.getLastname() + "Τηλ αριθμός " +readOnlyDTO.getPhoneNumber();
    }
}
