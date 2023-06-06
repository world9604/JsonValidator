package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.Pattern;

import uk.co.jemos.podam.common.PodamStringValue;


public class ScreenLockEntity {
    @Expose
    @SerializedName("oldLockPassword")
    private String oldLockPassword;

    @PodamStringValue
    @Pattern(regexp = "^(None|Swipe|PIN|PASSWORD)$", message = "allowed_key_list_msg::None|Swipe|PIN|PASSWORD")
    @Expose
    @SerializedName("lockType")
    private String lockType;

    @Expose
    @SerializedName("lockTypePassword")
    private String lockTypePassword;

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
}
