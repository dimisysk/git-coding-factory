package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.MobileContact;
import gr.aueb.cf.ch18.model.UserDetails;

public class ContactNotFoundException extends Exception {

    private static final long serialVersionUID = 23435432L;

    public ContactNotFoundException(String phoneNumber) {
        super("The mobile contact with phone number " + phoneNumber + "not found");
    }

    public ContactNotFoundException(Long id) {
        super("The mobile contact with id: " + id + "not found");
    }

    public ContactNotFoundException(MobileContact mobileContact) {
        super("The mobile contact with id" + mobileContact.getId() + "and phone number " + mobileContact.getPhoneNumber() + "not found");
    }


}
