package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ScannerEntity {
    @Expose
    @SerializedName("scanner_type")
    private String scanner_type;
    @Expose
    @SerializedName("scanner_enable")
    private String scanner_enable;

    @Expose
    @SerializedName("scanner_reg")
    private String scanner_reg;

    @Expose
    @SerializedName("scanner_pew")
    private String scanner_pew;

    @Expose
    @SerializedName("settingsList")
    private ArrayList<String> settingsList;

    @Expose
    @SerializedName("symbologiesList")
    private ArrayList<SymbologiesEntity> symbologiesList;

    public String getScanner_type() {
        return scanner_type;
    }

    public void setScanner_type(String scanner_type) {
        this.scanner_type = scanner_type;
    }

    public String getScanner_enable() {
        return scanner_enable;
    }

    public void setScanner_enable(String scanner_enable) {
        this.scanner_enable = scanner_enable;
    }

    public String getScanner_reg() {
        return scanner_reg;
    }

    public void setScanner_reg(String scanner_reg) {
        this.scanner_reg = scanner_reg;
    }

    public String getScanner_pew() {
        return scanner_pew;
    }

    public void setScanner_pew(String scanner_pew) {
        this.scanner_pew = scanner_pew;
    }
}
