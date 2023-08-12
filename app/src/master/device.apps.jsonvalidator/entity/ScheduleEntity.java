package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;


public class ScheduleEntity {
    @Expose
    @SerializedName("applySchedule")
    private String applySchedule;

    @Expose
    @SerializedName("scheduleTime")
    private String scheduleTime;

    @Expose
    @SerializedName("scheduleTime_value")
    private String scheduleTime_value;


    @Expose
    @SerializedName("applySyncSchedule")
    private String applySyncSchedule;

    @Expose
    @SerializedName("syncFileUrl")
    private String syncFileUrl;

    @Expose
    @SerializedName("syncTime")
    private String syncTime;

    @Expose
    @SerializedName("syncRandomValue")
    private String syncRandomValue;

    @Expose
    @SerializedName("syncWeekday")
    private ArrayList<String> syncWeekday;

    @Expose
    @SerializedName("reboot_option")
    private String reboot_option;

    public String getApplySchedule() {
        return applySchedule;
    }

    public void setApplySchedule(String applySchedule) {
        this.applySchedule = applySchedule;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getScheduleTime_value() {
        return scheduleTime_value;
    }

    public void setScheduleTime_value(String scheduleTime_value) {
        this.scheduleTime_value = scheduleTime_value;
    }

    public String getApplySyncSchedule() {
        return applySyncSchedule;
    }

    public void setApplySyncSchedule(String applySyncSchedule) {
        this.applySyncSchedule = applySyncSchedule;
    }

    public String getSyncFileUrl() {
        return syncFileUrl;
    }

    public void setSyncFileUrl(String syncFileUrl) {
        this.syncFileUrl = syncFileUrl;
    }

    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime;
    }

    public String getSyncRandomValue() {
        return syncRandomValue;
    }

    public void setSyncRandomValue(String syncRandomValue) {
        this.syncRandomValue = syncRandomValue;
    }

    public ArrayList<String> getSyncWeekday() {
        return syncWeekday;
    }

    public void setSyncWeekday(ArrayList<String> syncWeekday) {
        this.syncWeekday = syncWeekday;
    }

    public String getReboot_option() {
        return reboot_option;
    }

    public void setReboot_option(String reboot_option) {
        this.reboot_option = reboot_option;
    }
}
