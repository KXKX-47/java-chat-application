package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AuthenticationProviderTest {

    @Test
    void shouldContainAllAuthenticationProviders() {

        AuthenticationProvider[] providers =
                AuthenticationProvider.values();

        assertEquals(5, providers.length);

        assertEquals(AuthenticationProvider.LOCAL, providers[0]);
        assertEquals(AuthenticationProvider.GOOGLE, providers[1]);
        assertEquals(AuthenticationProvider.MICROSOFT, providers[2]);
        assertEquals(AuthenticationProvider.GITHUB, providers[3]);
        assertEquals(AuthenticationProvider.FACEBOOK, providers[4]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(AuthenticationProvider.LOCAL,
                AuthenticationProvider.valueOf("LOCAL"));

        assertEquals(AuthenticationProvider.GOOGLE,
                AuthenticationProvider.valueOf("GOOGLE"));

        assertEquals(AuthenticationProvider.MICROSOFT,
                AuthenticationProvider.valueOf("MICROSOFT"));

        assertEquals(AuthenticationProvider.GITHUB,
                AuthenticationProvider.valueOf("GITHUB"));

        assertEquals(AuthenticationProvider.FACEBOOK,
                AuthenticationProvider.valueOf("FACEBOOK"));

    }

    @Test
    void shouldReturnCorrectEnumNames() {

        assertEquals("LOCAL",
                AuthenticationProvider.LOCAL.name());

        assertEquals("GOOGLE",
                AuthenticationProvider.GOOGLE.name());

        assertEquals("MICROSOFT",
                AuthenticationProvider.MICROSOFT.name());

        assertEquals("GITHUB",
                AuthenticationProvider.GITHUB.name());

        assertEquals("FACEBOOK",
                AuthenticationProvider.FACEBOOK.name());

    }

}