package com.tdea.pretest;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void UserUtils () {
        String dbPassword = ("Alex");
        String password = ("Alex");

        UserUtils userUtils = new UserUtils();
        assertTrue(userUtils.isPasswordEqual(dbPassword,password));
    }

}
