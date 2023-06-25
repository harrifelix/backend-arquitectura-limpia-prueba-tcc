package com.example.demo.utils;

import com.example.demo.domain.model.exceptions.ApplicationException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationExceptionTest {

    private static final String MESSAGE = "MESSAGE";

    @Test
    public void testApplicationExceptionConstructorWithMessage() {
        ApplicationException applicationException = new ApplicationException(MESSAGE);

        assertEquals(MESSAGE, applicationException.getMessage());
        assertNull(applicationException.getCause());
    }

    @Test
    public void testApplicationExceptionConstructorWithNullMessage() {
        ApplicationException applicationException = new ApplicationException(null);

        assertNull(applicationException.getMessage());
        assertNull(applicationException.getCause());
    }

    @Test
    public void testApplicationExceptionConstructorWithMessageAndCause() {
        ApplicationException applicationException = new ApplicationException(MESSAGE, new Exception());

        assertEquals(MESSAGE, applicationException.getMessage());
        assertNotNull(applicationException.getCause());
        assertThat(applicationException.getCause(), instanceOf(Exception.class));
    }

    @Test
    public void testApplicationExceptionConstructorWithNullCause() {
        ApplicationException applicationException = new ApplicationException(MESSAGE, null);

        assertEquals(MESSAGE, applicationException.getMessage());
        assertNull(applicationException.getCause());
    }
}