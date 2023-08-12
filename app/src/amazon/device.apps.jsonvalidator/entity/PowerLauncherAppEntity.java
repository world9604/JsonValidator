package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PowerLauncherAppEntity {
    @Expose
    @SerializedName("row")
    private String row;

    @Expose
    @SerializedName("col")
    private String col;

    @Expose
    @SerializedName("packagename")
    private String packagename;

    @Expose
    @SerializedName("activityname")
    private String activityname;

    @Expose
    @SerializedName("launch")
    private boolean launch;

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public boolean isLaunch() {
        return launch;
    }

    public void setLaunch(boolean launch) {
        this.launch = launch;
    }
}
