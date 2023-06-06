/*
Description:
    Data structure for phone settings

Revision history:
    2019.7.30 by noah.ahn
        added support for VoLTE setting (added field volte_enable)
* */
package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import javax.validation.constraints.Pattern;

import uk.co.jemos.podam.common.PodamCollection;
import uk.co.jemos.podam.common.PodamStringValue;

public class PhoneValueEntity
{
    @Expose
    @SerializedName("apn_name")
    private String apn_name;
    @Expose
    @SerializedName("apn_apn")
    private String apn_apn;
    @Expose
    @SerializedName("apn_proxy")
    private String apn_proxy;
    @Expose
    @SerializedName("apn_port")
    private String apn_port;
    @Expose
    @SerializedName("apn_username")
    private String apn_username;
    @Expose
    @SerializedName("apn_password")
    private String apn_password;
    @Expose
    @SerializedName("apn_server")
    private String apn_server;
    @Expose
    @SerializedName("apn_mmsc")
    private String apn_mmsc;
    @Expose
    @SerializedName("apn_mms_proxy")
    private String apn_mms_proxy;
    @Expose
    @SerializedName("apn_mms_port")
    private String apn_mms_port;
    @Expose
    @SerializedName("apn_mcc")
    private String apn_mcc;
    @Expose
    @SerializedName("apn_mnc")
    private String apn_mnc;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|None|PAP|CHAP|PAP or CHAP)$", message = "allowed_key_list_msg::Keep Current Option|None|PAP|CHAP|PAP or CHAP")
    @Expose
    @SerializedName("apn_authentication")
    private String apn_authentication;
    @Expose
    @SerializedName("apn_apn_type")
    private String apn_apn_type;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|IPv4|IPv6|IPv4/IPv6)$", message = "allowed_key_list_msg::Keep Current Option|IPv4|IPv6|IPv4/IPv6")
    @Expose
    @SerializedName("apn_apn_protocol")
    private String apn_apn_protocol;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|IPv4|IPv6|IPv4/IPv6)$", message = "allowed_key_list_msg::Keep Current Option|IPv4|IPv6|IPv4/IPv6")
    @Expose
    @SerializedName("apn_apn_roaming_protocol")
    private String apn_apn_roaming_protocol;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|None|SPN|IMSI|GID|ICCID)$", message = "allowed_key_list_msg::Keep Current Option|None|SPN|IMSI|GID|ICCID")
    @Expose
    @SerializedName("apn_mvno_type")
    private String apn_mvno_type;
    @Expose
    @SerializedName("apn_mvno_value")
    private String apn_mvno_value;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|IPv4|IPv6|IPv4/IPv6)$", message = "allowed_key_list_msg::Keep Current Option|IPv4|IPv6|IPv4/IPv6")
    @Expose
    @SerializedName("apn_apn_enable")
    private String apn_apn_enable;

    @PodamCollection(nbrElements = 3)
    @Expose
    @SerializedName("apn_bearer")
    private ArrayList<String> apn_bearer;

    // START: VoLTE support; added by noah.ahn 20190730
    @PodamCollection(nbrElements = 3)
    @Expose
    @SerializedName("volte_enable")
    private ArrayList<String> volte_enable;
    // END: VoLTE support; added by noah.ahn 20190730

    @PodamStringValue
    @Pattern(regexp = "^(true|false)$", message = "allowed_key_list_msg::true|false")
    @Expose
    @SerializedName("isDefault")
    private String isDefault;

    public String getApn_name() {
        return apn_name;
    }

    public void setApn_name(String apn_name) {
        this.apn_name = apn_name;
    }

    public String getApn_apn() {
        return apn_apn;
    }

    public void setApn_apn(String apn_apn) {
        this.apn_apn = apn_apn;
    }

    public String getApn_proxy() {
        return apn_proxy;
    }

    public void setApn_proxy(String apn_proxy) {
        this.apn_proxy = apn_proxy;
    }

    public String getApn_port() {
        return apn_port;
    }

    public void setApn_port(String apn_port) {
        this.apn_port = apn_port;
    }

    public String getApn_username() {
        return apn_username;
    }

    public void setApn_username(String apn_username) {
        this.apn_username = apn_username;
    }

    public String getApn_password() {
        return apn_password;
    }

    public void setApn_password(String apn_password) {
        this.apn_password = apn_password;
    }

    public String getApn_server() {
        return apn_server;
    }

    public void setApn_server(String apn_server) {
        this.apn_server = apn_server;
    }

    public String getApn_mmsc() {
        return apn_mmsc;
    }

    public void setApn_mmsc(String apn_mmsc) {
        this.apn_mmsc = apn_mmsc;
    }

    public String getApn_mms_proxy() {
        return apn_mms_proxy;
    }

    public void setApn_mms_proxy(String apn_mms_proxy) {
        this.apn_mms_proxy = apn_mms_proxy;
    }

    public String getApn_mms_port() {
        return apn_mms_port;
    }

    public void setApn_mms_port(String apn_mms_port) {
        this.apn_mms_port = apn_mms_port;
    }

    public String getApn_mcc() {
        return apn_mcc;
    }

    public void setApn_mcc(String apn_mcc) {
        this.apn_mcc = apn_mcc;
    }

    public String getApn_mnc() {
        return apn_mnc;
    }

    public void setApn_mnc(String apn_mnc) {
        this.apn_mnc = apn_mnc;
    }

    public String getApn_authentication() {
        return apn_authentication;
    }

    public void setApn_authentication(String apn_authentication) {
        this.apn_authentication = apn_authentication;
    }

    public String getApn_apn_type() {
        return apn_apn_type;
    }

    public void setApn_apn_type(String apn_apn_type) {
        this.apn_apn_type = apn_apn_type;
    }

    public String getApn_apn_protocol() {
        return apn_apn_protocol;
    }

    public void setApn_apn_protocol(String apn_apn_protocol) {
        this.apn_apn_protocol = apn_apn_protocol;
    }

    public String getApn_apn_roaming_protocol() {
        return apn_apn_roaming_protocol;
    }

    public void setApn_apn_roaming_protocol(String apn_apn_roaming_protocol) {
        this.apn_apn_roaming_protocol = apn_apn_roaming_protocol;
    }

    public String getApn_mvno_type() {
        return apn_mvno_type;
    }

    public void setApn_mvno_type(String apn_mvno_type) {
        this.apn_mvno_type = apn_mvno_type;
    }

    public String getApn_mvno_value() {
        return apn_mvno_value;
    }

    public void setApn_mvno_value(String apn_mvno_value) {
        this.apn_mvno_value = apn_mvno_value;
    }

    public String getApn_apn_enable() {
        return apn_apn_enable;
    }

    public void setApn_apn_enable(String apn_apn_enable) {
        this.apn_apn_enable = apn_apn_enable;
    }

    public ArrayList<String> getApn_bearer() {
        return apn_bearer;
    }

    public void setApn_bearer(ArrayList<String> apn_bearer) { this.apn_bearer = apn_bearer;  }

    // START: VoLTE support; added by noah.ahn 20190730
    public ArrayList<String> getVolte_enable() {
        return volte_enable;
    }

    public void setVolte_enable(ArrayList<String> volte_enable) {this.volte_enable = volte_enable;}
    // END: VoLTE support; added by noah.ahn 20190730


    public String getIsDefault()
    {
        return isDefault;
    }

    public void setIsDefault(String isDefault)
    {
        this.isDefault = isDefault;
    }
}
