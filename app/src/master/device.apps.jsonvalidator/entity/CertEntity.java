package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CertEntity
{
    @Expose
    @SerializedName("cer_type")
    private String cer_type;

    @Expose
    @SerializedName("cer_path")
    private String cer_path;

    @Expose
    @SerializedName("cer_pass")
    private String cer_pass;

    @Expose
    @SerializedName("cer_alias")
    private String cer_alias;

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

    public String getCer_alias() {
        return cer_alias;
    }

    public void setCer_alias(String cer_alias) {
        this.cer_alias = cer_alias;
    }
}
