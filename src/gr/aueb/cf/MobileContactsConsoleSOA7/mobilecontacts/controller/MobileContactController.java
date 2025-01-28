package gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.controller;

import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dao.IMobileContactDAO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dao.MobileContactDAOImpl;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactReadOnlyDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.model.MobileContact;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.service.IMobileContactService;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.service.MobileContactServiceImpl;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.validation.ValidationUtil;

public class MobileContactController {
    private final IMobileContactDAO dao = new MobileContactDAOImpl() ;
    private final IMobileContactService service = new MobileContactServiceImpl(dao);

    public String insertContact (MobileContactInsertDTO insertDTO) {
        MobileContact mobileContact;
        MobileContactReadOnlyDTO readOnlyDTO;

        try {
            //Validate
            String error = ValidationUtil.validateDTO(insertDTO);
            if (!error.isEmpty()) {
                return "Error. " + "Validation error\n" + error;
            }

            mobileContact = service.insertMobileContact(insertDTO);
            readOnlyDTO = mapMobileContactToDTO(mobileContact);
            return "OK \n" + serializeDTO(readOnlyDTO);
        }catch (PhoneNumberAlreadyExistsException e) {
            return "Error \n" + e.getMessage() + "\n";
        }
    }

    private MobileContactReadOnlyDTO mapMobileContactToDTO (MobileContact) {
        return new MobileContactReadOnlyDTO(mapMobileContactToDTO().getId(), mapMobileContactToDTO().getFirstname(), mapMobileContactToDTO().getLastname(), mapMobileContactToDTO().getPhoneNumber())
    }

    private String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID: " +readOnlyDTO.getId() + ", Όνομα" + readOnlyDTO.getFirstname() + "Επώνυμο " + readOnlyDTO.getLastname() + "Τηλ αριθμός " +readOnlyDTO.getPhoneNumber();
    }
}
