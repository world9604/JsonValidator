package device.apps.jsonvalidator.entity.eminstall;

public class RingControlEntity
{
    private int revision;
    private RingcontrolValue ringcontrol;
    private SystemValue system;
    private BluetoothValue bluetooth;
    private NotificationValue notification;
    private RCSymbologiesVale symbologies;

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public RingcontrolValue getRingcontrol() {
        return ringcontrol;
    }

    public void setRingcontrol(RingcontrolValue ringcontrol) {
        this.ringcontrol = ringcontrol;
    }

    public SystemValue getSystem() {
        return system;
    }

    public void setSystem(SystemValue system) {
        this.system = system;
    }

    public BluetoothValue getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(BluetoothValue bluetooth) {
        this.bluetooth = bluetooth;
    }

    public NotificationValue getNotification() {
        return notification;
    }

    public void setNotification(NotificationValue notification) {
        this.notification = notification;
    }

    public RCSymbologiesVale getSymbologies() {
        return symbologies;
    }

    public void setSymbologies(RCSymbologiesVale symbologies) {
        this.symbologies = symbologies;
    }
}

class RingcontrolValue
{
    private String admin_password;
    private int rfu_autoupdate;
    private String rfu_path;
    private int ringscanner_json_autoupdate;
    private String ringscanner_json_path;
    private int result_type;
    private String intent_action;
    private String intent_category;
    private String intent_extra_decode_value;
    private String intent_extra_decode_byte_value;
    private String intent_extra_event_source;
    private String result_charset;
    private int disconnection_timeout;

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public int getRfu_autoupdate() {
        return rfu_autoupdate;
    }

    public void setRfu_autoupdate(int rfu_autoupdate) {
        this.rfu_autoupdate = rfu_autoupdate;
    }

    public String getRfu_path() {
        return rfu_path;
    }

    public void setRfu_path(String rfu_path) {
        this.rfu_path = rfu_path;
    }

    public int getRingscanner_json_autoupdate() {
        return ringscanner_json_autoupdate;
    }

    public void setRingscanner_json_autoupdate(int ringscanner_json_autoupdate) {
        this.ringscanner_json_autoupdate = ringscanner_json_autoupdate;
    }

    public String getRingscanner_json_path() {
        return ringscanner_json_path;
    }

    public void setRingscanner_json_path(String ringscanner_json_path) {
        this.ringscanner_json_path = ringscanner_json_path;
    }

    public int getResult_type() {
        return result_type;
    }

    public void setResult_type(int result_type) {
        this.result_type = result_type;
    }

    public String getIntent_action() {
        return intent_action;
    }

    public void setIntent_action(String intent_action) {
        this.intent_action = intent_action;
    }

    public String getIntent_category() {
        return intent_category;
    }

    public void setIntent_category(String intent_category) {
        this.intent_category = intent_category;
    }

    public String getIntent_extra_decode_value() {
        return intent_extra_decode_value;
    }

    public void setIntent_extra_decode_value(String intent_extra_decode_value) {
        this.intent_extra_decode_value = intent_extra_decode_value;
    }

    public String getIntent_extra_decode_byte_value() {
        return intent_extra_decode_byte_value;
    }

    public void setIntent_extra_decode_byte_value(String intent_extra_decode_byte_value) {
        this.intent_extra_decode_byte_value = intent_extra_decode_byte_value;
    }

    public String getIntent_extra_event_source() {
        return intent_extra_event_source;
    }

    public void setIntent_extra_event_source(String intent_extra_event_source) {
        this.intent_extra_event_source = intent_extra_event_source;
    }

    public String getResult_charset() {
        return result_charset;
    }

    public void setResult_charset(String result_charset) {
        this.result_charset = result_charset;
    }

    public int getDisconnection_timeout() {
        return disconnection_timeout;
    }

    public void setDisconnection_timeout(int disconnection_timeout) {
        this.disconnection_timeout = disconnection_timeout;
    }
}

