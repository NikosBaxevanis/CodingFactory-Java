package gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.controller;

import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.core.serializer.Serializer;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dao.IMobileContactDAO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dao.MobileContactDAOImpl;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactReadOnlyDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactUpdateDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.exceptions.ContactNotFoundException;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.mapper.Mapper;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.model.MobileContact;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.service.IMobileContactService;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.service.MobileContactServiceImpl;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.validation.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

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
            readOnlyDTO = Mapper.mapMobileContactToDTO(mobileContact);
            return "OK \n" + Serializer.serializeDTO(readOnlyDTO);
        }catch (PhoneNumberAlreadyExistsException e) {
            return "Error \n" + e.getMessage() + "\n";
        }
    }

    public String updateContact (MobileContactUpdateDTO updateDTODTO) {
        MobileContact mobileContact;
        MobileContactReadOnlyDTO readOnlyDTO;

        try {
            //Validate
            String error = ValidationUtil.validateDTO(updateDTO);
            if (!error.isEmpty()) {
                return "Error. " + "Validation error\n" + error;
            }

            mobileContact = service.updateMobileContact(updateDTO);
            readOnlyDTO = Mapper.mapMobileContactToDTO(mobileContact);
            return "OK \n" + Serializer.serializeDTO(readOnlyDTO);
        }catch (PhoneNumberAlreadyExistsException  e) {
            return "Error \n" + e.getMessage() + "\n";
        }catch (ContactNotFoundException e) {
            return "Error \n" + e.getMessage() + "\n";

        }
    }

    public String deleteContactById(Long id) {
        try {
            service.deleteContactById(id);
            return "OK\n Η επαφή διαγράφηκε";
        } catch (ContactNotFoundException) {
            return "Error \n Λάθος κατά τη διαγραφή. Η επαφή δεν βρέθηκε";
        }
    }

    public  String getContactById (Long id) {
        MobileContact mobileContact;
        MobileContactReadOnlyDTO readOnlyDTO
        try {
            mobileContact = service.getContactById(id);
            readOnlyDTO = Mapper.mapMobileContactToDTO (mobileContact);
            return "OK\n" + Serializer.serializeDTO(readOnlyDTO);
        } catch (ContactNotFoundException e) {
            return "Error. \n Η επαφή δεν βρέθηκε \n";

        }
    }

    public List<String> getAllContacts() {
        List<MobileContact> contacts;
        List<String> serializedList = new ArrayList<>();
        String serialized;

        MobileContactReadOnlyDTO readOnlyDTO;
        contacts = service.getAllContacts();
        for (MobileContact contact : contacts) {
            readOnlyDTO = Mapper.mapMobileContactToDTO(contact);
            serialized = Serializer.serializeDTO(readOnlyDTO);
            serializedList.add(serialized);
        }
    }

  /*  private MobileContactReadOnlyDTO mapMobileContactToDTO (MobileContact) {
        return new MobileContactReadOnlyDTO(mapMobileContactToDTO().getId(), mapMobileContactToDTO().getFirstname(), mapMobileContactToDTO().getLastname(), mapMobileContactToDTO().getPhoneNumber())
    }

    private String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID: " +readOnlyDTO.getId() + ", Όνομα" + readOnlyDTO.getFirstname() + "Επώνυμο " + readOnlyDTO.getLastname() + "Τηλ αριθμός " +readOnlyDTO.getPhoneNumber();
    } */
}
