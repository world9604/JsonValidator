package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EthernetEntity {
    @Expose
    @SerializedName("ethernet_type")
    private String ethernet_type;

    @Expose
    @SerializedName("ethernet_ip_address")
    private String ethernet_ip_address;

    @Expose
    @SerializedName("ethernet_netmask")
    private String ethernet_netmask;

    @Expose
    @SerializedName("ethernet_gateway")
    private String ethernet_gateway;

    @Expose
    @SerializedName("ethernet_dns1")
    private String ethernet_dns1;

    @Expose
    @SerializedName("ethernet_dns2")
    private String ethernet_dns2;

    @Expose
    @SerializedName("ethernet_proxy_type")
    private String ethernet_proxy_type;

    @Expose
    @SerializedName("ethernet_proxy_hostname")
    private String ethernet_proxy_hostname;

    @Expose
    @SerializedName("ethernet_proxy_port")
    private String ethernet_proxy_port;

    @Expose
    @SerializedName("ethernet_proxy_bypass")
    private String ethernet_proxy_bypass;

    @Expose
    @SerializedName("ethernet_proxy_pacurl")
    private String ethernet_proxy_pacurl;


    public String getEthernet_type() {
        return ethernet_type;
    }

    public void setEthernet_type(String ethernet_type) {
        this.ethernet_type = ethernet_type;
    }

    public String getEthernet_ip_address() {
        return ethernet_ip_address;
    }

    public void setEthernet_ip_address(String ethernet_ip_address) {
        this.ethernet_ip_address = ethernet_ip_address;
    }

    public String getEthernet_netmask() {
        return ethernet_netmask;
    }

    public void setEthernet_netmask(String ethernet_netmask) {
        this.ethernet_netmask = ethernet_netmask;
    }

    public String getEthernet_gateway() {
        return ethernet_gateway;
    }

    public void setEthernet_gateway(String ethernet_gateway) {
        this.ethernet_gateway = ethernet_gateway;
    }

    public String getEthernet_dns1() {
        return ethernet_dns1;
    }

    public void setEthernet_dns1(String ethernet_dns1) {
        this.ethernet_dns1 = ethernet_dns1;
    }

    public String getEthernet_dns2() {
        return ethernet_dns2;
    }

    public void setEthernet_dns2(String ethernet_dns2) {
        this.ethernet_dns2 = ethernet_dns2;
    }

    public String getEthernet_proxy_type() {
        return ethernet_proxy_type;
    }

    public void setEthernet_proxy_type(String ethernet_proxy_type) {
        this.ethernet_proxy_type = ethernet_proxy_type;
    }

    public String getEthernet_proxy_hostname() {
        return ethernet_proxy_hostname;
    }

    public void setEthernet_proxy_hostname(String ethernet_proxy_hostname) {
        this.ethernet_proxy_hostname = ethernet_proxy_hostname;
    }

    public String getEthernet_proxy_port() {
        return ethernet_proxy_port;
    }

    public void setEthernet_proxy_port(String ethernet_proxy_port) {
        this.ethernet_proxy_port = ethernet_proxy_port;
    }

    public String getEthernet_proxy_bypass() {
        return ethernet_proxy_bypass;
    }

    public void setEthernet_proxy_bypass(String ethernet_proxy_bypass) {
        this.ethernet_proxy_bypass = ethernet_proxy_bypass;
    }

    public String getEthernet_proxy_pacurl() {
        return ethernet_proxy_pacurl;
    }

    public void setEthernet_proxy_pacurl(String ethernet_proxy_pacurl) {
        this.ethernet_proxy_pacurl = ethernet_proxy_pacurl;
    }
}
