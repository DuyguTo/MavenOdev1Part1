package Odev2;

import org.w3c.dom.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.IdentityHashMap;

public class Customer  {
    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String nationalId) {
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        NationalId = nationalId;


    }

    public String FirstName;
    public String LastName;
    public LocalDate DateOfBirth;
    public String NationalId;







}
