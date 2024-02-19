package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.MobileContact;

import java.util.List;

public interface IMobileContactDao {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(MobileContact oldMobileContact, MobileContact newMobileContact);
    void delete(Long id);
    MobileContact get(Long id);
    List<MobileContact> getAll();


    MobileContact getByPhone(String phoneNumber);
    boolean phoneNumberExist(Long phoneNumber);
    boolean userIdExists(Long id);
    void delete(String phoneNumber);
}
