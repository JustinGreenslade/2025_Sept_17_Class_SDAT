package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testisPlayerEligible() {
        Division divisionUnderTest = new Division();
        divisionUnderTest.setId(1);
        divisionUnderTest.setName("Test");
        divisionUnderTest.setStartBirthYear("2012");
        divisionUnderTest.setEndBirthYear("2011");

        Player u15Player = new Player();
        u15Player.setId(1);
        u15Player.setFirstName("Test");
        u15Player.setLastName("Player");
        u15Player.setBirthday(Calendar.getInstance());

        Assertions.assertFalse(divisionUnderTest.isPlayerEligible(u15Player));

        Calendar u15PlayersBirthday = u15Player.getBirthday();
        u15PlayersBirthday.set(Calendar.YEAR, 2012);

        Assertions.assertTrue(divisionUnderTest.isPlayerEligible(u15Player));


        u15PlayersBirthday = u15Player.getBirthday();
        u15PlayersBirthday.set(Calendar.YEAR, 2011);

        Assertions.assertTrue(divisionUnderTest.isPlayerEligible(u15Player));
    }
}