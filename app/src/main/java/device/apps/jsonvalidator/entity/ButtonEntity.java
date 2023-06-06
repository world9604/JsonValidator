package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import javax.validation.constraints.Pattern;

import device.apps.jsonvalidator.validator.pattern.FirstElementPattern;
import uk.co.jemos.podam.common.PodamCollection;
import uk.co.jemos.podam.common.PodamStringValue;

public class ButtonEntity {
    /*
    * Please set the field name to the keycode name.
    private final String[] KEYCODES = {
            "KEYCODE_SCANNER_R",
            "KEYCODE_SCANNER_L",
            "KEYCODE_SCANNER_B",
            "KEYCODE_SCANNER_F",
            "KEYCODE_POWER",
            "KEYCODE_DEL",
            "KEYCODE_HOME",
            "KEYCODE_BACK",
            "KEYCODE_APP_SWITCH",
            "KEYCODE_VOLUME_UP",
            "KEYCODE_VOLUME_DOWN",
            "KEYCODE_FORWARD_DEL",
            "KEYCODE_TAB",
            "KEYCODE_ENTER",
            "KEYCODE_ESCAPE",
            "KEYCODE_SOS",
            "KEYCODE_PTT_L",
            "KEYCODE_F1",
            "KEYCODE_F2",
            "KEYCODE_F3",
            "KEYCODE_F4",
            "KEYCODE_F5",
            "KEYCODE_F6",
            "KEYCODE_F7",
            "KEYCODE_F8",
    };
     */

    @PodamStringValue
    @Pattern(regexp = "^(Enable|Disable|Keep Current Option)$", message = "allowed_key_list_msg::Enable|Disable|Keep Current Option")
    @Expose
    @SerializedName("power_button_control")
    private String power_button_control;

    @PodamStringValue
    @Pattern(regexp = "^(PM85|PM550 Alpha|PM550 Amazon|PM30|PM75|PM560 Alphanumeric)$", message = "allowed_key_list_msg::PM85|PM550 Alpha|PM550 Amazon|PM30|PM75|PM560 Alphanumeric")
    @Expose
    @SerializedName("model_type")
    private String model_type;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_scanner_r")
    private ArrayList<String> keycode_scanner_r;

    //@PodamCollection(nbrElements = 2, collectionElementStrategy = ButtonValueStrategy.class)
    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_scanner_l")
    private ArrayList<String> keycode_scanner_l;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_scanner_b")
    private ArrayList<String> keycode_scanner_b;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_scanner_f")
    private ArrayList<String> keycode_scanner_f;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_power")
    private ArrayList<String> keycode_power;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_del")
    private ArrayList<String> keycode_del;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_home")
    private ArrayList<String> keycode_home;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_back")
    private ArrayList<String> keycode_back;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_app_switch")
    private ArrayList<String> keycode_app_switch;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_volume_up")
    private ArrayList<String> keycode_volume_up;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_volume_down")
    private ArrayList<String> keycode_volume_down;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_sos")
    private ArrayList<String> keycode_sos;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_pttl")
    private ArrayList<String> keycode_ptt_l;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_forward_del")
    private ArrayList<String> keycode_forward_del;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_tab")
    private ArrayList<String> keycode_tab;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_enter")
    private ArrayList<String> keycode_enter;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_escape")
    private ArrayList<String> keycode_escape;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f1")
    private ArrayList<String> keycode_f1;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f2")
    private ArrayList<String> keycode_f2;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f3")
    private ArrayList<String> keycode_f3;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f4")
    private ArrayList<String> keycode_f4;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f5")
    private ArrayList<String> keycode_f5;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f6")
    private ArrayList<String> keycode_f6;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f7")
    private ArrayList<String> keycode_f7;

    @PodamCollection(nbrElements = 2)
    @FirstElementPattern(pattern = "^(Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput)$", message = "allowed_key_list_msg::match only the first value : Keep Current Option|NoAction|DoScan|RightPttyKey|LeftPttyKey|EmergencyKey|Lock|BacklightKey|BkspKey|HomeKey|BackKey|MenuKey|AppSwitchKey|UpKey|DownKey|LeftKey|RightKey|VolumeUp|VolumeDown|DelKey|TabKey|EscKey|ReturnKey|Send|End|Vibrator|F1Key|F2Key|F3Key|F4Key|F5Key|F6Key|F7Key|F8Key|FuncKey|RunApplication|BroadcastKey|CustomIntent|DirectInput")
    @Expose
    @SerializedName("btn_f8")
    private ArrayList<String> keycode_f8;

    public String getPower_button_control() {
        return power_button_control;
    }

    public void setPower_button_control(String power_button_control) {
        this.power_button_control = power_button_control;
    }

