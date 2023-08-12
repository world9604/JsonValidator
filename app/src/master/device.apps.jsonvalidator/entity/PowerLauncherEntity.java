package device.apps.jsonvalidator.entity;

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

    @Expose
    @SerializedName("restScreenCapture")
    private String restScreenCapture;

    @Expose
    @SerializedName("restDebugFeature")
    private String restDebugFeature;

    @Expose
    @SerializedName("restMediaMount")
    private String restMediaMount;

    @Expose
    @SerializedName("restUsbFileTransfer")
    private String restUsbFileTransfer;

    @Expose
    @SerializedName("restAppRecentKey")
    private String restAppRecentKey;

    @Expose
    @SerializedName("plDisplaySetting")
    private PlDisplaySetting plDisplaySetting;

    @Expose
    @SerializedName("plSoundSetting")
    private PlSoundSetting plSoundSetting;

    @Expose
    @SerializedName("plWifiBtSetting")
    private PlWifiBluetoothSetting plWifiBtSetting;

    @Expose
    @SerializedName("hiddenAppinfo")
    private ArrayList<PowerLauncherAppEntity> hiddenAppinfo;

    @Expose
    @SerializedName("screenLockEnable")
    private boolean screenLockEnable;

    @Expose
    @SerializedName("screenLockPassword")
    private String screenLockPassword;

    @Expose
    @SerializedName("colCount")
    private int colCount;

    @Expose
    @SerializedName("gpssetting")
    private boolean gpssetting;

    @Expose
    @SerializedName("wificonfigenable")
    private boolean wificonfigenable;

    @Expose
    @SerializedName("permissionPolicy")
    private int permissionPolicy;

    @Expose
    @SerializedName("autoRunAfterTimeout")
    private String autoRunAfterTimeout;

    public String getAutoRunAfterTimeout() {
        return autoRunAfterTimeout;
    }

    public void setAutoRunAfterTimeout(String autoRunAfterTimeout) {
        this.autoRunAfterTimeout = autoRunAfterTimeout;
    }

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

    public String getRestScreenCapture() {
        return restScreenCapture;
    }

    public void setRestScreenCapture(String restScreenCapture) {
        this.restScreenCapture = restScreenCapture;
    }

    public String getRestDebugFeature() {
        return restDebugFeature;
    }

    public void setRestDebugFeature(String restDebugFeature) {
        this.restDebugFeature = restDebugFeature;
    }

    public String getRestMediaMount() {
        return restMediaMount;
    }

    public void setRestMediaMount(String restMediaMount) {
        this.restMediaMount = restMediaMount;
    }

    public String getRestUsbFileTransfer() {
        return restUsbFileTransfer;
    }

    public void setRestUsbFileTransfer(String restUsbFileTransfer) {
        this.restUsbFileTransfer = restUsbFileTransfer;
    }

    public PlDisplaySetting getPlDisplaySetting() {
        return plDisplaySetting;
    }

    public void setPlDisplaySetting(PlDisplaySetting plDisplaySetting) {
        this.plDisplaySetting = plDisplaySetting;
    }

    public PlSoundSetting getPlSoundSetting() {
        return plSoundSetting;
    }

    public void setPlSoundSetting(PlSoundSetting plSoundSetting) {
        this.plSoundSetting = plSoundSetting;
    }

    public PlWifiBluetoothSetting getPlWifiBtSetting() {
        return plWifiBtSetting;
    }

    public void setPlWifiBtSetting(PlWifiBluetoothSetting plWifiBtSetting) {
        this.plWifiBtSetting = plWifiBtSetting;
    }

    public ArrayList<PowerLauncherAppEntity> getHiddenAppinfo()
    {
        return hiddenAppinfo;
    }

    public void setHiddenAppinfo(ArrayList<PowerLauncherAppEntity> hiddenAppinfo)
    {
        this.hiddenAppinfo = hiddenAppinfo;
    }

    public boolean isScreenLockEnable()
    {
        return screenLockEnable;
    }

    public void setScreenLockEnable(boolean screenLockEnable)
    {
        this.screenLockEnable = screenLockEnable;
    }

    public String getScreenLockPassword()
    {
        return screenLockPassword;
    }

    public void setScreenLockPassword(String screenLockPassword)
    {
        this.screenLockPassword = screenLockPassword;
    }

    public int getColCount()
    {
        return colCount;
    }

    public void setColCount(int colCount)
    {
        this.colCount = colCount;
    }

    public boolean isGpssetting()
    {
        return gpssetting;
    }

    public void setGpssetting(boolean gpssetting)
    {
        this.gpssetting = gpssetting;
    }

    public boolean isWificonfigenable()
    {
        return wificonfigenable;
    }

    public void setWificonfigenable(boolean wificonfigenable)
    {
        this.wificonfigenable = wificonfigenable;
    }

    public String getRestAppRecentKey()
    {
        return restAppRecentKey;
    }

    public void setRestAppRecentKey(String restAppRecentKey)
    {
        this.restAppRecentKey = restAppRecentKey;
    }

    public int getPermissionPolicy() {
        return permissionPolicy;
    }

    public void setPermissionPolicy(int permissionPolicy) {
        this.permissionPolicy = permissionPolicy;
    }
}

