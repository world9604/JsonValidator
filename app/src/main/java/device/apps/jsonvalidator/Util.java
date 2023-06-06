package device.apps.jsonvalidator;


import android.security.KeyChain;
import java.util.HashMap;
import java.util.Map;

public class Util {
    public static final String EMKIT_SET_FILE = "EmkitAgent.json";

    public static final String KEY_PROXY_SETTING = "set_proxy_setting";
    public static final String KEY_PROXY_SETTING_TPYE = "set_proxy_setting_type";
    public static final String KEY_PROXY_SETTING_ADDRESS = "set_proxy_setting_address";
    public static final String KEY_PROXY_SETTING_BYPASS = "set_proxy_setting_bypass";

    public static final String KEY_WIFI_AUTO_JOIN = "set_wifi_auto_join";

    public static final String KEY_WIFI_802 = "set_wifi_802_11d";
    public static final String KEY_WIFI_BACKGROUND_SCAN_TRIGGERS = "set_wifi_scan_trigger";
    public static final String KEY_WIFI_ROAMING_TRIGGER = "set_wifi_roaming_trigger";
    public static final String KEY_WIFI_POWER_SAVE_MODE = "set_wifi_power_save";

    public static final String KEY_SET_COUNTRY_CODE = "set_country_code";

    public static final String KEY_SET_BAND_FREQUENCY = "set_band_frequency";

    public static final String KEY_SET_24GHZ_CHANNEL = "set_24Ghz_channel_list";
    public static final String KEY_SET_5GHZ_CHANNEL = "set_5Ghz_channel_list";

    public static final String KEY_SET_VOLUME = "set_volume";
    public static final String KEY_SET_VOLUME_RING = "set_volume_ring";
    public static final String KEY_SET_VOLUME_MUSIC = "set_volume_music";
    public static final String KEY_SET_VOLUME_ALARM = "set_volume_alarm";
    public static final String KEY_SET_VOLUME_NOTIFICATION = "set_volume_notification";
    public static final String KEY_SET_VOLUME_CALL = "set_volume_call";
    public static final String KEY_SET_VOLUME_RING_MIN = "set_volume_ring_min";
    public static final String KEY_SET_VOLUME_MUSIC_MIN = "set_volume_music_min";
    public static final String KEY_SET_VOLUME_ALARM_MIN = "set_volume_alarm_min";
    public static final String KEY_SET_VOLUME_NOTIFICATION_MIN = "set_volume_notification_min";
    public static final String KEY_SET_VOLUME_CALL_MIN = "set_volume_call_min";

    public static final String KEY_SET_ENABLED_OTHER_SOUNDS = "set_enabled_other_sounds";
    public static final String KEY_SET_ENABLED_OTHER_SOUNDS_DIALPAD = "set_enabled_other_sounds_dialpad";
    public static final String KEY_SET_ENABLED_OTHER_SOUNDS_SCREEN_LOCKING = "set_enabled_other_sounds_screen_locking";
    public static final String KEY_SET_ENABLED_OTHER_SOUNDS_TOUCH = "set_enabled_other_sounds_touch";
    public static final String KEY_SET_ENABLED_OTHER_SOUNDS_CHARGING_SOUNDS = "set_enabled_other_sounds_charging_sounds";
    public static final String KEY_SET_ENABLED_OTHER_SOUNDS_VIBRATE_ON_TOUCH = "set_enabled_other_sounds_vibrate_on_touch";
    public static final String KEY_SET_ENABLED_OTHER_SOUNDS_ALL = "set_enabled_other_sounds_all";

    public static final String KEY_SET_SCREEN_BRIGHTNESS = "set_screen_brightness";
    public static final String KEY_SET_TOUCH_SENSITIVITY = "set_touch_sensitivity";
    public static final String KEY_SET_NTP_SERVER = "set_ntp_server";
    public static final String KEY_SET_SLEEP_TIMEOUT = "set_sleep_timeout";
    public static final String KEY_SET_AUTO_ROTATE_SCREEN = "set_auto_rotate_screen";

    public static final String KEY_REBOOT = "reboot";

    public static final String KEY_OS_IMAGE_UPGRADE = "os_image_upgrade";
    public static final String KEY_OS_IMAGE_UPGRADE_TYPE = "os_image_upgrade_type";
    public static final String KEY_OS_IMAGE_UPGRADE_FILE_NAME = "os_image_upgrade_file_name";

