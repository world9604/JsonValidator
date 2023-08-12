package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WifiEntity
{
    @Expose
    @SerializedName("ssid")
    private String ssid;

    @Expose
    @SerializedName("hide")
    private String hide;

    @Expose
    @SerializedName("whitelist")
    private String whitelist;

    @Expose
    @SerializedName("password")
    private String password;

    @Expose
    @SerializedName("security")
    private String security;

    @Expose
    @SerializedName("eap")
    private String eap;

    @Expose
    @SerializedName("pa2au")
    private String pa2au;

    @Expose
    @SerializedName("identity")
    private String identity;

    @Expose
    @SerializedName("anonymous_identity")
    private String anonymous_identity;

    @Expose
    @SerializedName("domain")
    private String domain;

    @Expose
    @SerializedName("ocsp")
    private String ocsp;

    @Expose
    @SerializedName("dhcp_ntp")
    private String dhcp_ntp;

    @Expose
    @SerializedName("ca_cer")
    private String ca_cer;

    @Expose
    @SerializedName("use_system_certs")
    private String use_system_certs;

    @Expose
    @SerializedName("user_cer")
    private String user_cer;

    @Expose
    @SerializedName("proxy_mode")
    private String proxy_mode;

    @Expose
    @SerializedName("proxy_ad")
    private String proxy_ad;

    @Expose
    @SerializedName("proxy_port")
    private String proxy_port;

    @Expose
    @SerializedName("bypassurl")
    private String bypassurl;

    @Expose
    @SerializedName("ipaddr")
    private String ipaddr;

    @Expose
    @SerializedName("gateway")
    private String gateway;

    @Expose
    @SerializedName("subnetmask")
    private String subnetmask;

    @Expose
    @SerializedName("dns")
    private String dns;

    @Expose
    @SerializedName("privacy")
    private String privacy;

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getEap() {
        return eap;
    }

    public void setEap(String eap) {
        this.eap = eap;
    }

    public String getPa2au() {
        return pa2au;
    }

    public void setPa2au(String pa2au) {
        this.pa2au = pa2au;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getAnonymousIdentity() {
        return anonymous_identity;
    }

    public void setAnonymousIdentity(String anonymous_identity) {
        this.anonymous_identity = anonymous_identity;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getOcsp() {
        return ocsp;
    }

    public void setOcsp(String ocsp) {
        this.ocsp = ocsp;
    }

    public String getDhcp_ntp() {
        return dhcp_ntp;
    }

    public void setDhcp_ntp(String dhcp_ntp) {
        this.dhcp_ntp = dhcp_ntp;
    }

    public String getCa_cer() {
        return ca_cer;
    }

    public void setCa_cer(String ca_cer) {
        this.ca_cer = ca_cer;
    }

    public String getUseSystemCerts() {
        return use_system_certs;
    }

    public void setUseSystemCerts(String use_system_certs) {
        this.use_system_certs = use_system_certs;
    }

    public String getUser_cer() {
        return user_cer;
    }

    public void setUser_cer(String user_cer) {
        this.user_cer = user_cer;
    }

    public String getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(String whitelist) {
        this.whitelist = whitelist;
    }

    public String getProxy_mode() {
        return proxy_mode;
    }

    public void setProxy_mode(String proxy_mode) {
        this.proxy_mode = proxy_mode;
    }

    public String getProxy_ad() {
        return proxy_ad;
    }

    public void setProxy_ad(String proxy_ad) {
        this.proxy_ad = proxy_ad;
    }

    public String getProxy_port() {
        return proxy_port;
    }

    public void setProxy_port(String proxy_port) {
        this.proxy_port = proxy_port;
    }

    public String getBypassurl() {
        return bypassurl;
    }

    public void setBypassurl(String bypassurl) {
        this.bypassurl = bypassurl;
    }

    public String getIpaddr()
    {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr)
    {
        this.ipaddr = ipaddr;
    }

    public String getGateway()
    {
        return gateway;
    }

    public void setGateway(String gateway)
    {
        this.gateway = gateway;
    }

    public String getSubnetmask()
    {
        return subnetmask;
    }

    public void setSubnetmask(String subnetmask)
    {
        this.subnetmask = subnetmask;
    }

    public String getDns()
    {
        return dns;
    }

    public void setDns(String dns)
    {
        this.dns = dns;
    }
}
