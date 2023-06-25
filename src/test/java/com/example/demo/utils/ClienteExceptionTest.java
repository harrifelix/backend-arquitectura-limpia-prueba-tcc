package com.example.demo.utils;

import com.example.demo.domain.model.exceptions.ClienteException;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ClienteExceptionTest {

    @org.junit.Test
    public void testClienteExceptionBuild() {
        ClienteException empleadorException = ClienteException.Type.CLIENTE_NO_ENVIADO.build();

        assertNotNull(empleadorException);
        assertNull(empleadorException.getCause());
    }

    @Test
    public void testClienteExceptionBuildWithThrowable() {
        ClienteException empleadorException = ClienteException.Type.CLIENTE_NO_ENVIADO.build(new IllegalArgumentException());

        assertNotNull(empleadorException);
        assertNotNull(empleadorException.getCause());
        Assert.assertThat(empleadorException.getCause(), Matchers.instanceOf(IllegalArgumentException.class));
    }
}