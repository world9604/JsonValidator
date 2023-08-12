package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class WLanEntity {
    @Expose
    @SerializedName("set_wifi_internet_access_auto")
    private String wifi_internet_access_auto;

    @Expose
    @SerializedName("set_wifi_auto_join")
    private String wifi_auto_join;

    @Expose
    @SerializedName("set_wifi_reconnect_interval")
    private String wifi_reconnect_interval;

    @Expose
    @SerializedName("set_wifi_open_newtork_notification")
    private String open_newtork_notification;

    @Expose
    @SerializedName("set_wifi_whitelist")
    private String set_wifi_whitelist;

    @Expose
    @SerializedName("set_wifi_802_11d")
    private String wifi_802_11d;

    @Expose
    @SerializedName("set_wifi_scan_trigger")
    private String wifi_scan_trigger;

    @Expose
    @SerializedName("set_wifi_power_save")
    private String wifi_power_save;

    @Expose
    @SerializedName("set_wifi_roaming_trigger")
    private String wifi_roaming_trigger;

    @Expose
    @SerializedName("set_country_code")
    private String country_code;

    @Expose
    @SerializedName("set_band_frequency")
    private String band_frequency;

    @Expose
    @SerializedName("set_24Ghz_channel_list")
    private String list_24Ghz_channel_list;

    @Expose
    @SerializedName("set_5Ghz_channel_list")
    private String list_5Ghz_channel_list;

    @Expose
    @SerializedName("set_interSubnetRoaming")
    private String set_interSubnetRoaming;


    @Expose
    @SerializedName("cer_install")
    private ArrayList<CertEntity> cer_install;

    @Expose
    @SerializedName("wifi_config")
    private ArrayList<WifiEntity> wifi_config;

    @Expose
    @SerializedName("set_keepalive_mode")
    private String set_keepalive_mode;

    @Expose
    @SerializedName("set_scanning_throttling")
    private String set_scanning_throttling;

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

    public String getSet_wifi_whitelist()
    {
        return set_wifi_whitelist;
    }

    public void setSet_wifi_whitelist(String set_wifi_whitelist)
    {
        this.set_wifi_whitelist = set_wifi_whitelist;
    }

    public String getSet_interSubnetRoaming()
    {
        return set_interSubnetRoaming;
    }

    public void setSet_interSubnetRoaming(String set_interSubnetRoaming)
    {
        this.set_interSubnetRoaming = set_interSubnetRoaming;
    }

    public String getSet_keepalive_mode()
    {
        return set_keepalive_mode;
    }

    public void setSet_keepalive_mode(String set_keepalive_mode)
    {
        this.set_keepalive_mode = set_keepalive_mode;
    }

    public String getSet_scanning_throttling()
    {
        return set_scanning_throttling;
    }

    public void setSet_scanning_throttling(String set_scanning_throttling)
    {
        this.set_scanning_throttling = set_scanning_throttling;
    }
}
