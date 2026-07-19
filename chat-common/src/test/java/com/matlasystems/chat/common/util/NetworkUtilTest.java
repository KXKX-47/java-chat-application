package com.matlasystems.chat.common.util;

import static org.junit.jupiter.api.Assertions.*;

import java.net.InetAddress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.constants.NetworkConstants;
import com.matlasystems.chat.common.exceptions.NetworkException;

class NetworkUtilTest {

    @Test
    @DisplayName("Should accept minimum valid port")
    void shouldAcceptMinimumPort() {

        assertTrue(
                NetworkUtil.isValidPort(NetworkConstants.MIN_PORT));

    }

    @Test
    @DisplayName("Should accept maximum valid port")
    void shouldAcceptMaximumPort() {

        assertTrue(
                NetworkUtil.isValidPort(NetworkConstants.MAX_PORT));

    }

    @Test
    @DisplayName("Should reject port below minimum")
    void shouldRejectPortBelowMinimum() {

        assertFalse(
                NetworkUtil.isValidPort(NetworkConstants.MIN_PORT - 1));

    }

    @Test
    @DisplayName("Should reject port above maximum")
    void shouldRejectPortAboveMaximum() {

        assertFalse(
                NetworkUtil.isValidPort(NetworkConstants.MAX_PORT + 1));

    }

    @Test
    @DisplayName("Should validate a valid port")
    void shouldValidateValidPort() {

        assertDoesNotThrow(() ->
                NetworkUtil.validatePort(NetworkConstants.DEFAULT_PORT));

    }

    @Test
    @DisplayName("Should throw for invalid port")
    void shouldThrowForInvalidPort() {

        assertThrows(
                NetworkException.class,
                () -> NetworkUtil.validatePort(-1));

    }

    @Test
    @DisplayName("Should identify localhost")
    void shouldIdentifyLocalhost() {

        assertTrue(
                NetworkUtil.isLocalhost("localhost"));

        assertTrue(
                NetworkUtil.isLocalhost("LOCALHOST"));

        assertTrue(
                NetworkUtil.isLocalhost("127.0.0.1"));

    }

    @Test
    @DisplayName("Should reject non-localhost")
    void shouldRejectNonLocalhost() {

        assertFalse(
                NetworkUtil.isLocalhost("google.com"));

    }

    @Test
    @DisplayName("Should reject null localhost")
    void shouldRejectNullHost() {

        assertFalse(
                NetworkUtil.isLocalhost(null));

    }

    @Test
    @DisplayName("Should resolve localhost")
    void shouldResolveLocalhost() {

        InetAddress address =
                NetworkUtil.resolveHost("localhost");

        assertNotNull(address);

    }

    @Test
    @DisplayName("Should throw for invalid hostname")
    void shouldThrowForInvalidHostname() {

        assertThrows(
                NetworkException.class,
                () -> NetworkUtil.resolveHost(
                        "host-that-does-not-exist.invalid"));

    }

    @Test
    @DisplayName("Should detect existing host")
    void shouldDetectExistingHost() {

        assertTrue(
                NetworkUtil.hostExists("localhost"));

    }

    @Test
    @DisplayName("Should detect missing host")
    void shouldDetectMissingHost() {

        assertFalse(
                NetworkUtil.hostExists(
                        "host-that-does-not-exist.invalid"));

    }

    @Test
    @DisplayName("Should return local hostname")
    void shouldReturnLocalHostName() {

        String hostname =
                NetworkUtil.getLocalHostName();

        assertNotNull(hostname);

        assertFalse(hostname.isBlank());

    }

    @Test
    @DisplayName("Should return local IP address")
    void shouldReturnLocalIPAddress() {

        String ip =
                NetworkUtil.getLocalIPAddress();

        assertNotNull(ip);

        assertFalse(ip.isBlank());

    }

}