class SystemValue
{
    private int trigger_timeout;
    private int sleep_timeout;
    private int transmit_barcode_id;
    private String prefix;
    private String suffix;
    private int terminator;
    private int center_window;
    private int center_window_tolerance;
    private int inverse_barcode;
    private int hid_inter_char_delay;
    private int deep_sleep_mode;
    private int connect_alert;
    private int trigger_mode;
    private int poor_qual_1d;
    private int poor_qual_pdf;
    private int reading_tolerance;
    private int aimer;
    private int illumination;
    private int delay_before_decoding;
    private int lock_special_barcode;

    public int getTrigger_timeout() {
        return trigger_timeout;
    }

    public void setTrigger_timeout(int trigger_timeout) {
        this.trigger_timeout = trigger_timeout;
    }

    public int getSleep_timeout() {
        return sleep_timeout;
    }

    public void setSleep_timeout(int sleep_timeout) {
        this.sleep_timeout = sleep_timeout;
    }

    public int getTransmit_barcode_id() {
        return transmit_barcode_id;
    }

    public void setTransmit_barcode_id(int transmit_barcode_id) {
        this.transmit_barcode_id = transmit_barcode_id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getTerminator() {
        return terminator;
    }

    public void setTerminator(int terminator) {
        this.terminator = terminator;
    }

    public int getCenter_window() {
        return center_window;
    }

    public void setCenter_window(int center_window) {
        this.center_window = center_window;
    }

    public int getCenter_window_tolerance() {
        return center_window_tolerance;
    }

    public void setCenter_window_tolerance(int center_window_tolerance) {
        this.center_window_tolerance = center_window_tolerance;
    }

    public int getInverse_barcode() {
        return inverse_barcode;
    }

    public void setInverse_barcode(int inverse_barcode) {
        this.inverse_barcode = inverse_barcode;
    }

    public int getHid_inter_char_delay() {
        return hid_inter_char_delay;
    }

    public void setHid_inter_char_delay(int hid_inter_char_delay) {
        this.hid_inter_char_delay = hid_inter_char_delay;
    }

    public int getDeep_sleep_mode() {
        return deep_sleep_mode;
    }

    public void setDeep_sleep_mode(int deep_sleep_mode) {
        this.deep_sleep_mode = deep_sleep_mode;
    }

    public int getConnect_alert() {
        return connect_alert;
    }

    public void setConnect_alert(int connect_alert) {
        this.connect_alert = connect_alert;
    }

    public int getTrigger_mode() {
        return trigger_mode;
    }

    public void setTrigger_mode(int trigger_mode) {
        this.trigger_mode = trigger_mode;
    }

    public int getPoor_qual_1d() {
        return poor_qual_1d;
    }

    public void setPoor_qual_1d(int poor_qual_1d) {
        this.poor_qual_1d = poor_qual_1d;
    }

    public int getPoor_qual_pdf() {
        return poor_qual_pdf;
    }

    public void setPoor_qual_pdf(int poor_qual_pdf) {
        this.poor_qual_pdf = poor_qual_pdf;
    }

    public int getReading_tolerance() {
        return reading_tolerance;
    }

    public void setReading_tolerance(int reading_tolerance) {
        this.reading_tolerance = reading_tolerance;
    }

    public int getAimer() {
        return aimer;
    }

    public void setAimer(int aimer) {
        this.aimer = aimer;
    }

    public int getIllumination() {
        return illumination;
    }

    public void setIllumination(int illumination) {
        this.illumination = illumination;
    }

    public int getDelay_before_decoding() {
        return delay_before_decoding;
    }

    public void setDelay_before_decoding(int delay_before_decoding) {
        this.delay_before_decoding = delay_before_decoding;
    }

    public int getLock_special_barcode() {
        return lock_special_barcode;
    }

    public void setLock_special_barcode(int lock_special_barcode) {
        this.lock_special_barcode = lock_special_barcode;
    }
}

class BluetoothValue
{
    private int bt_class;
}

class NotificationValue
{
    private int beeper_enable;
    private int beeper_volume;
    private int power_up_beeps;
    private int scan_success_beeps;
    private int scan_fail_beeps;
    private int led_enable;
    private int led_success;
    private int led_fail;

    public int getBeeper_enable() {
        return beeper_enable;
    }

