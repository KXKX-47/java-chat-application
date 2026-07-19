package com.matlasystems.chat.common.constants;

public final class NetworkConstants {

    private NetworkConstants() {
    }

    /*
     * Default Server Configuration
     */
    public static final String DEFAULT_HOST = "localhost";

    public static final String LOCALHOST = "127.0.0.1";

    public static final int DEFAULT_PORT = 8080;

    public static final int SOCKET_TIMEOUT = 30000;

    /*
     * Port Range
     */
    public static final int MIN_PORT = 1;

    public static final int MAX_PORT = 65535;

    /*
     * Protocols
     */
    public static final String HTTP = "http";

    public static final String HTTPS = "https";

    public static final String TCP = "tcp";

    public static final String UDP = "udp";

    public static final String WS = "ws";

    public static final String WSS = "wss";

}