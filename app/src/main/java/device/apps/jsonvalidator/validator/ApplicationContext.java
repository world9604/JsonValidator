package device.apps.jsonvalidator.validator;

import android.app.Application;

public class ApplicationContext extends Application {
    private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static Application getApplication() {
        return application;
    }
}