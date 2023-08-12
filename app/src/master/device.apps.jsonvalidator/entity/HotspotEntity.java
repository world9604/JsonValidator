package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class HotspotEntity
{
    @Expose
    @SerializedName("hotspot_enable")
    private String hotspot_enable;

    @Expose
    @SerializedName("hotspot_name")
    private String hotspot_name;

    @Expose
    @SerializedName("security")
    private String security;

    @Expose
    @SerializedName("hotspot_password")
    private String hotspot_password;

    @Expose
    @SerializedName("ap_band")
    private String ap_band;

    public String getHotspot_enable()
    {
        return hotspot_enable;
    }

    public void setHotspot_enable(String hotspot_enable)
    {
        this.hotspot_enable = hotspot_enable;
    }

    public String getHotspot_name()
    {
        return hotspot_name;
    }

    public void setHotspot_name(String hotspot_name)
    {
        this.hotspot_name = hotspot_name;
    }

    public String getSecurity()
    {
        return security;
    }

    public void setSecurity(String security)
    {
        this.security = security;
    }

    public String getHotspot_password()
    {
        return hotspot_password;
    }

    public void setHotspot_password(String hotspot_password)
    {
        this.hotspot_password = hotspot_password;
    }

    public String getAp_band()
    {
        return ap_band;
    }

    public void setAp_band(String ap_band)
    {
        this.ap_band = ap_band;
    }
}
