package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import uk.co.jemos.podam.common.PodamCollection;
import uk.co.jemos.podam.common.PodamStringValue;

public class ScannerEntity {

    @PodamStringValue
    @Pattern(regexp = "^(N6603|N360X|N6703|SE4750|EX25|EX30|N2601)$", message = "allowed_key_list_msg::N6603|N360X|N6703|SE4750|EX25|EX30|N2601")
    @Expose
    @SerializedName("scanner_type")
    private String scanner_type;

    @PodamStringValue
    @Pattern(regexp = "^(Enable|disable)$", message = "allowed_key_list_msg::Enable|Disable")
    @Expose
    @SerializedName("scanner_enable")
    private String scanner_enable;

    @Expose
    @SerializedName("scanner_reg")
    private String scanner_reg;

    @PodamCollection(nbrElements = 3)
    @Expose
    @SerializedName("settingsList")
    private ArrayList<String> settingsList;

    @Valid
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

    public ArrayList<String> getSettingsList()
    {
        return settingsList;
    }

    public void setSettingsList(ArrayList<String> settingsList)
    {
        this.settingsList = settingsList;
    }

    public ArrayList<SymbologiesEntity> getSymbologiesList()
    {
        return symbologiesList;
    }

    public void setSymbologiesList(ArrayList<SymbologiesEntity> symbologiesList)
    {
        this.symbologiesList = symbologiesList;
    }
}
