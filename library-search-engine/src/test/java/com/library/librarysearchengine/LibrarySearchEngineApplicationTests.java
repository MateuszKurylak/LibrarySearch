package com.library.librarysearchengine;

import org.junit.jupiter.api.Test;
import com.library.librarysearchengine.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LibrarySearchEngineApplicationTests {

    @Autowired
    Rental rental;

    @Test
    void contextLoads() {
    }

    @Test
    public void rentalTest(){
        String expectedValue = "Rental[status=true]";
        assertEquals(expectedValue, rental.toString());
    }

}
