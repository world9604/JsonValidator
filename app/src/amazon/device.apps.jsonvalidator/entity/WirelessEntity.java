package device.apps.jsonvalidator.entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.Pattern;

import uk.co.jemos.podam.common.PodamStringValue;


public class WirelessEntity {
    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|ON|OFF)$", message = "allowed_key_list_msg::Keep Current Option|ON|OFF")
    @Expose
    @SerializedName("nfc")
    private String nfc;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|ON|OFF)$", message = "allowed_key_list_msg::Keep Current Option|ON|OFF")
    @Expose
    @SerializedName("bluetooth")
    private String bluetooth;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|ON|OFF)$", message = "allowed_key_list_msg::Keep Current Option|ON|OFF")
    @Expose
    @SerializedName("wlan")
    private String wlan;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|ON|OFF)$", message = "allowed_key_list_msg::Keep Current Option|ON|OFF")
    @Expose
    @SerializedName("ethernet")
    private String ethernet;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|ON|OFF)$", message = "allowed_key_list_msg::Keep Current Option|ON|OFF")
    @Expose
    @SerializedName("gps")
    private String gps;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|ON|OFF)$", message = "allowed_key_list_msg::Keep Current Option|ON|OFF")
    @Expose
    @SerializedName("airplane")
    private String airplane;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|ON|OFF)$", message = "allowed_key_list_msg::Keep Current Option|ON|OFF")
    @Expose
    @SerializedName("power_menu")
    private String power_menu;

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getEthernet() {
        return ethernet;
    }

    public void setEthernet(String ethernet) {
        this.ethernet = ethernet;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getPower_menu() {
        return power_menu;
    }

    public void setPower_menu(String power_menu) {
        this.power_menu = power_menu;
    }
}