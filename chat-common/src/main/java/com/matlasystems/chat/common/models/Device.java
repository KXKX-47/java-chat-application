/*
Represents a device that has been registered oor authenticated with the chat platform
 */

package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;
import java.util.Objects;

import com.matlasystems.chat.common.enums.DeviceType;

public class Device {

    private Long id;

    private Long userId;

    private DeviceType deviceType;

    private String deviceName;

    private String operatingSystem;

    private String operatingSystemVersion;

    private String applicationVersion;

    private String ipAddress;

    private String macAddress;

    private String location;

    private boolean trusted;

    private LocalDateTime lastLogin;

    public Device() {
    }

    public Device(Long id,
                  Long userId,
                  DeviceType deviceType,
                  String deviceName,
                  String operatingSystem,
                  String operatingSystemVersion,
                  String applicationVersion,
                  String ipAddress,
                  String macAddress,
                  String location,
                  boolean trusted,
                  LocalDateTime lastLogin) {

        this.id = id;
        this.userId = userId;
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.operatingSystem = operatingSystem;
        this.operatingSystemVersion = operatingSystemVersion;
        this.applicationVersion = applicationVersion;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.location = location;
        this.trusted = trusted;
        this.lastLogin = lastLogin;
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

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Device)) {
            return false;
        }

        Device device = (Device) o;

        return Objects.equals(id, device.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        return "Device{" +
                "id=" + id +
                ", userId=" + userId +
                ", deviceType=" + deviceType +
                ", deviceName='" + deviceName + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", operatingSystemVersion='" + operatingSystemVersion + '\'' +
                ", applicationVersion='" + applicationVersion + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", location='" + location + '\'' +
                ", trusted=" + trusted +
                ", lastLogin=" + lastLogin +
                '}';
    }

}