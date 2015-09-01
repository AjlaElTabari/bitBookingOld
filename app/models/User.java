package models;

import java.util.Calendar;
import java.util.Date;

/**
 * Model of Buyer. Buyer is a person who sign up into database on bitBooking.com web page
 * and has permission to browse for offerings and buy accommodation.
 */
public class Buyer {
    /*
     * Buyer attributes
     */
    public Integer id;
    public String name;
    public String lastName;
    public String email;
    public String cityZipCode;
    public Integer userType;
    public String password;
    public Boolean gender;
    public Date date;

    /**
     * Default constructor
     */
    public Buyer() {
    }

    /**
     * Constructor for creating new Buyer object.
     *
     * @param name        - Buyer's first name.
     * @param lastName    - Buyer's last name.
     * @param email       - Buyer's email address.
     * @param cityZipCode - Buyer's postal code.
     * @param userType    - Type of buyer.
     * @param password    - Buyer's password.
     * @param gender      - Male or female
     */
    public Buyer(String name, String lastName, String email, String cityZipCode, Integer userType, String password, Boolean gender) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.cityZipCode = cityZipCode;
        this.userType = userType;
        this.password = password;
        this.gender = gender;
        this.date = Calendar.getInstance().getTime();
    }
}
