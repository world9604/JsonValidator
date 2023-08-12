package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class JobEntity implements Comparable<JobEntity> {
    @Expose
    @SerializedName("sequenceNum")
    private int sequenceNum = -1;

    @Expose
    @SerializedName("jobType")
    private String jobType;

    @Expose
    @SerializedName("downloadUrl")
    private String downloadUrl;

    @Expose
    @SerializedName("fileName")
    private String fileName;

    @Expose
    @SerializedName("filePath")
    private String filePath;

    @Expose
    @SerializedName("actionName")
    private String actionName;

    @Expose
    @SerializedName("actionType")
    private String actionType;

    @Expose
    @SerializedName("category")
    private ArrayList<String> category;

    @Expose
    @SerializedName("flags")
    private ArrayList<String> flags;

    @Expose
    @SerializedName("packageName")
    private String packageName;

    @Expose
    @SerializedName("className")
    private String className;

    @Expose
    @SerializedName("delayTime")
    private String delayTime;

    @Expose
    @SerializedName("extraStr")
    private ArrayList<String> extraStr;

    @Expose
    @SerializedName("extraInt")
    private ArrayList<String> extraInt;

    @Expose
    @SerializedName("extraBoolean")
    private ArrayList<String> extraBoolean;

    @Expose
    @SerializedName("extraLong")
    private ArrayList<String> extraLong;

    @Expose
    @SerializedName("extraFloat")
    private ArrayList<String> extraFloat;

    @Expose
    @SerializedName("extraStrArr")
    private ArrayList<String> extraStrArr;

    @Expose
    @SerializedName("extraIntArr")
    private ArrayList<String> extraIntArr;

    @Expose
    @SerializedName("extraBooleanArr")
    private ArrayList<String> extraBooleanArr;

    @Expose
    @SerializedName("extraLongArr")
    private ArrayList<String> extraLongArr;

    @Expose
    @SerializedName("extraFloatArr")
    private ArrayList<String> extraFloatArr;


    public int getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<String> getExtraStr() {
        return extraStr;
    }

    public void setExtraStr(ArrayList<String> extraStr) {
        this.extraStr = extraStr;
    }


    public ArrayList<String> getExtraInt() {
        return extraInt;
    }

    public void setExtraInt(ArrayList<String> extraInt) {
        this.extraInt = extraInt;
    }

    public ArrayList<String> getExtraBoolean() {
        return extraBoolean;
    }

    public void setExtraBoolean(ArrayList<String> extraBoolean) {
        this.extraBoolean = extraBoolean;
    }

    public ArrayList<String> getExtraLong() {
        return extraLong;
    }

    public void setExtraLong(ArrayList<String> extraLong) {
        this.extraLong = extraLong;
    }

    public ArrayList<String> getExtraFloat() {
        return extraFloat;
    }

    public void setExtraFloat(ArrayList<String> extraFloat) {
        this.extraFloat = extraFloat;
    }

    public ArrayList<String> getExtraStrArr() {
        return extraStrArr;
    }

    public void setExtraStrArr(ArrayList<String> extraStrArr) {
        this.extraStrArr = extraStrArr;
    }

    public ArrayList<String> getExtraIntArr() {
        return extraIntArr;
    }

    public void setExtraIntArr(ArrayList<String> extraIntArr) {
        this.extraIntArr = extraIntArr;
    }

    public ArrayList<String> getExtraBooleanArr() {
        return extraBooleanArr;
    }

    public void setExtraBooleanArr(ArrayList<String> extraBooleanArr) {
        this.extraBooleanArr = extraBooleanArr;
    }

    public ArrayList<String> getExtraLongArr() {
        return extraLongArr;
    }

    public void setExtraLongArr(ArrayList<String> extraLongArr) {
        this.extraLongArr = extraLongArr;
    }

    public ArrayList<String> getExtraFloatArr() {
        return extraFloatArr;
    }

    public void setExtraFloatArr(ArrayList<String> extraFloatArr) {
        this.extraFloatArr = extraFloatArr;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }

    public ArrayList<String> getFlags() {
        return flags;
    }

    public void setFlags(ArrayList<String> flags) {
        this.flags = flags;
    }

    public String getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(String delayTime) {
        this.delayTime = delayTime;
    }

    @Override
    public int compareTo(JobEntity jobEntity) {
        // Ascending
        if (this.sequenceNum > jobEntity.getSequenceNum()) {
            return 1;
        } else if (this.sequenceNum < jobEntity.getSequenceNum()) {
            return -1;
        }
        return 0;
    }
}
