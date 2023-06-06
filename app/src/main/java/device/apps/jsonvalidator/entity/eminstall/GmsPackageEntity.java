package device.apps.jsonvalidator.entity.eminstall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GmsPackageEntity {
    @Expose
    @SerializedName("google_play_update")
    private String google_play_update;

    @Expose
    @SerializedName("gmspackage_info")
    private ArrayList<JobEntity> gmspackage_info;

    public String getGoogle_play_update() {
        return google_play_update;
    }

    public void setGoogle_play_update(String google_play_update) {
        this.google_play_update = google_play_update;
    }

    public ArrayList<JobEntity> getGmspackage_info() {
        return gmspackage_info;
    }

    public void setGmspackage_info(ArrayList<JobEntity> gmspackage_info) {
        this.gmspackage_info = gmspackage_info;
    }
}
