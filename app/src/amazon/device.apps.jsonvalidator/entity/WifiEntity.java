package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.Pattern;

import device.apps.jsonvalidator.Util;
import uk.co.jemos.podam.common.PodamStringValue;


public class WifiEntity
{
    @Expose
    @SerializedName(Util.KEY_WIFI_SSID)
    private String ssid;

    @PodamStringValue
    @Pattern(regexp = "^(true|false)$", message = "allowed_key_list_msg::true|false")
    @Expose
    @SerializedName(Util.KEY_WIFI_HIDE)
    private String hide;

    @PodamStringValue
    @Pattern(regexp = "^(true|false)$", message = "allowed_key_list_msg::true|false")
    @Expose
    @SerializedName(Util.KEY_WIFI_WHITE_LIST)
    private String whitelist;

    @Expose
    @SerializedName(Util.KEY_WIFI_PASSWORD)
    private String password;

    @PodamStringValue
    @Pattern(regexp = "^(None|wep|wpa2psk|802|CCX)$", message = "allowed_key_list_msg::None|wep|wpa2psk|802|CCX")
    @Expose
    @SerializedName(Util.KEY_WIFI_SECURITY)
    private String security;

    @PodamStringValue
    @Pattern(regexp = "^(None|md5|tls|ttls|peap|fast|leap)$", message = "allowed_key_list_msg::None|md5|tls|ttls|peap|fast|leap")
    @Expose
    @SerializedName(Util.KEY_WIFI_EAP)
    private String eap;

    @PodamStringValue
    @Pattern(regexp = "^(None|MSCHAPV2|GTC)$", message = "allowed_key_list_msg::None|MSCHAPV2|GTC")
    @Expose
    @SerializedName(Util.KEY_WIFI_P2AU)
    private String pa2au;

    @Expose
    @SerializedName(Util.KEY_WIFI_IDENTITY)
    private String identity;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Options|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Options|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_WIFI_DHCP_NTP)
    private String dhcp_ntp;

    @Expose
    @SerializedName(Util.KEY_CA_CERTIFICATE)
    private String ca_cer;

    @Expose
    @SerializedName(Util.KEY_WIFI_USER_CERT)
    private String user_cer;


    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getEap() {
        return eap;
    }

    public void setEap(String eap) {
        this.eap = eap;
    }

    public String getPa2au() {
        return pa2au;
    }

    public void setPa2au(String pa2au) {
        this.pa2au = pa2au;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getDhcp_ntp() {
        return dhcp_ntp;
    }

    public void setDhcp_ntp(String dhcp_ntp) {
        this.dhcp_ntp = dhcp_ntp;
    }

    public String getCa_cer() {
        return ca_cer;
    }

    public void setCa_cer(String ca_cer) {
        this.ca_cer = ca_cer;
    }

    public String getUser_cer() {
        return user_cer;
    }

    public void setUser_cer(String user_cer) {
        this.user_cer = user_cer;
    }

    public String getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(String whitelist) {
        this.whitelist = whitelist;
    }
}
