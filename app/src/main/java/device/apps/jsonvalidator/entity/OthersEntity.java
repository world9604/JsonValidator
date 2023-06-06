package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OthersEntity {
    @Expose
    @SerializedName("language")
    private String language;
    @Expose
    @SerializedName("current_keyboard")
    private String current_keyboard;

    @Expose
    @SerializedName("virtual_keyboard")
    private String virtual_keyboard;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrent_keyboard() {
        return current_keyboard;
    }

    public void setCurrent_keyboard(String current_keyboard) {
        this.current_keyboard = current_keyboard;
    }

    public String getVirtual_keyboard() {
        return virtual_keyboard;
    }

    public void setVirtual_keyboard(String virtual_keyboard) {
        this.virtual_keyboard = virtual_keyboard;
    }
}
