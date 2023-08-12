package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DateTimeEntity {
    @Expose
    @SerializedName("automatic_date_time")
    private String automatic_date_time;

    @Expose
    @SerializedName("date_time_value")
    private String date_time_value;

    @Expose
    @SerializedName("time_value")
    private String time_value;

    @Expose
    @SerializedName("automatic_time_zone")
    private String automatic_time_zone;

    @Expose
    @SerializedName("timezone")
    private String timezone;

    @Expose
    @SerializedName("use_24hour_format")
    private String use_24hour_format;

    @Expose
    @SerializedName("use_dhcp_ntp_server")
    private String use_dhcp_ntp_server;

    @Expose
    @SerializedName("ntp_server")
    private String ntp_server;

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
}
