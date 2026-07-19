/*
Represents an active or historical login session
 */

package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import com.matlasystems.chat.common.enums.DeviceType;

public class Session {

    private Long id;

    private Long userId;

    private String sessionId;

    private String accessToken;

    private String refreshToken;

    private String ipAddress;

    private String deviceName;

    private DeviceType deviceType;

    private String operatingSystem;

    private String browser;

    private String location;

    private LocalDateTime loginTime;

    private LocalDateTime lastActivity;

    private LocalDateTime expiresAt;

    private boolean active;

    public Session() {
    }

    public Session(Long id,
                   Long userId,
                   String sessionId,
                   String accessToken,
                   String refreshToken,
                   String ipAddress,
                   String deviceName,
                   DeviceType deviceType,
                   String operatingSystem,
                   String browser,
                   String location,
                   LocalDateTime loginTime,
                   LocalDateTime lastActivity,
                   LocalDateTime expiresAt,
                   boolean active) {

        this.id = id;
        this.userId = userId;
        this.sessionId = sessionId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.ipAddress = ipAddress;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.operatingSystem = operatingSystem;
        this.browser = browser;
        this.location = location;
        this.loginTime = loginTime;
        this.lastActivity = lastActivity;
        this.expiresAt = expiresAt;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public LocalDateTime getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(LocalDateTime lastActivity) {
        this.lastActivity = lastActivity;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}