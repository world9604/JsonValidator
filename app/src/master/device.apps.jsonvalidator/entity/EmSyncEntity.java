package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmSyncEntity
{
    @Expose
    @SerializedName("updateurl")
    private String updateurl;

    @Expose
    @SerializedName("accountId")
    private String accountId;

    @Expose
    @SerializedName("loginId")
    private String loginId;

    @Expose
    @SerializedName("accountAlias")
    private String accountAlias;

    @Expose
    @SerializedName("suffixType")
    private String suffixType;

    @Expose
    @SerializedName("groupId")
    private String groupId;

    @Expose
    @SerializedName("groupName")
    private String groupName;

    @Expose
    @SerializedName("deviceId")
    private String deviceId;

    @Expose
    @SerializedName("base_url")
    private String base_url;

    @Expose
    @SerializedName("serverIp")
    private String serverIp;

    @Expose
    @SerializedName("serverPort")
    private String serverPort;

    public String getUpdateurl()
    {
        return updateurl;
    }

    public void setUpdateurl(String updateurl)
    {
        this.updateurl = updateurl;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public String getLoginId()
    {
        return loginId;
    }

    public void setLoginId(String loginId)
    {
        this.loginId = loginId;
    }

    public String getAccountAlias()
    {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias)
    {
        this.accountAlias = accountAlias;
    }

    public String getSuffixType() {
        return suffixType;
    }

    public void setSuffixType(String suffixType) {
        this.suffixType = suffixType;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getServerIp()
    {
        return serverIp;
    }

    public void setServerIp(String serverIp)
    {
        this.serverIp = serverIp;
    }

    public String getServerPort()
    {
        return serverPort;
    }

    public void setServerPort(String serverPort)
    {
        this.serverPort = serverPort;
    }

    public String getBase_url()
    {
        return base_url;
    }

    public void setBase_url(String base_url)
    {
        this.base_url = base_url;
    }
}