    public String getModel_type() {
        return model_type;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public ArrayList<String> getKeycode_scanner_r() {
        return keycode_scanner_r;
    }

    public void setKeycode_scanner_r(ArrayList<String> keycode_scanner_r) {
        this.keycode_scanner_r = keycode_scanner_r;
    }

    public ArrayList<String> getKeycode_scanner_l() {
        return keycode_scanner_l;
    }

    public void setKeycode_scanner_l(ArrayList<String> keycode_scanner_l) {
        this.keycode_scanner_l = keycode_scanner_l;
    }

    public ArrayList<String> getKeycode_scanner_b() {
        return keycode_scanner_b;
    }

    public void setKeycode_scanner_b(ArrayList<String> keycode_scanner_b) {
        this.keycode_scanner_b = keycode_scanner_b;
    }

    public ArrayList<String> getKeycode_del() {
        return keycode_del;
    }

    public void setKeycode_del(ArrayList<String> keycode_del) {
        this.keycode_del = keycode_del;
    }

    public ArrayList<String> getKeycode_home() {
        return keycode_home;
    }

    public void setKeycode_home(ArrayList<String> keycode_home) {
        this.keycode_home = keycode_home;
    }

    public ArrayList<String> getKeycode_back() {
        return keycode_back;
    }

    public void setKeycode_back(ArrayList<String> keycode_back) {
        this.keycode_back = keycode_back;
    }

    public ArrayList<String> getKeycode_app_switch() {
        return keycode_app_switch;
    }

    public void setKeycode_app_switch(ArrayList<String> keycode_app_switch) {
        this.keycode_app_switch = keycode_app_switch;
    }

    public ArrayList<String> getKeycode_volume_up() {
        return keycode_volume_up;
    }

    public void setKeycode_volume_up(ArrayList<String> keycode_volume_up) {
        this.keycode_volume_up = keycode_volume_up;
    }

    public ArrayList<String> getKeycode_volume_down() {
        return keycode_volume_down;
    }

    public void setKeycode_volume_down(ArrayList<String> keycode_volume_down) {
        this.keycode_volume_down = keycode_volume_down;
    }

    public ArrayList<String> getKeycode_sos() {
        return keycode_sos;
    }

    public void setKeycode_sos(ArrayList<String> keycode_sos) {
        this.keycode_sos = keycode_sos;
    }

    public ArrayList<String> getKeycode_ptt_l()
    {
        return keycode_ptt_l;
    }

    public void setKeycode_pttl(ArrayList<String> keycode_ptt_l)
    {
        this.keycode_ptt_l = keycode_ptt_l;
    }

    public ArrayList<String> getKeycode_forward_del() {
        return keycode_forward_del;
    }

    public void setKeycode_forward_del(ArrayList<String> keycode_forward_del) {
        this.keycode_forward_del = keycode_forward_del;
    }

    public ArrayList<String> getKeycode_tab() {
        return keycode_tab;
    }

    public void setKeycode_tab(ArrayList<String> keycode_tab) {
        this.keycode_tab = keycode_tab;
    }

    public ArrayList<String> getKeycode_enter() {
        return keycode_enter;
    }

    public void setKeycode_enter(ArrayList<String> keycode_enter) {
        this.keycode_enter = keycode_enter;
    }

    public ArrayList<String> getKeycode_scanner_f() {
        return keycode_scanner_f;
    }

    public void setKeycode_scanner_f(ArrayList<String> keycode_scanner_f) {
        this.keycode_scanner_f = keycode_scanner_f;
    }

    public ArrayList<String> getKeycode_power() {
        return keycode_power;
    }

    public void setKeycode_power(ArrayList<String> keycode_power) {
        this.keycode_power = keycode_power;
    }

    public ArrayList<String> getKeycode_escape() {
        return keycode_escape;
    }

    public void setKeycode_escape(ArrayList<String> keycode_escape) {
        this.keycode_escape = keycode_escape;
    }

    public ArrayList<String> getKeycode_f1() {
        return keycode_f1;
    }

    public void setKeycode_f1(ArrayList<String> keycode_f1) {
        this.keycode_f1 = keycode_f1;
    }

    public ArrayList<String> getKeycode_f2() {
        return keycode_f2;
    }

    public void setKeycode_f2(ArrayList<String> keycode_f2) {
        this.keycode_f2 = keycode_f2;
    }

    public ArrayList<String> getKeycode_f3() {
        return keycode_f3;
    }

    public void setKeycode_f3(ArrayList<String> keycode_f3) {
        this.keycode_f3 = keycode_f3;
    }

    public ArrayList<String> getKeycode_f4() {
        return keycode_f4;
    }

    public void setKeycode_f4(ArrayList<String> keycode_f4) {
        this.keycode_f4 = keycode_f4;
    }

    public ArrayList<String> getKeycode_f5() {
        return keycode_f5;
    }

    public void setKeycode_f5(ArrayList<String> keycode_f5) {
        this.keycode_f5 = keycode_f5;
    }

    public ArrayList<String> getKeycode_f6() {
        return keycode_f6;
    }

    public void setKeycode_f6(ArrayList<String> keycode_f6) {
        this.keycode_f6 = keycode_f6;
    }

    public ArrayList<String> getKeycode_f7() {
        return keycode_f7;
    }

    public void setKeycode_f7(ArrayList<String> keycode_f7) {
        this.keycode_f7 = keycode_f7;
    }

    public ArrayList<String> getKeycode_f8() {
        return keycode_f8;
    }

    public void setKeycode_f8(ArrayList<String> keycode_f8) {
        this.keycode_f8 = keycode_f8;
    }
}
