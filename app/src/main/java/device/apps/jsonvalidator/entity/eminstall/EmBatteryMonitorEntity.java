package device.apps.jsonvalidator.entity.eminstall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmBatteryMonitorEntity {
    /**
     * Range : warningThresholdCycleCount < eolThresholdCycleCount <= 300
     * Default : 300
     * Description : 배터리 Cycle Count EOL 임계치 값
     * Description : Battery Cycle Count EOL threshold value
     */
    @Expose
    @SerializedName("eolThresholdCycleCount")
    private int eolThresholdCycleCount;

    /**
     * Range : 0 < warningThresholdCycleCount <= 250
     * Default : 250
     * Description : 배터리 Cycle Count 권고 임계치 값
     * Description : Battery Cycle Count recommended threshold value
     */
    @Expose
    @SerializedName("warningThresholdCycleCount")
    private int warningThresholdCycleCount;

    /**
     * Range : 80 <= eolThresholdRemainingLife < warningThresholdRemainingLife
     * Default : 80
     * Description : 배터리 Remaining Life EOL 임계치 값
     * Description : Battery Remaining Life EOL Threshold Value
     */
    @Expose
    @SerializedName("eolThresholdRemainingLife")
    private int eolThresholdRemainingLife;

    /**
     * Range : 85 <= warningThresholdRemainingLife
     * Default : 85
     * Description : 배터리 Remaining Life 권고 임계치 값
     * Description : Battery Remaining Life Advisory Threshold Value
     */
    @Expose
    @SerializedName("warningThresholdRemainingLife")
    private int warningThresholdRemainingLife;

    /**
     * Range : 0 ~ 23
     * Default : 12
     * Description : 배터리 교체 확인 시간
     * Description : Battery replacement confirmation time
     */
    @Expose
    @SerializedName("thresholdShowAtHour")
    private int thresholdShowAtHour;

    /**
     * Range : true / false
     * Default : false
     * Description : 배터리 교체 권고 알림
     * Description : Battery Replacement Advisory Notification
     */
    @Expose
    @SerializedName("warningNotification")
    private boolean warningNotification;

    /**
     * Range : 85 <= warningThreshold
     * Default : 85
     * Description : 배터리 교체 권고 임계치 값
     * Description : Battery replacement advisory threshold value
     */
    @Expose
    @SerializedName("warningThreshold")
    private int warningThreshold;

    /**
     * Range : true / false
     * Default : false
     * Description : 배터리 EOL 알림
     * Description : Battery EOL notification
     */
    @Expose
    @SerializedName("eolNotification")
    private boolean eolNotification;

    /**
     * Range : 80 <= eolThreshold < warningThreshold
     * Default : 80
     * Description : 배터리 EOL 임계치 값
     * Description : Battery EOL Threshold Value
     */
    @Expose
    @SerializedName("eolThreshold")
    private int eolThreshold;

    /**
     * Range : true / false
     * Default : false
     * Description : 배터리 과열 알림
     * Description : Battery overheat notification
     */
    @Expose
    @SerializedName("overheatNotification")
    private boolean overheatNotification;

    /**
     * Range : Max : 69.0
     * Default : 66.0
     * Description : 배터리 과열 알림 설정 온도
     * Description : Battery overheat notification set temperature
     */
    @Expose
    @SerializedName("overheatTemperature")
    private float overheatTemperature;

    //default 값으로 설정
    public EmBatteryMonitorEntity(int eolThresholdCycleCount, int warningThresholdCycleCount,
                                  int eolThresholdRemainingLife, int warningThresholdRemainingLife,
                                  int thresholdShowAtHour, boolean warningNotification,
                                  int warningThreshold, boolean eolNotification, int eolThreshold,
                                  boolean overheatNotification, float overheatTemperature) {
        this.thresholdShowAtHour = 12;
        this.warningNotification = false;
        this.warningThreshold = 85;
        this.eolNotification = false;
        this.eolThreshold = 80;
        this.overheatNotification = false;
        this.overheatTemperature = 66.0f;
        this.eolThresholdCycleCount = 300;
        this.warningThresholdCycleCount = 250;
        this.eolThresholdRemainingLife = 80;
        this.warningThresholdRemainingLife = 85;
    }

    public int getThresholdShowAtHour() {
        return thresholdShowAtHour;
    }

    public void setThresholdShowAtHour(int thresholdShowAtHour) {
        this.thresholdShowAtHour = thresholdShowAtHour;
    }

    public boolean isWarningNotification() {
        return warningNotification;
    }

    public void setWarningNotification(boolean warningNotification) {
        this.warningNotification = warningNotification;
    }

    public int getWarningThreshold() {
        return warningThreshold;
    }

    public void setWarningThreshold(int warningThreshold) {
        this.warningThreshold = warningThreshold;
    }

    public boolean isEolNotification() {
        return eolNotification;
    }

    public void setEolNotification(boolean eolNotification) {
        this.eolNotification = eolNotification;
    }

    public int getEolThreshold() {
        return eolThreshold;
    }

    public void setEolThreshold(int eolThreshold) {
        this.eolThreshold = eolThreshold;
    }

    public boolean isOverheatNotification() {
        return overheatNotification;
    }

    public void setOverheatNotification(boolean overheatNotification) {
        this.overheatNotification = overheatNotification;
    }

    public float getOverheatTemperature() {
        return overheatTemperature;
    }

    public void setOverheatTemperature(float overheatTemperature) {
        this.overheatTemperature = overheatTemperature;
    }

    public int getEolThresholdCycleCount() {
        return eolThresholdCycleCount;
    }

    public void setEolThresholdCycleCount(int eolThresholdCycleCount) {
        this.eolThresholdCycleCount = eolThresholdCycleCount;
    }

    public int getWarningThresholdCycleCount() {
        return warningThresholdCycleCount;
    }

    public void setWarningThresholdCycleCount(int warningThresholdCycleCount) {
        this.warningThresholdCycleCount = warningThresholdCycleCount;
    }

    public int getEolThresholdRemainingLife() {
        return eolThresholdRemainingLife;
    }

    public void setEolThresholdRemainingLife(int eolThresholdRemainingLife) {
        this.eolThresholdRemainingLife = eolThresholdRemainingLife;
    }

    public int getWarningThresholdRemainingLife() {
        return warningThresholdRemainingLife;
    }

    public void setWarningThresholdRemainingLife(int warningThresholdRemainingLife) {
        this.warningThresholdRemainingLife = warningThresholdRemainingLife;
    }
}
