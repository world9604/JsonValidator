package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.Pattern;

import device.apps.jsonvalidator.Util;
import uk.co.jemos.podam.common.PodamStringValue;

public class CertEntity
{
    @PodamStringValue
    @Pattern(regexp = "^(Wi-Fi|VPN_App)$", message = "allowed_key_list_msg::Wi-Fi|VPN_App")
    @Expose
    @SerializedName(Util.KEY_CER_TYPE)
    private String cer_type;

    @Expose
    @SerializedName(Util.KEY_CER_PATH)
    private String cer_path;

    @Expose
    @SerializedName(Util.KEY_CER_PASS)
    private String cer_pass;

    public String getCer_type() {
        return cer_type;
    }

    public void setCer_type(String cer_type) {
        this.cer_type = cer_type;
    }

    public String getCer_path() {
        return cer_path;
    }

    public void setCer_path(String cer_path) {
        this.cer_path = cer_path;
    }

    public String getCer_pass() {
        return cer_pass;
    }

    public void setCer_pass(String cer_pass) {
        this.cer_pass = cer_pass;
    }
}
