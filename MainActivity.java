package in.jewelbooks.pos;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
  private WebView view;
  @Override public void onCreate(Bundle b) { super.onCreate(b); view=new WebView(this); setContentView(view); view.setWebViewClient(new WebViewClient()); WebSettings s=view.getSettings(); s.setJavaScriptEnabled(true); s.setAllowFileAccess(true); s.setDomStorageEnabled(false); view.loadUrl("file:///android_asset/pos.html"); }
  @Override public void onBackPressed(){if(view.canGoBack())view.goBack();else super.onBackPressed();}
}
