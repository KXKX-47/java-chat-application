/*
Configure a users notification preferences
 */

package com.matlasystems.chat.common.dto.notification;

public class NotificationSettingsRequest {

    private Long userId;

    private boolean emailNotifications;

    private boolean pushNotifications;

    private boolean smsNotifications;

    private boolean desktopNotifications;

    private boolean soundEnabled;

    private boolean vibrationEnabled;

    public NotificationSettingsRequest() {
    }

    public NotificationSettingsRequest(Long userId,
                                       boolean emailNotifications,
                                       boolean pushNotifications,
                                       boolean smsNotifications,
                                       boolean desktopNotifications,
                                       boolean soundEnabled,
                                       boolean vibrationEnabled) {

        this.userId = userId;
        this.emailNotifications = emailNotifications;
        this.pushNotifications = pushNotifications;
        this.smsNotifications = smsNotifications;
        this.desktopNotifications = desktopNotifications;
        this.soundEnabled = soundEnabled;
        this.vibrationEnabled = vibrationEnabled;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isEmailNotifications() {
        return emailNotifications;
    }

    public void setEmailNotifications(boolean emailNotifications) {
        this.emailNotifications = emailNotifications;
    }

    public boolean isPushNotifications() {
        return pushNotifications;
    }

    public void setPushNotifications(boolean pushNotifications) {
        this.pushNotifications = pushNotifications;
    }

    public boolean isSmsNotifications() {
        return smsNotifications;
    }

    public void setSmsNotifications(boolean smsNotifications) {
        this.smsNotifications = smsNotifications;
    }

    public boolean isDesktopNotifications() {
        return desktopNotifications;
    }

    public void setDesktopNotifications(boolean desktopNotifications) {
        this.desktopNotifications = desktopNotifications;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public boolean isVibrationEnabled() {
        return vibrationEnabled;
    }

    public void setVibrationEnabled(boolean vibrationEnabled) {
        this.vibrationEnabled = vibrationEnabled;
    }

}