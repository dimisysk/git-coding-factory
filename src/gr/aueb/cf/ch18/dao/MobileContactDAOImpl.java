package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.MobileContact;

import java.util.ArrayList;
import java.util.List;

public class MobileContactDAOImpl implements IMobileContactDao {

    private static final List<MobileContact> contactas = new ArrayList<>();

    @Override
    public MobileContact insert(MobileContact mobileContact) {
        contactas.add(mobileContact);
        return mobileContact;
    }

    @Override
    public MobileContact update(MobileContact oldMobileContact, MobileContact newMobileContact) {
        contactas.set(contactas.indexOf(oldMobileContact), newMobileContact);
        return newMobileContact;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public MobileContact get(Long id) {
        return null;
    }

    @Override
    public List<MobileContact> getAll() {
        return null;
    }

    @Override
    public MobileContact getByPhone(String phoneNumber) {
        return null;
    }

    @Override
    public boolean phoneNumberExist(Long phoneNumber) {
        return false;
    }

    @Override
    public boolean userIdExists(Long id) {
        return false;
    }

    @Override
    public void delete(String phoneNumber) {

    }


}
