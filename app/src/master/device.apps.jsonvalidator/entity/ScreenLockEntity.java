package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScreenLockEntity {
    @Expose
    @SerializedName("oldLockPassword")
    private String oldLockPassword;
    @Expose
    @SerializedName("lockType")
    private String lockType;

    @Expose
    @SerializedName("lockTypePassword")
    private String lockTypePassword;

    @Expose
    @SerializedName("lockScreenMsg")
    private String lockScreenMsg;

    @Expose
    @SerializedName("lockAfterTimeout")
    private String lockAfterTimeout;

    @Expose
    @SerializedName("powerButtonInstantlyLocks")
    private String powerButtonInstantlyLocks;

    public String getOldLockPassword() {
        return oldLockPassword;
    }

    public void setOldLockPassword(String oldLockPassword) {
        this.oldLockPassword = oldLockPassword;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public String getLockTypePassword() {
        return lockTypePassword;
    }

    public void setLockTypePassword(String lockTypePassword) {
        this.lockTypePassword = lockTypePassword;
    }

    public String getLockScreenMsg()
    {
        return lockScreenMsg;
    }

    public void setLockScreenMsg(String lockScreenMsg)
    {
        this.lockScreenMsg = lockScreenMsg;
    }

    public String getLockAfterTimeout() {
        return lockAfterTimeout;
    }

    public void setLockAfterTimeout(String lockAfterTimeout) {
        this.lockAfterTimeout = lockAfterTimeout;
    }

    public String getPowerButtonInstantlyLocks() {
        return powerButtonInstantlyLocks;
    }

    public void setPowerButtonInstantlyLocks(String powerButtonInstantlyLocks) {
        this.powerButtonInstantlyLocks = powerButtonInstantlyLocks;
    }
}