    public void setBeeper_enable(int beeper_enable) {
        this.beeper_enable = beeper_enable;
    }

    public int getBeeper_volume() {
        return beeper_volume;
    }

    public void setBeeper_volume(int beeper_volume) {
        this.beeper_volume = beeper_volume;
    }

    public int getPower_up_beeps() {
        return power_up_beeps;
    }

    public void setPower_up_beeps(int power_up_beeps) {
        this.power_up_beeps = power_up_beeps;
    }

    public int getScan_success_beeps() {
        return scan_success_beeps;
    }

    public void setScan_success_beeps(int scan_success_beeps) {
        this.scan_success_beeps = scan_success_beeps;
    }

    public int getScan_fail_beeps() {
        return scan_fail_beeps;
    }

    public void setScan_fail_beeps(int scan_fail_beeps) {
        this.scan_fail_beeps = scan_fail_beeps;
    }

    public int getLed_enable() {
        return led_enable;
    }

    public void setLed_enable(int led_enable) {
        this.led_enable = led_enable;
    }

    public int getLed_success() {
        return led_success;
    }

    public void setLed_success(int led_success) {
        this.led_success = led_success;
    }

    public int getLed_fail() {
        return led_fail;
    }

    public void setLed_fail(int led_fail) {
        this.led_fail = led_fail;
    }
}

class RCSymbologiesVale
{
    private SymbologyValue code39;
    private SymbologyValue ean8;
    private SymbologyValue ean13;
    private SymbologyValue gs1_128;
    private SymbologyValue gs1_databar_omnidir;
    private SymbologyValue gs1_databar_limited;
    private SymbologyValue gs1_databar_expanded;
    private SymbologyValue interleaved2of5;
    private SymbologyValue upc_a;
    private SymbologyValue upc_e;
    private SymbologyValue code93;
    private SymbologyValue aztec;
    private SymbologyValue datamatrix;
    private SymbologyValue codabar;
    private SymbologyValue qr;
    private SymbologyValue code11;
    private SymbologyValue code128;
    private SymbologyValue composite;
    private SymbologyValue maxicode;
    private SymbologyValue micro_pdf417;
    private SymbologyValue pdf417;
    private SymbologyValue straight2of5_iata;
    private SymbologyValue codablock_a;
    private SymbologyValue codablock_f;
    private SymbologyValue msi;
    private SymbologyValue tlc39;
    private SymbologyValue trioptic;
    private SymbologyValue matrix2of5;
    private SymbologyValue telepen;
    private SymbologyValue isbt;
    private SymbologyValue straight2of5_industrial;
    private SymbologyValue coupon_code;
    private SymbologyValue hanxin;
    private SymbologyValue dotcode;
    private SymbologyValue digimarc;
    private SymbologyValue china_post;
    private SymbologyValue korea_post;
    private SymbologyValue two_d_postal;

    public SymbologyValue getCode39() {
        return code39;
    }

    public void setCode39(SymbologyValue code39) {
        this.code39 = code39;
    }

    public SymbologyValue getEan8() {
        return ean8;
    }

    public void setEan8(SymbologyValue ean8) {
        this.ean8 = ean8;
    }

    public SymbologyValue getEan13() {
        return ean13;
    }

    public void setEan13(SymbologyValue ean13) {
        this.ean13 = ean13;
    }

    public SymbologyValue getGs1_128() {
        return gs1_128;
    }

    public void setGs1_128(SymbologyValue gs1_128) {
        this.gs1_128 = gs1_128;
    }

    public SymbologyValue getGs1_databar_omnidir() {
        return gs1_databar_omnidir;
    }

    public void setGs1_databar_omnidir(SymbologyValue gs1_databar_omnidir) {
        this.gs1_databar_omnidir = gs1_databar_omnidir;
    }

    public SymbologyValue getGs1_databar_limited() {
        return gs1_databar_limited;
    }

    public void setGs1_databar_limited(SymbologyValue gs1_databar_limited) {
        this.gs1_databar_limited = gs1_databar_limited;
    }

    public SymbologyValue getGs1_databar_expanded() {
        return gs1_databar_expanded;
    }

