package device.apps.jsonvalidator;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import java.io.File;
import java.io.FileWriter;

import device.apps.jsonvalidator.entity.Scan2StageEntity;
import device.apps.jsonvalidator.validator.ProfileValidator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test2();
    }

    private void test2() {
        HandlerThread t = new HandlerThread("Validation Thread");
        t.start();
        new Handler(t.getLooper()).post(() -> {
            try {
                //validate container node
                File json = new File("/storage/emulated/0/1.json");
                ProfileValidator validator = ProfileValidator.getInstance();
                validator.setIsLogging(true);
                validator.validateContainerNode(json, Scan2StageEntity.class);

                //validate value node
                //validator.validateValueNode(json, Scan2StageEntity.class);

                //create constraints
                //validator.findConstraints(Scan2StageEntity.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void writeAsFile(String fileName, String data) {
        String jsonPath = "/storage/emulated/0/" + fileName;
        FileWriter fWriter;
        File file = new File(jsonPath + "_data.json");
        try {
            fWriter = new FileWriter(file);
            fWriter.write(data);
            fWriter.flush();
            fWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}