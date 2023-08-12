package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class OSUpdateEntity {
    @Expose
    @SerializedName("os_version")
    private String os_version;

    @Expose
    @SerializedName("factory_reset")
    private String factory_reset;

    @Expose
    @SerializedName("scanner_reset")
    private String scanner_reset;

    @Expose
    @SerializedName("user_bypass")
    private String user_bypass;

    @Expose
    @SerializedName("download_url")
    private ArrayList<String> download_url;


    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getFactory_reset() {
        return factory_reset;
    }

    public void setFactory_reset(String factory_reset) {
        this.factory_reset = factory_reset;
    }

    public String getScanner_reset() {
        return scanner_reset;
    }

    public void setScanner_reset(String scanner_reset) {
        this.scanner_reset = scanner_reset;
    }

    public String getUser_bypass() {
        return user_bypass;
    }

    public void setUser_bypass(String user_bypass) {
        this.user_bypass = user_bypass;
    }

    public ArrayList<String> getDownload_url() {
        return download_url;
    }

    public void setDownload_url(ArrayList<String> download_url) {
        this.download_url = download_url;
    }
}
