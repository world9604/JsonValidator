package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class SystemEntity {
    @Expose
    @SerializedName("set_volume_ring")
    private String volume_ring;

    @Expose
    @SerializedName("set_volume_music")
    private String volume_music;

    @Expose
    @SerializedName("set_volume_alarm")
    private String volume_alarm;

    @Expose
    @SerializedName("set_volume_notification")
    private String volume_notification;

    @Expose
    @SerializedName("set_enabled_other_sounds_dialpad")
    private String enabled_other_sounds_dialpad;

    @Expose
    @SerializedName("set_enabled_other_sounds_screen_locking")
    private String enabled_other_sounds_screen_locking;

    @Expose
    @SerializedName("set_enabled_other_sounds_charging_sounds")
    private String enabled_other_sounds_charging_sounds;

    @Expose
    @SerializedName("set_enabled_other_sounds_touch")
    private String enabled_other_sounds_touch;

    @Expose
    @SerializedName("set_enabled_other_sounds_vibrate_on_touch")
    private String enabled_other_sounds_vibrate_on_touch;

    @Expose
    @SerializedName("set_enabled_other_sounds_all")
    private String enabled_other_sounds_all;

    @Expose
    @SerializedName("set_screen_brightness")
    private String screen_brightness;

    @Expose
    @SerializedName("set_touch_sensitivity")
    private String touch_sensitivity;

    @Expose
    @SerializedName("set_ntp_server")
    private String ntp_server;

    @Expose
    @SerializedName("set_sleep_timeout")
    private String sleep_timeout;

    @Expose
    @SerializedName("set_auto_rotate_screen")
    private String auto_rotate_screen;

    @Expose
    @SerializedName("hide_quick_settings")
    private String hide_quick_settings;

    @Expose
    @SerializedName("restrict_mtp_connection")
    private String restrict_mtp_connection;

    @Expose
    @SerializedName("disable_screenshot")
    private String disable_screenshot;

    @Expose
    @SerializedName("hide_airplane_menu")
    private String hide_airplane_menu;

    @Expose
    @SerializedName("restrict_quick_settings")
    private String restrict_quick_settings;

    @Expose
    @SerializedName("restrict_notification_pulldown")
    private String restrict_notification_pulldown;

    @Expose
    @SerializedName("restrict_mtp_connection_new")
    private String restrict_mtp_connection_new;

    @Expose
    @SerializedName("restrict_screenshot")
    private String restrict_screenshot;

    @Expose
    @SerializedName("restrict_airplane_menu")
    private String restrict_airplane_menu;

    @Expose
    @SerializedName("set_language")
    private String set_language;

    @Expose
    @SerializedName("default_ime")
    private String default_ime;

    @Expose
    @SerializedName("restrict_AccessSDCard")
    private String restrict_AccessSDCard;

    @Expose
    @SerializedName("disable_usb_debugging")
    private String disable_usb_debugging;

    @Expose
    @SerializedName("all_Rotations_State")
    private String all_Rotations_State;

    @Expose
    @SerializedName("hideNavigationBar")
    private String hideNavigationBar;

    @Expose
    @SerializedName("rotate_button_on_navigationbar")
    private String rotateButtonOnNavigationBar;

    @Expose
    @SerializedName("restrict_factory_reset")
    private String restrict_factory_reset;

    @Expose
    @SerializedName("restrict_install_apps")
    private String restrict_install_apps;

    @Expose
    @SerializedName("restrict_uninstall_apps")
    private String restrict_uninstall_apps;

    @Expose
    @SerializedName("restrict_camera")
    private String restrict_camera;

    @Expose
    @SerializedName("restrict_safe_boot")
    private String restrict_safe_boot;

    @Expose
    @SerializedName("install_non_market_apps")
    private String install_non_market_apps;

    @Expose
    @SerializedName("set_show_virtual_keyboard")
    private String set_show_virtual_keyboard;

    @Expose
    @SerializedName("bat_chargng_amimfation")
    private String bat_chargng_amimfation;

    @Expose
    @SerializedName("usb_module_usage")
    private String usb_module_usage;

    @Expose
    @SerializedName("hotspot_tethering")
    private String hotspot_tethering;

    @Expose
    @SerializedName("restrict_bluetooth")
    private String restrict_bluetooth;

    @Expose
    @SerializedName("set_drakmode")
    private String set_drakmode;

    @Expose
    @SerializedName("set_show_battery_percentage")
    private String set_show_battery_percentage;
    @Expose
    @SerializedName("set_adaptive_brightness")
    private String set_adaptive_brightness;

    @Expose
    @SerializedName("set_system_font_size")
    private String set_system_font_size;

    @Expose
    @SerializedName("set_system_display_size")
    private String set_system_display_size;

    @Expose
    @SerializedName("default_usb_config")
    private String default_usb_config;

    @Expose
    @SerializedName("smart_charging")
    private String smart_charging;

    @Expose
    @SerializedName("physical_keypad_sound_enable")
    private String physical_keypad_sound_enable;

    @Expose
    @SerializedName("physical_keypad_sound_volume")
    private String physical_keypad_sound_volume;

    @Expose
    @SerializedName("physical_keypad_vibrate_enable")
    private String physical_keypad_vibrate_enable;

    @Expose
    @SerializedName("physical_keypad_vibrate_duration")
    private String physical_keypad_vibrate_duration;

    @Expose
    @SerializedName("battery_optimization_enabled_apps")
    private ArrayList<String> battery_optimization_enabled_apps;

    @Expose
    @SerializedName("battery_optimization_disabled_apps")
    private ArrayList<String> battery_optimization_disabled_apps;

    @Expose
    @SerializedName("battery_true_hotswap_enable")
    private String true_hot_swap_enable;

    @Expose
    @SerializedName("battery_bri_warning_threshold")
    private String batteryBriWarningThreshold;

    @Expose
    @SerializedName("battery_remaining_life_warning_threshold")
    private String batteryRemainingLifeWarningThreshold;

    @Expose
    @SerializedName("battery_cycle_count_warning_threshold")
    private String batteryCycleCountWarningThreshold;

    @Expose
    @SerializedName("battery_bri_bad_threshold")
    private String batteryBriBadThreshold;

    @Expose
    @SerializedName("battery_remaining_life_bad_threshold")
    private String batteryRemainingLifeBadThreshold;

    @Expose
    @SerializedName("battery_cycle_count_bad_threshold")
    private String batteryCycleCountBadThreshold;

    @Expose
    @SerializedName("activitymanager_Whitelist")
    private ArrayList<String> unlimitedCpuUsagePackages;

    public String getTrue_hot_swap_enable() {
        return true_hot_swap_enable;
    }

    public void setTrue_hot_swap_enable(String true_hot_swap_enable) {
        this.true_hot_swap_enable = true_hot_swap_enable;
    }

    public String getSmart_charging() {
        return smart_charging;
    }

    public void setSmart_charging(String smart_charging) {
        this.smart_charging = smart_charging;
    }

    public String getPhysical_keypad_sound_enable() {
        return physical_keypad_sound_enable;
    }

    public void setPhysical_keypad_sound_enable(String physical_keypad_sound_enable) {
        this.physical_keypad_sound_enable = physical_keypad_sound_enable;
    }

    public String getPhysical_keypad_sound_volume() {
        return physical_keypad_sound_volume;
    }

    public void setPhysical_keypad_sound_volume(String physical_keypad_sound_volume) {
        this.physical_keypad_sound_volume = physical_keypad_sound_volume;
    }

    public String getPhysical_keypad_vibrate_enable() {
        return physical_keypad_vibrate_enable;
    }

    public void setPhysical_keypad_vibrate_enable(String physical_keypad_vibrate_enable) {
        this.physical_keypad_vibrate_enable = physical_keypad_vibrate_enable;
    }

    public String getPhysical_keypad_vibrate_duration() {
        return physical_keypad_vibrate_duration;
    }

    public void setPhysical_keypad_vibrate_duration(String physical_keypad_vibrate_duration) {
        this.physical_keypad_vibrate_duration = physical_keypad_vibrate_duration;
    }

    public String getVolume_ring() {
        return volume_ring;
    }

    public void setVolume_ring(String volume_ring) {
        this.volume_ring = volume_ring;
    }

    public String getVolume_music() {
        return volume_music;
    }

    public void setVolume_music(String volume_music) {
        this.volume_music = volume_music;
    }

    public String getVolume_alarm() {
        return volume_alarm;
    }

    public void setVolume_alarm(String volume_alarm) {
        this.volume_alarm = volume_alarm;
    }

    public String getVolume_notification() {
        return volume_notification;
    }

    public void setVolume_notification(String volume_notification) {
        this.volume_notification = volume_notification;
    }

    public String getEnabled_other_sounds_dialpad() {
        return enabled_other_sounds_dialpad;
    }

    public void setEnabled_other_sounds_dialpad(String enabled_other_sounds_dialpad) {
        this.enabled_other_sounds_dialpad = enabled_other_sounds_dialpad;
    }

    public String getEnabled_other_sounds_screen_locking() {
        return enabled_other_sounds_screen_locking;
    }

    public void setEnabled_other_sounds_screen_locking(String enabled_other_sounds_screen_locking) {
        this.enabled_other_sounds_screen_locking = enabled_other_sounds_screen_locking;
    }

    public String getEnabled_other_sounds_charging_sounds() {
        return enabled_other_sounds_charging_sounds;
    }

    public void setEnabled_other_sounds_charging_sounds(String enabled_other_sounds_charging_sounds) {
        this.enabled_other_sounds_charging_sounds = enabled_other_sounds_charging_sounds;
    }

    public String getEnabled_other_sounds_touch() {
        return enabled_other_sounds_touch;
    }

    public void setEnabled_other_sounds_touch(String enabled_other_sounds_touch) {
        this.enabled_other_sounds_touch = enabled_other_sounds_touch;
    }

    public String getEnabled_other_sounds_vibrate_on_touch() {
        return enabled_other_sounds_vibrate_on_touch;
    }

    public void setEnabled_other_sounds_vibrate_on_touch(String enabled_other_sounds_vibrate_on_touch) {
        this.enabled_other_sounds_vibrate_on_touch = enabled_other_sounds_vibrate_on_touch;
    }

    public String getEnabled_other_sounds_all() {
        return enabled_other_sounds_all;
    }

    public void setEnabled_other_sounds_all(String enabled_other_sounds_all) {
        this.enabled_other_sounds_all = enabled_other_sounds_all;
    }

    public String getScreen_brightness() {
        return screen_brightness;
    }

    public void setScreen_brightness(String screen_brightness) {
        this.screen_brightness = screen_brightness;
    }

    public String getTouch_sensitivity() {
        return touch_sensitivity;
    }

    public void setTouch_sensitivity(String touch_sensitivity) {
        this.touch_sensitivity = touch_sensitivity;
    }

    public String getNtp_server() {
        return ntp_server;
    }

    public void setNtp_server(String ntp_server) {
        this.ntp_server = ntp_server;
    }

    public String getSleep_timeout() {
        return sleep_timeout;
    }

    public void setSleep_timeout(String sleep_timeout) {
        this.sleep_timeout = sleep_timeout;
    }

    public String getAuto_rotate_screen() {
        return auto_rotate_screen;
    }

    public void setAuto_rotate_screen(String auto_rotate_screen) {
        this.auto_rotate_screen = auto_rotate_screen;
    }

    public String getHide_quick_settings() {
        return hide_quick_settings;
    }

    public void setHide_quick_settings(String hide_quick_settings) {
        this.hide_quick_settings = hide_quick_settings;
    }

    public String getRestrict_mtp_connection() {
        return restrict_mtp_connection;
    }

    public void setRestrict_mtp_connection(String restrict_mtp_connection) {
        this.restrict_mtp_connection = restrict_mtp_connection;
    }

    public String getDisable_screenshot() {
        return disable_screenshot;
    }

    public void setDisable_screenshot(String disable_screenshot) {
        this.disable_screenshot = disable_screenshot;
    }

    public String getHide_airplane_menu() {
        return hide_airplane_menu;
    }

    public void setHide_airplane_menu(String hide_airplane_menu) {
        this.hide_airplane_menu = hide_airplane_menu;
    }

    public String getSet_language()
    {
        return set_language;
    }

    public void setSet_language(String set_language)
    {
        this.set_language = set_language;
    }

    public String getDefault_ime()
    {
        return default_ime;
    }

    public void setDefault_ime(String default_ime)
    {
        this.default_ime = default_ime;
    }

    public String getRestrict_AccessSDCard()
    {
        return restrict_AccessSDCard;
    }

    public void setRestrict_AccessSDCard(String restrict_AccessSDCard)
    {
        this.restrict_AccessSDCard = restrict_AccessSDCard;
    }

    public String getDisable_usb_debugging()
    {
        return disable_usb_debugging;
    }

    public void setDisable_usb_debugging(String disable_usb_debugging)
    {
        this.disable_usb_debugging = disable_usb_debugging;
    }

    public String getAll_Rotations_State()
    {
        return all_Rotations_State;
    }

    public void setAll_Rotations_State(String all_Rotations_State)
    {
        this.all_Rotations_State = all_Rotations_State;
    }

    public String getHideNavigationBar()
    {
        return hideNavigationBar;
    }

    public void setHideNavigationBar(String hideNavigationBar)
    {
        this.hideNavigationBar = hideNavigationBar;
    }

    public String getRotateButtonOnNavigationBar() {
        return rotateButtonOnNavigationBar;
    }

    public void setRotateButtonOnNavigationBar(String rotateButtonOnNavigationBar) {
        this.rotateButtonOnNavigationBar = rotateButtonOnNavigationBar;
    }

    public String getRestrict_quick_settings()
    {
        return restrict_quick_settings;
    }

    public void setRestrict_quick_settings(String restrict_quick_settings)
    {
        this.restrict_quick_settings = restrict_quick_settings;
    }

    public String getRestrict_mtp_connection_new()
    {
        return restrict_mtp_connection_new;
    }

    public void setRestrict_mtp_connection_new(String restrict_mtp_connection_new)
    {
        this.restrict_mtp_connection_new = restrict_mtp_connection_new;
    }

    public String getRestrict_screenshot()
    {
        return restrict_screenshot;
    }

    public void setRestrict_screenshot(String restrict_screenshot)
    {
        this.restrict_screenshot = restrict_screenshot;
    }

    public String getRestrict_airplane_menu()
    {
        return restrict_airplane_menu;
    }

    public void setRestrict_airplane_menu(String restrict_airplane_menu)
    {
        this.restrict_airplane_menu = restrict_airplane_menu;
    }

    public String getRestrict_factory_reset()
    {
        return restrict_factory_reset;
    }

    public void setRestrict_factory_reset(String restrict_factory_reset)
    {
        this.restrict_factory_reset = restrict_factory_reset;
    }

    public String getRestrict_install_apps()
    {
        return restrict_install_apps;
    }

    public void setRestrict_install_apps(String restrict_install_apps)
    {
        this.restrict_install_apps = restrict_install_apps;
    }

    public String getRestrict_uninstall_apps()
    {
        return restrict_uninstall_apps;
    }

    public void setRestrict_uninstall_apps(String restrict_uninstall_apps)
    {
        this.restrict_uninstall_apps = restrict_uninstall_apps;
    }

    public String getRestrict_camera()
    {
        return restrict_camera;
    }

    public void setRestrict_camera(String restrict_camera)
    {
        this.restrict_camera = restrict_camera;
    }

    public String getRestrict_safe_boot()
    {
        return restrict_safe_boot;
    }

    public void setRestrict_safe_boot(String restrict_safe_boot)
    {
        this.restrict_safe_boot = restrict_safe_boot;
    }

    public String getInstall_non_market_apps()
    {
        return install_non_market_apps;
    }

    public void setInstall_non_market_apps(String install_non_market_apps)
    {
        this.install_non_market_apps = install_non_market_apps;
    }

    public String getSet_show_virtual_keyboard()
    {
        return set_show_virtual_keyboard;
    }

    public void setSet_show_virtual_keyboard(String set_show_virtual_keyboard)
    {
        this.set_show_virtual_keyboard = set_show_virtual_keyboard;
    }

    public String getBat_chargng_amimfation()
    {
        return bat_chargng_amimfation;
    }

    public void setBat_chargng_amimfation(String bat_chargng_amimfation)
    {
        this.bat_chargng_amimfation = bat_chargng_amimfation;
    }

    public String getUsb_module_usage()
    {
        return usb_module_usage;
    }

    public void setUsb_module_usage(String usb_module_usage)
    {
        this.usb_module_usage = usb_module_usage;
    }

    public String getHotspot_tethering()
    {
        return hotspot_tethering;
    }

    public void setHotspot_tethering(String hotspot_tethering)
    {
        this.hotspot_tethering = hotspot_tethering;
    }

    public String getRestrict_bluetooth()
    {
        return restrict_bluetooth;
    }

    public void setRestrict_bluetooth(String restrict_bluetooth)
    {
        this.restrict_bluetooth = restrict_bluetooth;
    }

    public String getSet_drakmode()
    {
        return set_drakmode;
    }

    public void setSet_drakmode(String set_drakmode)
    {
        this.set_drakmode = set_drakmode;
    }

    public String getSet_show_battery_percentage()
    {
        return set_show_battery_percentage;
    }

    public void setSet_show_battery_percentage(String set_show_battery_percentage)
    {
        this.set_show_battery_percentage = set_show_battery_percentage;
    }

    public String getSet_adaptive_brightness()
    {
        return set_adaptive_brightness;
    }

    public void setSet_adaptive_brightness(String set_adaptive_brightness)
    {
        this.set_adaptive_brightness = set_adaptive_brightness;
    }

    public String getSet_system_font_size()
    {
        return set_system_font_size;
    }

    public void setSet_system_font_size(String set_system_font_size)
    {
        this.set_system_font_size = set_system_font_size;
    }

    public String getSet_system_display_size()
    {
        return set_system_display_size;
    }

    public void setSet_system_display_size(String set_system_display_size)
    {
        this.set_system_display_size = set_system_display_size;
    }

    public String getRestrict_notification_pulldown() {
        return restrict_notification_pulldown;
    }

    public void setRestrict_notification_pulldown(String restrict_notification_pulldown) {
        this.restrict_notification_pulldown = restrict_notification_pulldown;
    }

    public String getDefault_usb_config() {
        return default_usb_config;
    }

    public void setDefault_usb_config(String default_usb_config) {
        this.default_usb_config = default_usb_config;
    }

    public ArrayList<String> getBattery_optimization_enabled_apps() {
        return battery_optimization_enabled_apps;
    }

    public void setBattery_optimization_enabled_apps(
            ArrayList<String> battery_optimization_enabled_apps) {
        this.battery_optimization_enabled_apps = battery_optimization_enabled_apps;
    }

    public ArrayList<String> getBattery_optimization_disabled_apps() {
        return battery_optimization_disabled_apps;
    }

    public void setBattery_optimization_disabled_apps(
            ArrayList<String> battery_optimization_disabled_apps) {
        this.battery_optimization_disabled_apps = battery_optimization_disabled_apps;
    }

    public String getBatteryBriWarningThreshold() {
        return batteryBriWarningThreshold;
    }

    public void setBatteryBriWarningThreshold(String batteryBriWarningThreshold) {
        this.batteryBriWarningThreshold = batteryBriWarningThreshold;
    }

    public String getBatteryRemainingLifeWarningThreshold() {
        return batteryRemainingLifeWarningThreshold;
    }

    public void setBatteryRemainingLifeWarningThreshold(String batteryRemainingLifeWarningThreshold) {
        this.batteryRemainingLifeWarningThreshold = batteryRemainingLifeWarningThreshold;
    }

    public String getBatteryCycleCountWarningThreshold() {
        return batteryCycleCountWarningThreshold;
    }

    public void setBatteryCycleCountWarningThreshold(String batteryCycleCountWarningThreshold) {
        this.batteryCycleCountWarningThreshold = batteryCycleCountWarningThreshold;
    }

    public String getBatteryBriBadThreshold() {
        return batteryBriBadThreshold;
    }

    public void setBatteryBriBadThreshold(String batteryBriBadThreshold) {
        this.batteryBriBadThreshold = batteryBriBadThreshold;
    }

    public String getBatteryRemainingLifeBadThreshold() {
        return batteryRemainingLifeBadThreshold;
    }

    public void setBatteryRemainingLifeBadThreshold(String batteryRemainingLifeBadThreshold) {
        this.batteryRemainingLifeBadThreshold = batteryRemainingLifeBadThreshold;
    }

    public String getBatteryCycleCountBadThreshold() {
        return batteryCycleCountBadThreshold;
    }

    public void setBatteryCycleCountBadThreshold(String batteryCycleCountBadThreshold) {
        this.batteryCycleCountBadThreshold = batteryCycleCountBadThreshold;
    }

    public ArrayList<String> getUnlimitedCpuUsagePackages() {
        return unlimitedCpuUsagePackages;
    }

    public void setUnlimitedCpuUsagePackages(ArrayList<String> unlimitedCpuUsagePackages) {
        this.unlimitedCpuUsagePackages = unlimitedCpuUsagePackages;
    }
}
