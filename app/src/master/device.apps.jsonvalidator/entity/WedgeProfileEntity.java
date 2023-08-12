package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class WedgeProfileEntity
{
    @Expose
    @SerializedName("admin_password")
    private String admin_password;

    @Expose
    @SerializedName("profiles")
    private ArrayList<WedgeProfile> profiles;

    public String getAdmin_password()
    {
        return admin_password;
    }

    public void setAdmin_password(String admin_password)
    {
        this.admin_password = admin_password;
    }

    public ArrayList<WedgeProfile> getProfiles()
    {
        return profiles;
    }

    public void setProfiles(ArrayList<WedgeProfile> profiles)
    {
        this.profiles = profiles;
    }
}

class WedgeProfile
{
    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("enabled")
    private boolean enabled;

    @Expose
    @SerializedName("scanner")
    private int scanner;

    @Expose
    @SerializedName("scan_mode") //[#23206] TriggerMode 추가
    private ScanModeEntity scanModeEntity;

    @Expose
    @SerializedName("wedge_mode")
    private WedgeMode wedge_mode;

    @Expose
    @SerializedName("custom_intent")
    private WedgeCustomIntent custom_intent;

    @Expose
    @SerializedName("wedge")
    private Wedge wedge;

    @Expose
    @SerializedName("associated_apps")
    private ArrayList<String> associated_apps;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getScanner() {
        return scanner;
    }

    public void setScanner(int scanner) {
        this.scanner = scanner;
    }

    public WedgeMode getWedge_mode()
    {
        return wedge_mode;
    }

    public void setWedge_mode(WedgeMode wedge_mode)
    {
        this.wedge_mode = wedge_mode;
    }

    public WedgeCustomIntent getCustom_intent()
    {
        return custom_intent;
    }

    public void setCustom_intent(WedgeCustomIntent custom_intent)
    {
        this.custom_intent = custom_intent;
    }

    public Wedge getWedge()
    {
        return wedge;
    }

    public void setWedge(Wedge wedge)
    {
        this.wedge = wedge;
    }

    public ArrayList<String> getAssociated_apps()
    {
        return associated_apps;
    }

    public void setAssociated_apps(ArrayList<String> associated_apps)
    {
        this.associated_apps = associated_apps;
    }
}

class WedgeMode
{
    @Expose
    @SerializedName("result_type")
    private Integer result_type;

    @Expose
    @SerializedName("terminator")
    private Integer terminator;

    public int getResult_type()
    {
        return result_type;
    }

    public void setResult_type(int result_type)
    {
        this.result_type = result_type;
    }

    public int getTerminator()
    {
        return terminator;
    }

    public void setTerminator(int terminator)
    {
        this.terminator = terminator;
    }
}

class WedgeCustomIntent
{
    @Expose
    @SerializedName("action")
    private String action;

    @Expose
    @SerializedName("category")
    private String category;

    @Expose
    @SerializedName("ex_decode_result")
    private String ex_decode_result;

    @Expose
    @SerializedName("ex_decode_bytes_value")
    private String ex_decode_bytes_value;

    @Expose
    @SerializedName("ex_decode_string_value")
    private String ex_decode_string_value;

    @Expose
    @SerializedName("ex_decode_length")
    private String ex_decode_length;

    @Expose
    @SerializedName("ex_decode_letter")
    private String ex_decode_letter;

    @Expose
    @SerializedName("ex_decode_modifier")
    private String ex_decode_modifier;

    @Expose
    @SerializedName("ex_decode_time")
    private String ex_decode_time;

    @Expose
    @SerializedName("ex_symbol_name")
    private String ex_symbol_name;

    @Expose
    @SerializedName("ex_symbol_id")
    private String ex_symbol_id;

    @Expose
    @SerializedName("ex_symbol_type")
    private String ex_symbol_type;

    @Expose
    @SerializedName("ex_symbol_source")
    private String ex_symbol_source;

    public String getAction()
    {
        return action;
    }

    public void setAction(String action)
    {
        this.action = action;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getEx_decode_result()
    {
        return ex_decode_result;
    }

    public void setEx_decode_result(String ex_decode_result)
    {
        this.ex_decode_result = ex_decode_result;
    }

    public String getEx_decode_bytes_value()
    {
        return ex_decode_bytes_value;
    }

    public void setEx_decode_bytes_value(String ex_decode_bytes_value)
    {
        this.ex_decode_bytes_value = ex_decode_bytes_value;
    }

    public String getEx_decode_string_value()
    {
        return ex_decode_string_value;
    }

    public void setEx_decode_string_value(String ex_decode_string_value)
    {
        this.ex_decode_string_value = ex_decode_string_value;
    }

    public String getEx_decode_length()
    {
        return ex_decode_length;
    }

    public void setEx_decode_length(String ex_decode_length)
    {
        this.ex_decode_length = ex_decode_length;
    }

    public String getEx_decode_letter()
    {
        return ex_decode_letter;
    }

    public void setEx_decode_letter(String ex_decode_letter)
    {
        this.ex_decode_letter = ex_decode_letter;
    }

    public String getEx_decode_modifier()
    {
        return ex_decode_modifier;
    }

    public void setEx_decode_modifier(String ex_decode_modifier)
    {
        this.ex_decode_modifier = ex_decode_modifier;
    }

    public String getEx_decode_time()
    {
        return ex_decode_time;
    }

    public void setEx_decode_time(String ex_decode_time)
    {
        this.ex_decode_time = ex_decode_time;
    }

    public String getEx_symbol_name()
    {
        return ex_symbol_name;
    }

    public void setEx_symbol_name(String ex_symbol_name)
    {
        this.ex_symbol_name = ex_symbol_name;
    }

    public String getEx_symbol_id()
    {
        return ex_symbol_id;
    }

    public void setEx_symbol_id(String ex_symbol_id)
    {
        this.ex_symbol_id = ex_symbol_id;
    }

    public String getEx_symbol_type()
    {
        return ex_symbol_type;
    }

    public void setEx_symbol_type(String ex_symbol_type)
    {
        this.ex_symbol_type = ex_symbol_type;
    }

    public String getEx_symbol_source()
    {
        return ex_symbol_source;
    }

    public void setEx_symbol_source(String ex_symbol_source)
    {
        this.ex_symbol_source = ex_symbol_source;
    }
}

class Wedge
{
    @Expose
    @SerializedName("transmit_barcode_id")
    private boolean transmit_barcode_id;

    @Expose
    @SerializedName("group_separator")
    private Integer group_separator;

    @Expose
    @SerializedName("prefix")
    private String prefix;

    @Expose
    @SerializedName("suffix")
    private String suffix;

    @Expose
    @SerializedName("charset")
    private String charset;


    public boolean isTransmit_barcode_id()
    {
        return transmit_barcode_id;
    }

    public void setTransmit_barcode_id(boolean transmit_barcode_id)
    {
        this.transmit_barcode_id = transmit_barcode_id;
    }

    public int getGroup_separator()
    {
        return group_separator;
    }

    public void setGroup_separator(int group_separator)
    {
        this.group_separator = group_separator;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }

    public String getSuffix()
    {
        return suffix;
    }

    public void setSuffix(String suffix)
    {
        this.suffix = suffix;
    }

    public String getCharset()
    {
        return charset;
    }

    public void setCharset(String charset)
    {
        this.charset = charset;
    }
}
