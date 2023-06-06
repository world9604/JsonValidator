package device.apps.jsonvalidator.entity.eminstall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DirectCloneEntity {
    @Expose
    @SerializedName("dc_backup_fil_url")
    private String dc_backup_fil_url;

    @Expose
    @SerializedName("dc_backup_password")
    private String dc_backup_password;

    public String getDc_backup_fil_url() {
        return dc_backup_fil_url;
    }

    public void setDc_backup_fil_url(String dc_backup_fil_url) {
        this.dc_backup_fil_url = dc_backup_fil_url;
    }

    public String getDc_backup_password() {
        return dc_backup_password;
    }

    public void setDc_backup_password(String dc_backup_password) {
        this.dc_backup_password = dc_backup_password;
    }
}
