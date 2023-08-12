package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import device.apps.jsonvalidator.Util;
import uk.co.jemos.podam.common.PodamStringValue;


public class WLanEntity {
    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("set_wifi_internet_access_auto")
    private String wifi_internet_access_auto;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_WIFI_AUTO_JOIN)
    private String wifi_auto_join;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|5 Sec|10 Sec|15 Sec|20 Sec|25 Sec|30 Sec|60 Sec|120 Sec|160 Sec)$", message = "allowed_key_list_msg::Keep Current Option|5 Sec|10 Sec|15 Sec|20 Sec|25 Sec|30 Sec|60 Sec|120 Sec|160 Sec")
    @Expose
    @SerializedName("set_wifi_reconnect_interval")
    private String wifi_reconnect_interval;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("set_wifi_open_newtork_notification")
    private String open_newtork_notification;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_WIFI_802)
    private String wifi_802_11d;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|-50|-55|-60|-65|-70|-75|-80|-85|-90)$", message = "allowed_key_list_msg::Keep Current Option|-50|-55|-60|-65|-70|-75|-80|-85|-90")
    @Expose
    @SerializedName(Util.KEY_WIFI_BACKGROUND_SCAN_TRIGGERS)
    private String wifi_scan_trigger;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_WIFI_POWER_SAVE_MODE)
    private String wifi_power_save;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|-50|-55|-60|-65|-70|-75|-80|-85|-90)$", message = "allowed_key_list_msg::Keep Current Option|-50|-55|-60|-65|-70|-75|-80|-85|-90")
    @Expose
    @SerializedName(Util.KEY_WIFI_ROAMING_TRIGGER)
    private String wifi_roaming_trigger;

    @PodamStringValue
    @Pattern(regexp = "^[A-Za-z]{2}$", message = "allowed_key_list_msg::iso 3166-1 alpha-2 코드값")
    @Expose
    @SerializedName(Util.KEY_SET_COUNTRY_CODE)
    private String country_code;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Auto|2.4GHz|5GHz)$", message = "allowed_key_list_msg::Keep Current Option|Auto|2.4GHz|5GHz")
    @Expose
    @SerializedName(Util.KEY_SET_BAND_FREQUENCY)
    private String band_frequency;

    @Expose
    @SerializedName(Util.KEY_SET_24GHZ_CHANNEL)
    private String list_24Ghz_channel_list;

    @Expose
    @SerializedName(Util.KEY_SET_5GHZ_CHANNEL)
    private String list_5Ghz_channel_list;

    @Valid
    @Expose
    @SerializedName(Util.KEY_CER_CER_INSTALL)
    private ArrayList<CertEntity> cer_install;

    @Valid
    @Expose
    @SerializedName(Util.KEY_WIFI_WIFI_CONFIG)
    private ArrayList<WifiEntity> wifi_config;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_SCANNING_THROTTLING)
    private String set_scanning_throttling;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("set_keepalive_mode")
    private String set_keepalive_mode;

    public String getWifi_internet_access_auto() {
        return wifi_internet_access_auto;
    }

    public void setWifi_internet_access_auto(String wifi_internet_access_auto) {
        this.wifi_internet_access_auto = wifi_internet_access_auto;
    }

    public String getWifi_auto_join() {
        return wifi_auto_join;
    }

    public void setWifi_auto_join(String wifi_auto_join) {
        this.wifi_auto_join = wifi_auto_join;
    }

    public String getWifi_reconnect_interval() {
        return wifi_reconnect_interval;
    }

    public void setWifi_reconnect_interval(String wifi_reconnect_interval) {
        this.wifi_reconnect_interval = wifi_reconnect_interval;
    }

    public String getWifi_802_11d() {
        return wifi_802_11d;
    }

    public void setWifi_802_11d(String wifi_802_11d) {
        this.wifi_802_11d = wifi_802_11d;
    }

    public String getWifi_scan_trigger() {
        return wifi_scan_trigger;
    }

    public void setWifi_scan_trigger(String wifi_scan_trigger) {
        this.wifi_scan_trigger = wifi_scan_trigger;
    }

    public String getWifi_power_save() {
        return wifi_power_save;
    }

    public void setWifi_power_save(String wifi_power_save) {
        this.wifi_power_save = wifi_power_save;
    }

    public String getWifi_roaming_trigger() {
        return wifi_roaming_trigger;
    }

    public void setWifi_roaming_trigger(String wifi_roaming_trigger) {
        this.wifi_roaming_trigger = wifi_roaming_trigger;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getBand_frequency() {
        return band_frequency;
    }

    public void setBand_frequency(String band_frequency) {
        this.band_frequency = band_frequency;
    }

    public String getList_24Ghz_channel_list() {
        return list_24Ghz_channel_list;
    }

    public void setList_24Ghz_channel_list(String list_24Ghz_channel_list) {
        this.list_24Ghz_channel_list = list_24Ghz_channel_list;
    }

    public String getList_5Ghz_channel_list() {
        return list_5Ghz_channel_list;
    }

    public void setList_5Ghz_channel_list(String list_5Ghz_channel_list) {
        this.list_5Ghz_channel_list = list_5Ghz_channel_list;
    }

    public ArrayList<CertEntity> getCer_install() {
        return cer_install;
    }

    public void setCer_install(ArrayList<CertEntity> cer_install) {
        this.cer_install = cer_install;
    }

    public ArrayList<WifiEntity> getWifi_config() {
        return wifi_config;
    }

    public void setWifi_config(ArrayList<WifiEntity> wifi_config) {
        this.wifi_config = wifi_config;
    }

    public String getOpen_newtork_notification() {
        return open_newtork_notification;
    }

    public void setOpen_newtork_notification(String open_newtork_notification) {
        this.open_newtork_notification = open_newtork_notification;
    }

    public String getSet_scanning_throttling()
    {
        return set_scanning_throttling;
    }

    public void setSet_scanning_throttling(String set_scanning_throttling)
    {
        this.set_scanning_throttling = set_scanning_throttling;
    }

    public String getSet_keepalive_mode()
    {
        return set_keepalive_mode;
    }

    public void setSet_keepalive_mode(String set_keepalive_mode)
    {
        this.set_keepalive_mode = set_keepalive_mode;
    }
}
