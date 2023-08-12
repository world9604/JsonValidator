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

    @Expose
    @SerializedName("onestep_os_version")
    private String onestep_os_version;

    @Expose
    @SerializedName("onestep_download_url")
    private ArrayList<String> onestep_download_url;

    @Expose
    @SerializedName("twostep_os_version")
    private String twostep_os_version;

    @Expose
    @SerializedName("twostep_download_url")
    private ArrayList<String> twostep_download_url;

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

    public String getOnestep_os_version()
    {
        return onestep_os_version;
    }

    public void setOnestep_os_version(String onestep_os_version)
    {
        this.onestep_os_version = onestep_os_version;
    }

    public ArrayList<String> getOnestep_download_url()
    {
        return onestep_download_url;
    }

    public void setOnestep_download_url(ArrayList<String> onestep_download_url)
    {
        this.onestep_download_url = onestep_download_url;
    }

    public String getTwostep_os_version()
    {
        return twostep_os_version;
    }

    public void setTwostep_os_version(String twostep_os_version)
    {
        this.twostep_os_version = twostep_os_version;
    }

    public ArrayList<String> getTwostep_download_url()
    {
        return twostep_download_url;
    }

    public void setTwostep_download_url(ArrayList<String> twostep_download_url)
    {
        this.twostep_download_url = twostep_download_url;
    }
}