    public void setGs1_databar_expanded(SymbologyValue gs1_databar_expanded) {
        this.gs1_databar_expanded = gs1_databar_expanded;
    }

    public SymbologyValue getInterleaved2of5() {
        return interleaved2of5;
    }

    public void setInterleaved2of5(SymbologyValue interleaved2of5) {
        this.interleaved2of5 = interleaved2of5;
    }

    public SymbologyValue getUpc_a() {
        return upc_a;
    }

    public void setUpc_a(SymbologyValue upc_a) {
        this.upc_a = upc_a;
    }

    public SymbologyValue getUpc_e() {
        return upc_e;
    }

    public void setUpc_e(SymbologyValue upc_e) {
        this.upc_e = upc_e;
    }

    public SymbologyValue getCode93() {
        return code93;
    }

    public void setCode93(SymbologyValue code93) {
        this.code93 = code93;
    }

    public SymbologyValue getAztec() {
        return aztec;
    }

    public void setAztec(SymbologyValue aztec) {
        this.aztec = aztec;
    }

    public SymbologyValue getDatamatrix() {
        return datamatrix;
    }

    public void setDatamatrix(SymbologyValue datamatrix) {
        this.datamatrix = datamatrix;
    }

    public SymbologyValue getCodabar() {
        return codabar;
    }

    public void setCodabar(SymbologyValue codabar) {
        this.codabar = codabar;
    }

    public SymbologyValue getQr() {
        return qr;
    }

    public void setQr(SymbologyValue qr) {
        this.qr = qr;
    }

    public SymbologyValue getCode11() {
        return code11;
    }

    public void setCode11(SymbologyValue code11) {
        this.code11 = code11;
    }

    public SymbologyValue getCode128() {
        return code128;
    }

    public void setCode128(SymbologyValue code128) {
        this.code128 = code128;
    }

    public SymbologyValue getComposite() {
        return composite;
    }

    public void setComposite(SymbologyValue composite) {
        this.composite = composite;
    }

    public SymbologyValue getMaxicode() {
        return maxicode;
    }

    public void setMaxicode(SymbologyValue maxicode) {
        this.maxicode = maxicode;
    }

    public SymbologyValue getMicro_pdf417() {
        return micro_pdf417;
    }

    public void setMicro_pdf417(SymbologyValue micro_pdf417) {
        this.micro_pdf417 = micro_pdf417;
    }

    public SymbologyValue getPdf417() {
        return pdf417;
    }

    public void setPdf417(SymbologyValue pdf417) {
        this.pdf417 = pdf417;
    }

    public SymbologyValue getStraight2of5_iata() {
        return straight2of5_iata;
    }

    public void setStraight2of5_iata(SymbologyValue straight2of5_iata) {
        this.straight2of5_iata = straight2of5_iata;
    }

    public SymbologyValue getCodablock_a() {
        return codablock_a;
    }

    public void setCodablock_a(SymbologyValue codablock_a) {
        this.codablock_a = codablock_a;
    }

    public SymbologyValue getCodablock_f() {
        return codablock_f;
    }

    public void setCodablock_f(SymbologyValue codablock_f) {
        this.codablock_f = codablock_f;
    }

    public SymbologyValue getMsi() {
        return msi;
    }

    public void setMsi(SymbologyValue msi) {
        this.msi = msi;
    }

    public SymbologyValue getTlc39() {
        return tlc39;
    }

    public void setTlc39(SymbologyValue tlc39) {
        this.tlc39 = tlc39;
    }

    public SymbologyValue getTrioptic() {
        return trioptic;
    }

    public void setTrioptic(SymbologyValue trioptic) {
        this.trioptic = trioptic;
    }

    public SymbologyValue getMatrix2of5() {
        return matrix2of5;
    }

    public void setMatrix2of5(SymbologyValue matrix2of5) {
        this.matrix2of5 = matrix2of5;
    }

    public SymbologyValue getTelepen() {
        return telepen;
    }

    public void setTelepen(SymbologyValue telepen) {
        this.telepen = telepen;
    }

    public SymbologyValue getIsbt() {
        return isbt;
    }

    public void setIsbt(SymbologyValue isbt) {
        this.isbt = isbt;
    }

