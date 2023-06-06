package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class ConfigResult {
    //Json 1개의 Object Key Name
    private String name;

    //Json 1개의 Object Validation Result
    private String result = "Success";

    //Json 1개의 Object Validation Error Message
    @Expose
    private ArrayList<String> errors;

    public ConfigResult() {
    }

    public ConfigResult(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void addError(String reason) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        result = "Fail";
        errors.add(reason);
    }

    public String getResult() {
        return result;
    }

    public boolean isSuccessful() {
        return result.equals("Success");
    }
}