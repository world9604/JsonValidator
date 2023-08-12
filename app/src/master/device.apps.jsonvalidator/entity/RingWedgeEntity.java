package device.apps.jsonvalidator.entity;

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