    public SymbologyValue getStraight2of5_industrial() {
        return straight2of5_industrial;
    }

    public void setStraight2of5_industrial(SymbologyValue straight2of5_industrial) {
        this.straight2of5_industrial = straight2of5_industrial;
    }

    public SymbologyValue getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(SymbologyValue coupon_code) {
        this.coupon_code = coupon_code;
    }

    public SymbologyValue getHanxin() {
        return hanxin;
    }

    public void setHanxin(SymbologyValue hanxin) {
        this.hanxin = hanxin;
    }

    public SymbologyValue getDotcode() {
        return dotcode;
    }

    public void setDotcode(SymbologyValue dotcode) {
        this.dotcode = dotcode;
    }

    public SymbologyValue getDigimarc() {
        return digimarc;
    }

    public void setDigimarc(SymbologyValue digimarc) {
        this.digimarc = digimarc;
    }

    public SymbologyValue getChina_post() {
        return china_post;
    }

    public void setChina_post(SymbologyValue china_post) {
        this.china_post = china_post;
    }

    public SymbologyValue getKorea_post() {
        return korea_post;
    }

    public void setKorea_post(SymbologyValue korea_post) {
        this.korea_post = korea_post;
    }

    public SymbologyValue getTwo_d_postal() {
        return two_d_postal;
    }

    public void setTwo_d_postal(SymbologyValue two_d_postal) {
        this.two_d_postal = two_d_postal;
    }
}

class SymbologyValue
{
    private int enable;
    private String id;
    private int min;
    private int max;
    private Integer redundancy;
    private Integer send_start_stop_char ;
    private Integer send_check_char ;
    private Integer full_ascii ;
    private Integer append ;
    private Integer code32 ;
    private Integer inter_char_gaps ;
    private Integer addenda_required ;
    private Integer send_addenda_separator ;
    private Integer two_digit_addenda ;
    private Integer five_digit_addenda ;
    private Integer isbn_translate ;
    private Integer send_system_char ;
    private Integer convert_to_ean13 ;
    private Integer expand ;
    private Integer leading_zero ;
    private Integer upc_e1_enable ;
    private Integer low_contrast ;
    private Integer concatenation ;
    private Integer no_quiet ;
    private Integer check_char_required ;
    private Integer upc_ean ;
    private Integer message_format ;
    private Integer macro_pdf417 ;
    private Integer output ;
    private Integer gs1_databar_output ;
    private Integer poor_qual ;
    private Integer two_d_postal_code ;
    private Integer australian_post_interpretation ;
    private Integer send_planet_code_check_char ;
    private Integer send_postnet_check_char ;

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Integer getRedundancy() {
        return redundancy;
    }

    public void setRedundancy(Integer redundancy) {
        this.redundancy = redundancy;
    }

    public Integer getSend_start_stop_char() {
        return send_start_stop_char;
    }

    public void setSend_start_stop_char(Integer send_start_stop_char) {
        this.send_start_stop_char = send_start_stop_char;
    }

    public Integer getSend_check_char() {
        return send_check_char;
    }

    public void setSend_check_char(Integer send_check_char) {
        this.send_check_char = send_check_char;
    }

    public Integer getFull_ascii() {
        return full_ascii;
    }

    public void setFull_ascii(Integer full_ascii) {
        this.full_ascii = full_ascii;
    }

    public Integer getAppend() {
        return append;
    }

    public void setAppend(Integer append) {
        this.append = append;
    }

    public Integer getCode32() {
        return code32;
    }

    public void setCode32(Integer code32) {
        this.code32 = code32;
    }

    public Integer getInter_char_gaps() {
        return inter_char_gaps;
    }

    public void setInter_char_gaps(Integer inter_char_gaps) {
        this.inter_char_gaps = inter_char_gaps;
    }

    public Integer getAddenda_required() {
        return addenda_required;
    }

    public void setAddenda_required(Integer addenda_required) {
        this.addenda_required = addenda_required;
    }

    public Integer getSend_addenda_separator() {
        return send_addenda_separator;
    }

