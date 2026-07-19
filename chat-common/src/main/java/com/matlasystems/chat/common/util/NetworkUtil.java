package com.matlasystems.chat.common.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.matlasystems.chat.common.constants.NetworkConstants;
import com.matlasystems.chat.common.exceptions.NetworkException;

public final class NetworkUtil {

    private NetworkUtil() {
    }

    /**
     * Returns true if the supplied port is valid.
     */
    public static boolean isValidPort(int port) {

        return port >= NetworkConstants.MIN_PORT
                && port <= NetworkConstants.MAX_PORT;

    }

    /**
     * Throws an exception if the port is invalid.
     */
    public static void validatePort(int port) {

        if (!isValidPort(port)) {

            throw new NetworkException(
                    "Port must be between "
                    + NetworkConstants.MIN_PORT
                    + " and "
                    + NetworkConstants.MAX_PORT);

        }

    }

    /**
     * Returns true if host is localhost.
     */
    public static boolean isLocalhost(String host) {

        if (host == null) {
            return false;
        }

        return host.equalsIgnoreCase(NetworkConstants.DEFAULT_HOST)
                || host.equals(NetworkConstants.LOCALHOST);

    }

    /**
     * Resolve a hostname.
     */
    public static InetAddress resolveHost(String host) {

        try {

            return InetAddress.getByName(host);

        } catch (UnknownHostException e) {

            throw new NetworkException(
                    "Unable to resolve host: " + host,
                    e);

        }

    }

    /**
     * Returns true if a hostname can be resolved.
     */
    public static boolean hostExists(String host) {

        try {

            InetAddress.getByName(host);

            return true;

        } catch (UnknownHostException ex) {

            return false;

        }

    }

    /**
     * Returns the current machine hostname.
     */
    public static String getLocalHostName() {

        try {

            return InetAddress
                    .getLocalHost()
                    .getHostName();

        } catch (UnknownHostException e) {

            throw new NetworkException(
                    "Unable to determine local host name.",
                    e);

        }

    }

    /**
     * Returns the current machine IP address.
     */
    public static String getLocalIPAddress() {

        try {

            return InetAddress
                    .getLocalHost()
                    .getHostAddress();

        } catch (UnknownHostException e) {

            throw new NetworkException(
                    "Unable to determine local IP address.",
                    e);

        }

    }

}