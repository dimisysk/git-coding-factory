package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.MobileContact;

public class PhoneNumberAlreadyExistsException extends Exception {
    private final static long serialVersionUID = 231234L;

    public PhoneNumberAlreadyExistsException(MobileContact mobileContact) {
        super("Mobile contact with Phone number: " + mobileContact.getPhoneNumber() + "already exists.");
    }
}
