package com.voximplantdemo;

import com.facebook.react.ReactActivity;
import io.wazo.callkeep.RNCallKeepModule; // Add these import lines

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "VoximplantDemo";
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
      case RNCallKeepModule.REQUEST_READ_PHONE_STATE:
        RNCallKeepModule.onRequestPermissionsResult(requestCode, permissions, grantResults);
        break;
    }
  }
}
