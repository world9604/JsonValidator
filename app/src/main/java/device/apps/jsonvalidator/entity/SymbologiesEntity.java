package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class SymbologiesEntity
{
    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("id")
    private String id;

    @Expose
    @SerializedName("valueList")
    private ArrayList<String> valueList;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public ArrayList<String> getValueList()
    {
        return valueList;
    }

    public void setValueList(ArrayList<String> valueList)
    {
        this.valueList = valueList;
    }
}
