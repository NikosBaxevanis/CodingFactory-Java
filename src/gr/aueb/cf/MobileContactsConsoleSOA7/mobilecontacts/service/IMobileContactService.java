package gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.service;

import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.dto.MobileContactUpdateDTO;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.exceptions.ContactNotFoundException;
import gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactService {

    MobileContact insertMobileContact(MobileContactInsertDTO dto) throws PhoneNumberAlreadyExistsException;
    MobileContact updateMobileContact(MobileContactUpdateDTO dto) throws PhoneNumberAlreadyExistsException , ContactNotFoundException;
    void deleteContactById (Long id) throws ContactNotFoundException;
    MobileContact getContactById(Long id) throws ContactNotFoundException;
    List <MobileContact> getAllContacts();
}
