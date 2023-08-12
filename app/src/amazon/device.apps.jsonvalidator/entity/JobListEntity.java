package device.apps.jsonvalidator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class JobListEntity {
    @Expose
    @SerializedName("JobList")
    private ArrayList<JobEntity> JobList;

    public JobListEntity(ArrayList<JobEntity> jobList) {
        JobList = jobList;
    }

    public ArrayList<JobEntity> getJobList() {
        return JobList;
    }

    public void setJobList(ArrayList<JobEntity> jobList) {
        JobList = jobList;
    }
}
