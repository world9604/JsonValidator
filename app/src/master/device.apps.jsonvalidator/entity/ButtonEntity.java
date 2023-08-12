package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ButtonEntity {

    @Expose
    @SerializedName("define_name")
    private String define_name;

    @Expose
    @SerializedName("change_name")
    private String change_name;

    @Expose
    @SerializedName("extend_data")
    private String extend_data;

    public String getDefine_name() {
        return define_name;
    }

    public void setDefine_name(String define_name) {
        this.define_name = define_name;
    }

    public String getChange_name() {
        return change_name;
    }

    public void setChange_name(String change_name) {
        this.change_name = change_name;
    }

    public String getExtend_data() {
        return extend_data;
    }

    public void setExtend_data(String extend_data) {
        this.extend_data = extend_data;
    }
}
