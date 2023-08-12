package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class KeypadEntity {

    @Expose
    @SerializedName("power_button_control")
    private String power_button_control;

    @Expose
    @SerializedName("model_type")
    private String model_type;

    @Expose
    @SerializedName("button_mapping")
    private ArrayList<ButtonEntity> button_mapping;

    @Expose
    @SerializedName("wakeup_mapping")
    private ArrayList<ButtonEntity> wakeup_mapping;

    @Expose
    @SerializedName("kcm_path")
    private String kcm_path;

    public String getPower_button_control() {
        return power_button_control;
    }

    public void setPower_button_control(String power_button_control) {
        this.power_button_control = power_button_control;
    }

    public String getModel_type() {
        return model_type;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public ArrayList<ButtonEntity> getButton_mapping() {
        return button_mapping;
    }

    public void setButton_mapping(ArrayList<ButtonEntity> button_mapping) {
        this.button_mapping = button_mapping;
    }

    public String getKcm_path()
    {
        return kcm_path;
    }

    public void setKcm_path(String kcm_path)
    {
        this.kcm_path = kcm_path;
    }

    public ArrayList<ButtonEntity> getWakeup_mapping()
    {
        return wakeup_mapping;
    }

    public void setWakeup_mapping(ArrayList<ButtonEntity> wakeup_mapping)
    {
        this.wakeup_mapping = wakeup_mapping;
    }
}
