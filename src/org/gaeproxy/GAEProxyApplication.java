package org.gaeproxy;

import android.app.Application;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GAEProxyApplication extends Application {

  public ExecutorService UpdatePool = Executors.newSingleThreadExecutor();

}
