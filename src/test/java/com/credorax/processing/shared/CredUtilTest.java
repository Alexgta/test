package com.credorax.processing.shared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredUtilTest {

    @Test
    void expDateIsValidTest() {
        assertTrue(CredUtil.expDateIsValid("0135"));
        assertFalse(CredUtil.expDateIsValid("0120"));
    }

    @Test
    void emailIsInValidFormatTest() {
        assertTrue(CredUtil.emailIsInValidFormat("JhonSmith@google.com"));
        assertFalse(CredUtil.emailIsInValidFormat("JhonSmithgoogle.com"));
        assertFalse(CredUtil.emailIsInValidFormat("JhonSmith@googlecom"));
        assertFalse(CredUtil.emailIsInValidFormat("Jhon#Smith@google.com"));
        assertFalse(CredUtil.emailIsInValidFormat("JhonSmith@j.com"));
        assertFalse(CredUtil.emailIsInValidFormat("0120"));
    }

    @Test
    void luhnCheckTest() {
        assertTrue(CredUtil.panIsValid("4012888888881881"));
        assertFalse(CredUtil.panIsValid("401288888888188"));
        assertFalse(CredUtil.panIsValid("40128888888818812"));
        assertFalse(CredUtil.panIsValid("4012888888881882"));
        assertFalse(CredUtil.panIsValid("1234567890123456"));
        assertFalse(CredUtil.panIsValid("123456789"));
    }


}