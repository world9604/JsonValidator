package device.apps.jsonvalidator.entity.eminstall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RingWedgeEntity
{
    @Expose
    @SerializedName("revision")
    private int revision;

    @Expose
    @SerializedName("ringwedge")
    private RingWedge ringwedge;

    @Expose
    @SerializedName("system")
    private RingWedgeSystem system;

    public RingWedge getRingwedge() {
        return ringwedge;
    }

    public void setRingwedge(RingWedge ringwedge) {
        this.ringwedge = ringwedge;
    }

    public RingWedgeSystem getSystem() {
        return system;
    }

    public void setSystem(RingWedgeSystem system) {
        this.system = system;
    }
}

class RingWedge
{
    @Expose
    @SerializedName("admin_password")
    private String admin_password;

    @Expose
    @SerializedName("disconnection_timeout")
    private int disconnection_timeout;

    @Expose
    @SerializedName("result_type")
    private int result_type;

    @Expose
    @SerializedName("intent_action")
    private String intent_action;

    @Expose
    @SerializedName("intent_category")
    private String intent_category;

    @Expose
    @SerializedName("intent_extra_decode_value")
    private String intent_extra_decode_value;

    @Expose
    @SerializedName("intent_extra_decode_byte_value")
    private String intent_extra_decode_byte_value;

    @Expose
    @SerializedName("intent_extra_event_source")
    private String intent_extra_event_source;

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public int getDisconnection_timeout() {
        return disconnection_timeout;
    }

    public void setDisconnection_timeout(int disconnection_timeout) {
        this.disconnection_timeout = disconnection_timeout;
    }

    public int getResult_type() {
        return result_type;
    }

    public void setResult_type(int result_type) {
        this.result_type = result_type;
    }

    public String getIntent_action() {
        return intent_action;
    }

    public void setIntent_action(String intent_action) {
        this.intent_action = intent_action;
    }

    public String getIntent_category() {
        return intent_category;
    }

    public void setIntent_category(String intent_category) {
        this.intent_category = intent_category;
    }

    public String getIntent_extra_decode_value() {
        return intent_extra_decode_value;
    }

    public void setIntent_extra_decode_value(String intent_extra_decode_value) {
        this.intent_extra_decode_value = intent_extra_decode_value;
    }

    public String getIntent_extra_decode_byte_value() {
        return intent_extra_decode_byte_value;
    }

    public void setIntent_extra_decode_byte_value(String intent_extra_decode_byte_value) {
        this.intent_extra_decode_byte_value = intent_extra_decode_byte_value;
    }

    public String getIntent_extra_event_source() {
        return intent_extra_event_source;
    }

    public void setIntent_extra_event_source(String intent_extra_event_source) {
        this.intent_extra_event_source = intent_extra_event_source;
    }
}

class RingWedgeSystem
{
    @Expose
    @SerializedName("terminator")
    private Integer terminator;

    public Integer getTerminator() {
        return terminator;
    }

    public void setTerminator(Integer terminator) {
        this.terminator = terminator;
    }
}
