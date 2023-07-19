package device.apps.jsonvalidator.entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import javax.validation.constraints.Pattern;

import device.apps.jsonvalidator.Util;
import uk.co.jemos.podam.common.PodamCollection;
import uk.co.jemos.podam.common.PodamStringValue;


public class SystemEntity {
    @Expose
    @SerializedName("random_connect")
    private String random_connect;

    @Expose
    @SerializedName("resync_after")
    private String resync_after;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|None|Swipe)$", message = "allowed_key_list_msg::Keep Current Option|None|Swipe")
    @Expose
    @SerializedName("set_screenLockType")
    private String set_screenLockType;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("power_button_control")
    private String power_button_control;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-7])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_RING)
    private String volume_ring;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-15])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_MUSIC)
    private String volume_music;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-7])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_ALARM)
    private String volume_alarm;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-7])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_NOTIFICATION)
    private String volume_notification;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-5])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_CALL)
    private String volume_call;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-7])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_RING_MIN)
    private String volume_ring_min;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-15])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_MUSIC_MIN)
    private String volume_music_min;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-7])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_ALARM_MIN)
    private String volume_alarm_min;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-7])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5|6|7")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_NOTIFICATION_MIN)
    private String volume_notification_min;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|[1-5])$", message = "allowed_key_list_msg::Keep Current Option|1|2|3|4|5")
    @Expose
    @SerializedName(Util.KEY_SET_VOLUME_CALL_MIN)
    private String volume_call_min;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_ENABLED_OTHER_SOUNDS_DIALPAD)
    private String enabled_other_sounds_dialpad;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_ENABLED_OTHER_SOUNDS_SCREEN_LOCKING)
    private String enabled_other_sounds_screen_locking;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_ENABLED_OTHER_SOUNDS_CHARGING_SOUNDS)
    private String enabled_other_sounds_charging_sounds;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_ENABLED_OTHER_SOUNDS_TOUCH)
    private String enabled_other_sounds_touch;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_ENABLED_OTHER_SOUNDS_VIBRATE_ON_TOUCH)
    private String enabled_other_sounds_vibrate_on_touch;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_ENABLED_OTHER_SOUNDS_ALL)
    private String enabled_other_sounds_all;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("set_enabled_control_all_volumes_simultaneously")
    private String set_enabled_control_all_volumes_simultaneously;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|0|10|20|30|40|50|60|70|80|90|100)$", message = "allowed_key_list_msg::Keep Current Option|0|10|20|30|40|50|60|70|80|90|100")
    @Expose
    @SerializedName(Util.KEY_SET_SCREEN_BRIGHTNESS)
    private String screen_brightness;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Wet|Normal|Cotton Glove |Comfort Glove)$", message = "allowed_key_list_msg::Keep Current Option|Wet|Normal|Cotton Glove |Comfort Glove")
    @Expose
    @SerializedName(Util.KEY_SET_TOUCH_SENSITIVITY)
    private String touch_sensitivity;

    @Expose
    @SerializedName(Util.KEY_SET_NTP_SERVER)
    private String ntp_server;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|15000|30000|60000|120000|300000|600000|1800000|-1)$", message = "allowed_key_list_msg::Keep Current Option|15000|30000|60000|120000|300000|600000|1800000|-1")
    @Expose
    @SerializedName(Util.KEY_SET_SLEEP_TIMEOUT)
    private String sleep_timeout;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName(Util.KEY_SET_AUTO_ROTATE_SCREEN)
    private String auto_rotate_screen;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("hide_quick_settings")
    private String hide_quick_settings;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("restrict_mtp_connection")
    private String restrict_mtp_connection;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("disable_screenshot")
    private String disable_screenshot;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("hide_airplane_menu")
    private String hide_airplane_menu;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("restrict_AccessSDCard")
    private String restrict_AccessSDCard;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("disable_usb_debugging")
    private String disable_usb_debugging;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("all_Rotations_State")
    private String all_Rotations_State;

    @Expose
    @SerializedName("hideNavigationBar")
    private String hideNavigationBar;

    @PodamStringValue
    @Pattern(regexp = "^(Keep Current Option|Enable|Disable)$", message = "allowed_key_list_msg::Keep Current Option|Enable|Disable")
    @Expose
    @SerializedName("disable_notification_pulldown")
    private String disable_notification_pulldown;

    //@PodamCollection(nbrElements = 3)
    @Expose
    @SerializedName("activitymanager_Whitelist")
    private ArrayList<String> activitymanager_Whitelist;

    //@PodamCollection(nbrElements = 3)
    @Expose
    @SerializedName("battery_Whitelist")
    private ArrayList<String> battery_Whitelist;


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

    public String getVolume_ring_min()
    {
        return volume_ring_min;
    }

    public void setVolume_ring_min(String volume_ring_min)
    {
        this.volume_ring_min = volume_ring_min;
    }

    public String getVolume_music_min()
    {
        return volume_music_min;
    }

    public void setVolume_music_min(String volume_music_min)
    {
        this.volume_music_min = volume_music_min;
    }

    public String getVolume_alarm_min()
    {
        return volume_alarm_min;
    }

    public void setVolume_alarm_min(String volume_alarm_min)
    {
        this.volume_alarm_min = volume_alarm_min;
    }

    public String getVolume_notification_min()
    {
        return volume_notification_min;
    }

    public void setVolume_notification_min(String volume_notification_min)
    {
        this.volume_notification_min = volume_notification_min;
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

    public String getSet_enabled_control_all_volumes_simultaneously()
    {
        return set_enabled_control_all_volumes_simultaneously;
    }

    public void setSet_enabled_control_all_volumes_simultaneously(String set_enabled_control_all_volumes_simultaneously)
    {
        this.set_enabled_control_all_volumes_simultaneously = set_enabled_control_all_volumes_simultaneously;
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

    public String getRandom_connect() {
        return random_connect;
    }

    public void setRandom_connect(String random_connect) {
        this.random_connect = random_connect;
    }

    public String getResync_after() {
        return resync_after;
    }

    public void setResync_after(String resync_after) {
        this.resync_after = resync_after;
    }

    public String getSet_screenLockType() {
        return set_screenLockType;
    }

    public void setSet_screenLockType(String set_screenLockType) {
        this.set_screenLockType = set_screenLockType;
    }

    public String getPower_button_control() {
        return power_button_control;
    }

    public void setPower_button_control(String power_button_control) {
        this.power_button_control = power_button_control;
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

    public String getVolume_call()
    {
        return volume_call;
    }

    public void setVolume_call(String volume_call)
    {
        this.volume_call = volume_call;
    }

    public String getVolume_call_min()
    {
        return volume_call_min;
    }

    public void setVolume_call_min(String volume_call_min)
    {
        this.volume_call_min = volume_call_min;
    }

    public String getDisable_notification_pulldown()
    {
        return disable_notification_pulldown;
    }

    public void setDisable_notification_pulldown(String disable_notification_pulldown)
    {
        this.disable_notification_pulldown = disable_notification_pulldown;
    }

    public ArrayList<String> getBattery_Whitelist()
    {
        return battery_Whitelist;
    }

    public void setBattery_Whitelist(ArrayList<String> battery_Whitelist)
    {
        this.battery_Whitelist = battery_Whitelist;
    }

    public ArrayList<String> getActivitymanager_Whitelist()
    {
        return activitymanager_Whitelist;
    }

    public void setActivitymanager_Whitelist(ArrayList<String> activitymanager_Whitelist)
    {
        this.activitymanager_Whitelist = activitymanager_Whitelist;
    }
}