    public static final String KEY_RESTORE_FROME_FILE = "restore_from_file";
    public static final String KEY_RESTORE_FROME_FILE_PATH = "restore_from_file_path";
    public static final String KEY_RESTORE_FROME_FILE_PASSWORD = "restore_from_file_password";

    public static final String KEY_CER_TYPE = "cer_type";
    public static final String KEY_CER_PATH = "cer_path";
    public static final String KEY_CER_PASS = "cer_pass";
    public static final String KEY_CER_CER_INSTALL = "cer_install";
    public static final String KEY_WIFI_SSID = "ssid";
    public static final String KEY_WIFI_HIDE = "hide";
    public static final String KEY_WIFI_WHITE_LIST = "whitelist";
    public static final String KEY_WIFI_PASSWORD = "password";
    public static final String KEY_WIFI_SECURITY = "security";
    public static final String KEY_WIFI_EAP = "eap";
    public static final String KEY_WIFI_P2AU = "pa2au";
    public static final String KEY_WIFI_IDENTITY = "identity";
    public static final String KEY_WIFI_DHCP_NTP = "dhcp_ntp";
    public static final String KEY_CA_CERTIFICATE = "ca_cer";
    public static final String KEY_WIFI_USER_CERT = "user_cer";
    public static final String KEY_WIFI_WIFI_CONFIG = "wifi_config";
    public static final String KEY_SET_SCANNING_THROTTLING = "set_scanning_throttling";

    private static Map<String, String> MIME_MAPPINGS = new HashMap<>();
    public static final String WIFI_CONFIG = "wifi-config";
    static {
        MIME_MAPPINGS.put("application/x-x509-ca-cert", KeyChain.EXTRA_CERTIFICATE);
        MIME_MAPPINGS.put("application/x-x509-user-cert", KeyChain.EXTRA_CERTIFICATE);
        MIME_MAPPINGS.put("application/x-x509-server-cert", KeyChain.EXTRA_CERTIFICATE);
        MIME_MAPPINGS.put("application/x-pem-file", KeyChain.EXTRA_CERTIFICATE);
        MIME_MAPPINGS.put("application/pkix-cert", KeyChain.EXTRA_CERTIFICATE);
        MIME_MAPPINGS.put("application/x-pkcs12", KeyChain.EXTRA_PKCS12);
        MIME_MAPPINGS.put("application/x-wifi-config", WIFI_CONFIG);
    }

    public static String CERT_TYPE_WIFI = "Wi-Fi";
    public static String CERT_TYPE_VPN = "VPN_App";

    public static final int NOT_SUPPORTED = -1;
    public static final int VOLUME_CALL = 0;
    public static final int VOLUME_RING = 2;
    public static final int VOLUME_MUSIC = 3;
    public static final int VOLUME_ALARM = 4;
    public static final int VOLUME_NOTIFICATION = 5;

    public static final int SOUND_DIALPAD = 0;
    public static final int SOUND_SCREEN_LOCKING = 1;
    public static final int SOUND_CHARGING = 2;
    //public static final int SOUND_DOCKING                 = 3;
    public static final int SOUND_TOUCH = 4;
    public static final int SOUND_VIBRATE_ON_TOUCH = 5;
    //public static final int SOUND_DOCK_AUDIO_MEDIA        = 6;
    //public static final int SOUND_EMERGENCY               = 7;

    public static String EXTRA_WIRELESS_VALUE = "EmkitAgent_Wireless_Value";
    public static String EXTRA_WLAN_VALUE = "EmkitAgent_Wlan_Value";
    public static String EXTRA_ETHERNET_VALUE = "EmkitAgent_Ethernet_Value";
    public static String EXTRA_PHONE_VALUE = "EmkitAgent_Phone_Value";
    public static String EXTRA_SYSTEM_VALUE = "EmkitAgent_System_Value";
    public static String EXTRA_DATETIME_VALUE = "EmkitAgent_DateTime_Value";
    public static String EXTRA_OTHER_VALUE = "EmkitAgent_Other_Value";
    public static String EXTRA_SCANNER_VALUE = "EmkitAgent_Scanner_Value";
    public static String EXTRA_BUTTON_VALUE = "EmkitAgent_Button_Value";
    public static String EXTRA_SCREENLOCK_VALUE = "EmkitAgent_ScreenLock_Value";
    public static String EXTRA_NEED_REBOOT = "EmkitAgent_NeedReboot";

    public Util() { }
}

