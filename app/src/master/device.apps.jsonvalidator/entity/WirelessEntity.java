package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WirelessEntity {
    @Expose
    @SerializedName("nfc")
    private String nfc;

    @Expose
    @SerializedName("bluetooth")
    private String bluetooth;

    @Expose
    @SerializedName("wlan")
    private String wlan;

    @Expose
    @SerializedName("ethernet")
    private String ethernet;

    @Expose
    @SerializedName("gps")
    private String gps;

    @Expose
    @SerializedName("airplane")
    private String airplane;

    @Expose
    @SerializedName("power_menu")
    private String power_menu;

    @Expose
    @SerializedName("android_beam")
    private String android_beam;

    @Expose
    @SerializedName("hotspotConfig")
    private HotspotEntity hotspotConfig;

    @Expose
    @SerializedName("mobile_networks")
    private List<MobileNetwork> mobile_networks;

    @Expose
    @SerializedName("bluetooth_config")
    private BluetoothConfig bluetooth_config;

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getEthernet() {
        return ethernet;
    }

    public void setEthernet(String ethernet) {
        this.ethernet = ethernet;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getPower_menu() {
        return power_menu;
    }

    public void setPower_menu(String power_menu) {
        this.power_menu = power_menu;
    }

    public String getAndroid_beam()
    {
        return android_beam;
    }

    public void setAndroid_beam(String android_beam)
    {
        this.android_beam = android_beam;
    }

    public HotspotEntity getHotspotConfig()
    {
        return hotspotConfig;
    }

    public void setHotspotConfig(HotspotEntity hotspotConfig)
    {
        this.hotspotConfig = hotspotConfig;
    }

    public List<MobileNetwork> getMobileNetworks() {
        return mobile_networks;
    }

    public void setMobileNetworks(List<MobileNetwork> mobileNetworks) {
        this.mobile_networks = mobileNetworks;
    }

    public BluetoothConfig getBluetoothConfig() {
        return bluetooth_config;
    }

    public class MobileNetwork {
        @Expose
        @SerializedName("sim_slot")
        private int sim_slot;

        @Expose
        @SerializedName("config")
        private MobileNetworkConfig config;

        public int getSimSlot() {
            return sim_slot;
        }

        public void setSimSlot(int simSlot) {
            this.sim_slot = simSlot;
        }

        public MobileNetworkConfig getConfig() {
            return config;
        }

        public void setConfig(MobileNetworkConfig config) {
            this.config = config;
        }
    }

    public class MobileNetworkConfig {
        @Expose
        @SerializedName("data_roaming")
        private String data_roaming;

        public String getDataRoaming() {
            return data_roaming;
        }

        public void setDataRoaming(String dataRoaming) {
            this.data_roaming = dataRoaming;
        }
    }

    public static class BluetoothConfig {
        @Expose
        @SerializedName("ble_scan_interval")
        private String ble_scan_interval;

        @Expose
        @SerializedName("ble_scan_window")
        private String ble_scan_window;

        public String getBleScanInterval() {
            return ble_scan_interval;
        }

        public String getBleScanWindow() {
            return ble_scan_window;
        }
    }
}
