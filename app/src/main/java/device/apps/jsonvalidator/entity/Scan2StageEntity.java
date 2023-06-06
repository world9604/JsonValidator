package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.Valid;

import device.apps.jsonvalidator.entity.eminstall.DirectCloneEntity;
import device.apps.jsonvalidator.entity.eminstall.EmBatteryMonitorEntity;
import device.apps.jsonvalidator.entity.eminstall.GmsPackageEntity;
import device.apps.jsonvalidator.entity.eminstall.JobListEntity;
import device.apps.jsonvalidator.entity.eminstall.OSUpdateEntity;
import device.apps.jsonvalidator.entity.eminstall.PowerLauncherEntity;
import device.apps.jsonvalidator.entity.eminstall.RingControlEntity;
import device.apps.jsonvalidator.entity.eminstall.RingWedgeEntity;
import device.apps.jsonvalidator.entity.eminstall.ScheduleEntity;
import device.apps.jsonvalidator.entity.eminstall.WedgeProfileEntity;

public class Scan2StageEntity {
    @Valid
    @Expose
    @SerializedName("schedule_config")
    private ScheduleEntity schedule_config;

    @Valid
    @Expose
    @SerializedName("gmsPackage_config")
    private GmsPackageEntity gmsPackage_config;

    @Valid
    @Expose
    @SerializedName("osupdate_config")
    private OSUpdateEntity osupdate_config;

    @Valid
    @Expose
    @SerializedName("eminstall_config")
    private JobListEntity eminstall_config;

    @Valid
    @Expose
    @SerializedName("wiress_config")
    private WirelessEntity wiress_config;

    @Valid
    @Expose
    @SerializedName("wlan_config")
    private WLanEntity wlan_config;

    @Valid
    @Expose
    @SerializedName("ethernet_config")
    private EthernetEntity ethernet_config;

    @Valid
    @Expose
    @SerializedName("phone_config")
    private PhoneEntity phone_config;

    @Valid
    @Expose
    @SerializedName("system_config")
    private SystemEntity system_config;

    @Valid
    @Expose
    @SerializedName("datetime_config")
    private DateTimeEntity datetime_config;

    @Valid
    @Expose
    @SerializedName("other_config")
    private OthersEntity other_config;

    @Valid
    @Expose
    @SerializedName("scanner_config")
    private ScannerEntity scanner_config;

    @Valid
    @Expose
    @SerializedName("button_config")
    private ButtonEntity button_config;

    @Valid
    @Expose
    @SerializedName("directCloneConfig")
    private DirectCloneEntity directCloneConfig;

    @Valid
    @Expose
    @SerializedName("powerlauncher_config")
    private PowerLauncherEntity powerlauncher_config;

    @Valid
    @Expose
    @SerializedName("screenlock_config")
    private ScreenLockEntity screenlock_config;

    @Valid
    @Expose
    @SerializedName("wedgeProfile_config")
    private WedgeProfileEntity wedgeProfile_config;

    @Valid
    @Expose
    @SerializedName("ringWedge_config")
    private RingWedgeEntity ringWedge_config;

    @Valid
    @Expose
    @SerializedName("ringControl_config")
    private RingControlEntity ringControl_config;

    @Valid
    @Expose
    @SerializedName("embatteryMonitor_config")
    private EmBatteryMonitorEntity embatteryMonitor_config;

    public EmBatteryMonitorEntity getEmbatteryMonitor_config() {
        return embatteryMonitor_config;
    }

    public void setEmbatteryMonitor_config(EmBatteryMonitorEntity embatteryMonitor_config) {
        this.embatteryMonitor_config = embatteryMonitor_config;
    }

    public JobListEntity getEminstall_config() {
        return eminstall_config;
    }

    public void setEminstall_config(JobListEntity eminstall_config) {
        this.eminstall_config = eminstall_config;
    }

    public WLanEntity getWlan_config() {
        return wlan_config;
    }

    public void setWlan_config(WLanEntity wlan_config) {
        this.wlan_config = wlan_config;
    }

    public SystemEntity getSystem_config() {
        return system_config;
    }

    public void setSystem_config(SystemEntity system_config) {
        this.system_config = system_config;
    }

    public GmsPackageEntity getGmsPackage_config() {
        return gmsPackage_config;
    }

    public void setGmsPackage_config(GmsPackageEntity gmsPackage_config) {
        this.gmsPackage_config = gmsPackage_config;
    }

    public OSUpdateEntity getOsupdate_config() {
        return osupdate_config;
    }

    public void setOsupdate_config(OSUpdateEntity osupdate_config) {
        this.osupdate_config = osupdate_config;
    }


    public ScheduleEntity getSchedule_config() {
        return schedule_config;
    }

    public void setSchedule_config(ScheduleEntity schedule_config) {
        this.schedule_config = schedule_config;
    }

    public WirelessEntity getWiress_config() {
        return wiress_config;
    }

    public void setWiress_config(WirelessEntity wiress_config) {
        this.wiress_config = wiress_config;
    }

    public EthernetEntity getEthernet_config() {
        return ethernet_config;
    }

    public void setEthernet_config(EthernetEntity ethernet_config) {
        this.ethernet_config = ethernet_config;
    }

    public PhoneEntity getPhone_config() {
        return phone_config;
    }

    public void setPhone_config(PhoneEntity phone_config) {
        this.phone_config = phone_config;
    }

    public DateTimeEntity getDatetime_config() {
        return datetime_config;
    }

    public void setDatetime_config(DateTimeEntity datetime_config) {
        this.datetime_config = datetime_config;
    }

    public OthersEntity getOther_config() {
        return other_config;
    }

    public void setOther_config(OthersEntity other_config) {
        this.other_config = other_config;
    }

    public ScannerEntity getScanner_config() {
        return scanner_config;
    }

    public void setScanner_config(ScannerEntity scanner_config) {
        this.scanner_config = scanner_config;
    }

    public ButtonEntity getButton_config() {
        return button_config;
    }

    public void setButton_config(ButtonEntity button_config) {
        this.button_config = button_config;
    }

    public DirectCloneEntity getDirectCloneConfig() {
        return directCloneConfig;
    }

    public void setDirectCloneConfig(DirectCloneEntity directCloneConfig) {
        this.directCloneConfig = directCloneConfig;
    }

    public PowerLauncherEntity getPowerlauncher_config() {
        return powerlauncher_config;
    }

    public void setPowerlauncher_config(PowerLauncherEntity powerlauncher_config) {
        this.powerlauncher_config = powerlauncher_config;
    }

    public ScreenLockEntity getScreenlock_config() {
        return screenlock_config;
    }

    public void setScreenlock_config(ScreenLockEntity screenlock_config) {
        this.screenlock_config = screenlock_config;
    }

    public WedgeProfileEntity getWedgeProfile_config()
    {
        return wedgeProfile_config;
    }

    public void setWedgeProfile_config(WedgeProfileEntity wedgeProfile_config)
    {
        this.wedgeProfile_config = wedgeProfile_config;
    }

    public RingWedgeEntity getRingWedge_config() {
        return ringWedge_config;
    }

    public void setRingWedge_config(RingWedgeEntity ringWedge_config) {
        this.ringWedge_config = ringWedge_config;
    }

    public RingControlEntity getRingControl_config() {
        return ringControl_config;
    }

    public void setRingControl_config(RingControlEntity ringControl_config) {
        this.ringControl_config = ringControl_config;
    }
}
