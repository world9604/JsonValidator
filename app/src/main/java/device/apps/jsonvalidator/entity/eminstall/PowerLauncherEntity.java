package device.apps.jsonvalidator.entity.eminstall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PowerLauncherEntity {
    @Expose
    @SerializedName("company")
    private String company;

    @Expose
    @SerializedName("password")
    private String password;

    @Expose
    @SerializedName("wallpaper")
    private String wallpaper;

    @Expose
    @SerializedName("appinfo")
    private ArrayList<PowerLauncherAppEntity> appinfo;

    @Expose
    @SerializedName("updateurl")
    private String updateurl;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(String wallpaper) {
        this.wallpaper = wallpaper;
    }

    public ArrayList<PowerLauncherAppEntity> getAppinfo() {
        return appinfo;
    }

    public void setAppinfo(ArrayList<PowerLauncherAppEntity> appinfo) {
        this.appinfo = appinfo;
    }

    public String getUpdateurl() {
        return updateurl;
    }

    public void setUpdateurl(String updateurl) {
        this.updateurl = updateurl;
    }
}
