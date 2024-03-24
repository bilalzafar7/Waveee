
package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import java.util.Arrays;
import java.util.ArrayList;

// @react-native-async-storage/async-storage
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
// @react-native-community/checkbox
import com.reactnativecommunity.checkbox.ReactCheckBoxPackage;
// @react-native-community/netinfo
import com.reactnativecommunity.netinfo.NetInfoPackage;
// @walletconnect/react-native-compat
import com.walletconnect.reactnativemodule.RNWalletConnectModulePackage;
// react-native-app-auth
import com.rnappauth.RNAppAuthPackage;
// react-native-camera
import org.reactnative.camera.RNCameraPackage;
// react-native-document-picker
import com.reactnativedocumentpicker.RNDocumentPickerPackage;
// react-native-fs
import com.rnfs.RNFSPackage;
// react-native-get-random-values
import org.linusu.RNGetRandomValuesPackage;
// react-native-google-signin
import co.apptailor.googlesignin.RNGoogleSigninPackage;
// react-native-image-picker
import com.imagepicker.ImagePickerPackage;
// react-native-linear-gradient
import com.BV.LinearGradient.LinearGradientPackage;
// react-native-permissions
import com.zoontek.rnpermissions.RNPermissionsPackage;
// react-native-pure-jwt
import com.zaguiini.RNPureJwt.RNPureJwtPackage;
// react-native-randombytes
import com.bitgo.randombytes.RandomBytesPackage;
// react-native-safe-area-context
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
// react-native-screens
import com.swmansion.rnscreens.RNScreensPackage;
// react-native-share
import cl.json.RNSharePackage;
// react-native-svg
import com.horcrux.svg.SvgPackage;
// react-native-touch-id
import com.rnfingerprint.FingerprintAuthPackage;
// react-native-vector-icons
import com.oblador.vectoricons.VectorIconsPackage;
// react-native-webview
import com.reactnativecommunity.webview.RNCWebViewPackage;

public class PackageList {
  private Application application;
  private ReactNativeHost reactNativeHost;
  private MainPackageConfig mConfig;

  public PackageList(ReactNativeHost reactNativeHost) {
    this(reactNativeHost, null);
  }

  public PackageList(Application application) {
    this(application, null);
  }

  public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig config) {
    this.reactNativeHost = reactNativeHost;
    mConfig = config;
  }

  public PackageList(Application application, MainPackageConfig config) {
    this.reactNativeHost = null;
    this.application = application;
    mConfig = config;
  }

  private ReactNativeHost getReactNativeHost() {
    return this.reactNativeHost;
  }

  private Resources getResources() {
    return this.getApplication().getResources();
  }

  private Application getApplication() {
    if (this.reactNativeHost == null) return this.application;
    return this.reactNativeHost.getApplication();
  }

  private Context getApplicationContext() {
    return this.getApplication().getApplicationContext();
  }

  public ArrayList<ReactPackage> getPackages() {
    return new ArrayList<>(Arrays.<ReactPackage>asList(
      new MainReactPackage(mConfig),
      new AsyncStoragePackage(),
      new ReactCheckBoxPackage(),
      new NetInfoPackage(),
      new RNWalletConnectModulePackage(),
      new RNAppAuthPackage(),
      new RNCameraPackage(),
      new RNDocumentPickerPackage(),
      new RNFSPackage(),
      new RNGetRandomValuesPackage(),
      new RNGoogleSigninPackage(),
      new ImagePickerPackage(),
      new LinearGradientPackage(),
      new RNPermissionsPackage(),
      new RNPureJwtPackage(),
      new RandomBytesPackage(),
      new SafeAreaContextPackage(),
      new RNScreensPackage(),
      new RNSharePackage(),
      new SvgPackage(),
      new FingerprintAuthPackage(),
      new VectorIconsPackage(),
      new RNCWebViewPackage()
    ));
  }
}