class PlDisplaySetting
{
    @Expose
    @SerializedName("brightnesssetting")
    private boolean brightnesssetting;

    @Expose
    @SerializedName("adaptivebrightnesssetting")
    private boolean adaptivebrightnesssetting;

    @Expose
    @SerializedName("screenrotationsetting")
    private boolean screenrotationsetting;

    @Expose
    @SerializedName("screentimeoutsetting")
    private boolean screentimeoutsetting;

    public boolean isBrightnesssetting() {
        return brightnesssetting;
    }

    public void setBrightnesssetting(boolean brightnesssetting) {
        this.brightnesssetting = brightnesssetting;
    }

    public boolean isAdaptivebrightnesssetting() {
        return adaptivebrightnesssetting;
    }

    public void setAdaptivebrightnesssetting(boolean adaptivebrightnesssetting) {
        this.adaptivebrightnesssetting = adaptivebrightnesssetting;
    }

    public boolean isScreenrotationsetting() {
        return screenrotationsetting;
    }

    public void setScreenrotationsetting(boolean screenrotationsetting) {
        this.screenrotationsetting = screenrotationsetting;
    }

    public boolean isScreentimeoutsetting() {
        return screentimeoutsetting;
    }

    public void setScreentimeoutsetting(boolean screentimeoutsetting) {
        this.screentimeoutsetting = screentimeoutsetting;
    }
}

class PlSoundSetting
{
    @Expose
    @SerializedName("ringtonevolumesetting")
    private boolean ringtonevolumesetting;

    @Expose
    @SerializedName("mediavolumesetting")
    private boolean mediavolumesetting;

    @Expose
    @SerializedName("alarmvolumesetting")
    private boolean alarmvolumesetting;

    public boolean isRingtonevolumesetting() {
        return ringtonevolumesetting;
    }

    public void setRingtonevolumesetting(boolean ringtonevolumesetting) {
        this.ringtonevolumesetting = ringtonevolumesetting;
    }

    public boolean isMediavolumesetting() {
        return mediavolumesetting;
    }

    public void setMediavolumesetting(boolean mediavolumesetting) {
        this.mediavolumesetting = mediavolumesetting;
    }

    public boolean isAlarmvolumesetting() {
        return alarmvolumesetting;
    }

    public void setAlarmvolumesetting(boolean alarmvolumesetting) {
        this.alarmvolumesetting = alarmvolumesetting;
    }
}

class PlWifiBluetoothSetting
{
    @Expose
    @SerializedName("wifienablesetting")
    private boolean wifienablesetting;

    @Expose
    @SerializedName("bluetoothsetting")
    private boolean bluetoothsetting;

    public boolean isWifienablesetting() {
        return wifienablesetting;
    }

    public void setWifienablesetting(boolean wifienablesetting) {
        this.wifienablesetting = wifienablesetting;
    }

    public boolean isBluetoothsetting() {
        return bluetoothsetting;
    }

    public void setBluetoothsetting(boolean bluetoothsetting) {
        this.bluetoothsetting = bluetoothsetting;
    }
}
