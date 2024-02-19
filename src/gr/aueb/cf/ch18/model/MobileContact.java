package gr.aueb.cf.ch18.model;

import java.util.Objects;

public class MobileContact extends AbstractEntity{
    private UserDetails userDetails;
    private String phoneNumber;


    public MobileContact() {

    }

    public MobileContact(UserDetails userDetails, String phoneNumber) {
        this.userDetails = new UserDetails(userDetails);
        this.phoneNumber = phoneNumber;
    }

    public UserDetails getUserDetails() {
        return new UserDetails(userDetails);
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = new UserDetails(userDetails);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "MobilleContact{" +
                "userDetails=" + userDetails +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileContact that = (MobileContact) o;
        return Objects.equals(userDetails, that.userDetails) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDetails, phoneNumber);
    }
}
