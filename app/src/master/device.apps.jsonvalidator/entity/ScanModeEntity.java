package device.apps.jsonvalidator.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ScanModeEntity implements Cloneable {
    @Expose
    @SerializedName("trigger_mode")
    private int trigger_mode = -1;

    @Expose
    @SerializedName("auto_scan_interval")
    private int auto_scan_interval = -1; //ms

    @Expose
    @SerializedName("multi_scan_number")
    private int multi_scan_number = -1;

    @Expose
    @SerializedName("multi_scan_separator")
    private int multi_scan_separator = -1;

    public int getTrigger_mode() {
        return trigger_mode;
    }

    public void setTrigger_mode(int trigger_mode) {
        this.trigger_mode = trigger_mode;
    }

    public int getAuto_scan_interval() {
        return auto_scan_interval;
    }

    public void setAuto_scan_interval(int auto_scan_interval) {
        this.auto_scan_interval = auto_scan_interval;
    }

    public int getMulti_scan_number() {
        return multi_scan_number;
    }

    public void setMulti_scan_number(int multi_scan_number) {
        this.multi_scan_number = multi_scan_number;
    }

    public int getMulti_scan_separator() {
        return multi_scan_separator;
    }

    public void setMulti_scan_separator(int multi_scan_separator) {
        this.multi_scan_separator = multi_scan_separator;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ScanModeEntity copy() {
        return new Gson().fromJson(new Gson().toJson(this), ScanModeEntity.class);
    }
}
