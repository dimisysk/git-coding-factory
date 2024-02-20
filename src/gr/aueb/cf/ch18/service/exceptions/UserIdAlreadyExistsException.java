package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.MobileContact;

public class UserIdAlreadyExistsException extends Exception {
    private static final long serialVersionUID = 3443561L;

    public UserIdAlreadyExistsException(MobileContact mobileContact) {
        super("Mobile contact with  ID: " + mobileContact.getId() + "already exists.");
    }
}