    public void setSend_addenda_separator(Integer send_addenda_separator) {
        this.send_addenda_separator = send_addenda_separator;
    }

    public Integer getTwo_digit_addenda() {
        return two_digit_addenda;
    }

    public void setTwo_digit_addenda(Integer two_digit_addenda) {
        this.two_digit_addenda = two_digit_addenda;
    }

    public Integer getFive_digit_addenda() {
        return five_digit_addenda;
    }

    public void setFive_digit_addenda(Integer five_digit_addenda) {
        this.five_digit_addenda = five_digit_addenda;
    }

    public Integer getIsbn_translate() {
        return isbn_translate;
    }

    public void setIsbn_translate(Integer isbn_translate) {
        this.isbn_translate = isbn_translate;
    }

    public Integer getSend_system_char() {
        return send_system_char;
    }

    public void setSend_system_char(Integer send_system_char) {
        this.send_system_char = send_system_char;
    }

    public Integer getConvert_to_ean13() {
        return convert_to_ean13;
    }

    public void setConvert_to_ean13(Integer convert_to_ean13) {
        this.convert_to_ean13 = convert_to_ean13;
    }

    public Integer getExpand() {
        return expand;
    }

    public void setExpand(Integer expand) {
        this.expand = expand;
    }

    public Integer getLeading_zero() {
        return leading_zero;
    }

    public void setLeading_zero(Integer leading_zero) {
        this.leading_zero = leading_zero;
    }

    public Integer getUpc_e1_enable() {
        return upc_e1_enable;
    }

    public void setUpc_e1_enable(Integer upc_e1_enable) {
        this.upc_e1_enable = upc_e1_enable;
    }

    public Integer getLow_contrast() {
        return low_contrast;
    }

    public void setLow_contrast(Integer low_contrast) {
        this.low_contrast = low_contrast;
    }

    public Integer getConcatenation() {
        return concatenation;
    }

    public void setConcatenation(Integer concatenation) {
        this.concatenation = concatenation;
    }

    public Integer getNo_quiet() {
        return no_quiet;
    }

    public void setNo_quiet(Integer no_quiet) {
        this.no_quiet = no_quiet;
    }

    public Integer getCheck_char_required() {
        return check_char_required;
    }

    public void setCheck_char_required(Integer check_char_required) {
        this.check_char_required = check_char_required;
    }

    public Integer getUpc_ean() {
        return upc_ean;
    }

    public void setUpc_ean(Integer upc_ean) {
        this.upc_ean = upc_ean;
    }

    public Integer getMessage_format() {
        return message_format;
    }

    public void setMessage_format(Integer message_format) {
        this.message_format = message_format;
    }

    public Integer getMacro_pdf417() {
        return macro_pdf417;
    }

    public void setMacro_pdf417(Integer macro_pdf417) {
        this.macro_pdf417 = macro_pdf417;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }

    public Integer getGs1_databar_output() {
        return gs1_databar_output;
    }

    public void setGs1_databar_output(Integer gs1_databar_output) {
        this.gs1_databar_output = gs1_databar_output;
    }

    public Integer getPoor_qual() {
        return poor_qual;
    }

    public void setPoor_qual(Integer poor_qual) {
        this.poor_qual = poor_qual;
    }

    public Integer getTwo_d_postal_code() {
        return two_d_postal_code;
    }

    public void setTwo_d_postal_code(Integer two_d_postal_code) {
        this.two_d_postal_code = two_d_postal_code;
    }

    public Integer getAustralian_post_interpretation() {
        return australian_post_interpretation;
    }

    public void setAustralian_post_interpretation(Integer australian_post_interpretation) {
        this.australian_post_interpretation = australian_post_interpretation;
    }

    public Integer getSend_planet_code_check_char() {
        return send_planet_code_check_char;
    }

    public void setSend_planet_code_check_char(Integer send_planet_code_check_char) {
        this.send_planet_code_check_char = send_planet_code_check_char;
    }

    public Integer getSend_postnet_check_char() {
        return send_postnet_check_char;
    }

    public void setSend_postnet_check_char(Integer send_postnet_check_char) {
        this.send_postnet_check_char = send_postnet_check_char;
    }
}
