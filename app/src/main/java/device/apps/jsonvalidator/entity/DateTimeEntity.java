package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.Pattern;

import uk.co.jemos.podam.common.PodamStringValue;

public class DateTimeEntity {

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Options|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Options|Enable|Disable")
    @Expose
    @SerializedName("automatic_date_time")
    private String automatic_date_time;

    @PodamStringValue
    @Pattern(regexp = "^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))$", message = "allowed_key_list_msg::yyyy-MM-DD")
    @Expose
    @SerializedName("date_time_value")
    private String date_time_value;

    @PodamStringValue
    @Pattern(regexp = "^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d))$", message = "allowed_key_list_msg::HH:mm")
    @Expose
    @SerializedName("time_value")
    private String time_value;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Options|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Options|Enable|Disable")
    @Expose
    @SerializedName("automatic_time_zone")
    private String automatic_time_zone;

    @PodamStringValue
    @Pattern(regexp = "^(Pacific/Midway|Pacific/Honolulu|America/Anchorage|America/Los_Angeles|America/Tijuana|America/Phoenix|America/Chihuahua|America/Denver|America/Costa_Rica|America/Chicago|America/Mexico_City|America/Regina|America/Bogota|America/New_York|America/Caracas|America/Barbados|America/Halifax|America/Manaus|America/Santiago|America/St_Johns|America/Recife|America/Sao_Paulo|America/Argentina/Buenos_Aires|America/Godthab|America/Montevideo|Atlantic/South_Georgia|Atlantic/Azores|Atlantic/Cape_Verde|Africa/Casablanca|Europe/London|Europe/Amsterdam|Europe/Belgrade|Europe/Brussels|Europe/Madrid|Europe/Sarajevo|Africa/Windhoek|Africa/Brazzaville|Asia/Amman|Europe/Athens|Europe/Istanbul|Asia/Beirut|Africa/Cairo|Europe/Helsinki|Asia/Jerusalem|Europe/Minsk|Africa/Harare|Asia/Baghdad|Europe/Moscow|Asia/Kuwait|Africa/Nairobi|Asia/Tehran|Asia/Baku|Asia/Tbilisi|Asia/Yerevan|Asia/Dubai|Asia/Kabul|Asia/Karachi|Asia/Oral|Asia/Yekaterinburg|Asia/Kolkata|Asia/Colombo|Asia/Kathmandu|Asia/Almaty|Asia/Yangon|Asia/Krasnoyarsk|Asia/Bangkok|Asia/Jakarta|Asia/Shanghai|Asia/Hong_Kong|Asia/Irkutsk|Asia/Kuala_Lumpur|Australia/Perth|Asia/Taipei|Asia/Seoul|Asia/Tokyo|Asia/Yakutsk|Australia/Adelaide|Australia/Darwin|Australia/Brisbane|Australia/Hobart|Australia/Sydney|Asia/Vladivostok|Pacific/Guam|Asia/Magadan|Pacific/Noumea|Pacific/Majuro|Pacific/Auckland|Pacific/Fiji|Pacific/Tongatapu)$", message = "allowed_key_list_msg::Pacific/Midway|Pacific/Honolulu|America/Anchorage|America/Los_Angeles|America/Tijuana|America/Phoenix|America/Chihuahua|America/Denver|America/Costa_Rica|America/Chicago|America/Mexico_City|America/Regina|America/Bogota|America/New_York|America/Caracas|America/Barbados|America/Halifax|America/Manaus|America/Santiago|America/St_Johns|America/Recife|America/Sao_Paulo|America/Argentina/Buenos_Aires|America/Godthab|America/Montevideo|Atlantic/South_Georgia|Atlantic/Azores|Atlantic/Cape_Verde|Africa/Casablanca|Europe/London|Europe/Amsterdam|Europe/Belgrade|Europe/Brussels|Europe/Madrid|Europe/Sarajevo|Africa/Windhoek|Africa/Brazzaville|Asia/Amman|Europe/Athens|Europe/Istanbul|Asia/Beirut|Africa/Cairo|Europe/Helsinki|Asia/Jerusalem|Europe/Minsk|Africa/Harare|Asia/Baghdad|Europe/Moscow|Asia/Kuwait|Africa/Nairobi|Asia/Tehran|Asia/Baku|Asia/Tbilisi|Asia/Yerevan|Asia/Dubai|Asia/Kabul|Asia/Karachi|Asia/Oral|Asia/Yekaterinburg|Asia/Kolkata|Asia/Colombo|Asia/Kathmandu|Asia/Almaty|Asia/Yangon|Asia/Krasnoyarsk|Asia/Bangkok|Asia/Jakarta|Asia/Shanghai|Asia/Hong_Kong|Asia/Irkutsk|Asia/Kuala_Lumpur|Australia/Perth|Asia/Taipei|Asia/Seoul|Asia/Tokyo|Asia/Yakutsk|Australia/Adelaide|Australia/Darwin|Australia/Brisbane|Australia/Hobart|Australia/Sydney|Asia/Vladivostok|Pacific/Guam|Asia/Magadan|Pacific/Noumea|Pacific/Majuro|Pacific/Auckland|Pacific/Fiji|Pacific/Tongatapu")
    @Expose
    @SerializedName("timezone")
    private String timezone;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Options|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Options|Enable|Disable")
    @Expose
    @SerializedName("use_24hour_format")
    private String use_24hour_format;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Options|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Options|Enable|Disable")
    @Expose
    @SerializedName("use_dhcp_ntp_server")
    private String use_dhcp_ntp_server;

    @PodamStringValue
    @Expose
    @SerializedName("ntp_server")
    private String ntp_server;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Options|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Options|Enable|Disable")
    @Expose
    @SerializedName("periodic_sync")
    private String periodic_sync;

    @PodamStringValue
    @Pattern(regexp = "^[0-9]*$", message = "allowed_key_list_msg::only numbers")
    @Expose
    @SerializedName("syncinterval_days")
    private String syncinterval_days;

    public String getAutomatic_date_time() {
        return automatic_date_time;
    }

    public void setAutomatic_date_time(String automatic_date_time) {
        this.automatic_date_time = automatic_date_time;
    }

    public String getDate_time_value() {
        return date_time_value;
    }

    public void setDate_time_value(String date_time_value) {
        this.date_time_value = date_time_value;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUse_24hour_format() {
        return use_24hour_format;
    }

    public void setUse_24hour_format(String use_24hour_format) {
        this.use_24hour_format = use_24hour_format;
    }

    public String getUse_dhcp_ntp_server() {
        return use_dhcp_ntp_server;
    }

    public void setUse_dhcp_ntp_server(String use_dhcp_ntp_server) {
        this.use_dhcp_ntp_server = use_dhcp_ntp_server;
    }

    public String getNtp_server() {
        return ntp_server;
    }

    public void setNtp_server(String ntp_server) {
        this.ntp_server = ntp_server;
    }

    public String getTime_value() {
        return time_value;
    }

    public void setTime_value(String time_value) {
        this.time_value = time_value;
    }

    public String getAutomatic_time_zone() {
        return automatic_time_zone;
    }

    public void setAutomatic_time_zone(String automatic_time_zone) {
        this.automatic_time_zone = automatic_time_zone;
    }

    public String getPeriodic_sync()
    {
        return periodic_sync;
    }

    public void setPeriodic_sync(String periodic_sync)
    {
        this.periodic_sync = periodic_sync;
    }

    public String getSyncinterval_days()
    {
        return syncinterval_days;
    }

    public void setSyncinterval_days(String syncinterval_days)
    {
        this.syncinterval_days = syncinterval_days;
    }
}