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
        divisionUnderTest.setStartBirthYear("2011");
        divisionUnderTest.setEndBirthYear("2012");

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


@Test
public void testisPlayerEligibleU18() {
    Division divisionUnderTest = new Division();
    divisionUnderTest.setId(1);
    divisionUnderTest.setName("U18 - Test");
    divisionUnderTest.setStartBirthYear("2008");
    divisionUnderTest.setEndBirthYear("2010");

    Player u18Player = new Player();
    u18Player.setId(1);
    u18Player.setFirstName("Test");
    u18Player.setLastName("Player");
    u18Player.setBirthday(Calendar.getInstance());

    Assertions.assertFalse(divisionUnderTest.isPlayerEligible(u18Player));

    Calendar u15PlayersBirthday = u18Player.getBirthday();
    u15PlayersBirthday.set(Calendar.YEAR, 2009);

    Assertions.assertTrue(divisionUnderTest.isPlayerEligible(u18Player));

    u15PlayersBirthday = u18Player.getBirthday();
    u15PlayersBirthday.set(Calendar.YEAR, 2008);

    Assertions.assertTrue(divisionUnderTest.isPlayerEligible(u18Player));

    u15PlayersBirthday = u18Player.getBirthday();
    u15PlayersBirthday.set(Calendar.YEAR, 2010);

    Assertions.assertTrue(divisionUnderTest.isPlayerEligible(u18Player));

    u15PlayersBirthday = u18Player.getBirthday();
    u15PlayersBirthday.set(Calendar.YEAR, 2007);

    Assertions.assertFalse(divisionUnderTest.isPlayerEligible(u18Player));

    u15PlayersBirthday = u18Player.getBirthday();
    u15PlayersBirthday.set(Calendar.YEAR, 2011);

    Assertions.assertFalse(divisionUnderTest.isPlayerEligible(u18Player));

}

    @Test
    public void testisPlayerEligibleNullBirthday() {
        Division divisionUnderTest = new Division();
        divisionUnderTest.setId(1);
        divisionUnderTest.setName("U18 - Test");
        divisionUnderTest.setStartBirthYear("2008");
        divisionUnderTest.setEndBirthYear("2010");

        Player u18Player = new Player();
        u18Player.setId(1);
        u18Player.setFirstName("Test");
        u18Player.setLastName("Player");
        u18Player.setBirthday(null);

        Assertions.assertFalse(divisionUnderTest.isPlayerEligible(u18Player));

    }
}