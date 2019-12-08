package com.library.librarysearchengine.domain;

import org.junit.jupiter.api.Test;
import com.library.librarysearchengine.Rental;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {

    @Test
    public void rentalTest(){
        Rental rental = new Rental();
        String expectedValue = "Rental[status=true]";
        assertEquals(expectedValue, rental.toString());
    }
}
