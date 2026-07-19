/*
Stores web socket configuration values used for real time communication
*/

package com.matlasystems.chat.common.constants;

public final class WebSocketConstants {

    private WebSocketConstants() {
        
    }

    public static final String WS_ENDPOINT = "/chat";

    public static final String TOPIC_MESSAGES = "/topic/messages";

    public static final String TOPIC_USERS = "/topic/users";

    public static final String APP_PREFIX = "/app";
}