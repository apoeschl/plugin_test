package com.sdg.BbScanner;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.PluginResult;

public class BbScanner extends CordovaPlugin {

	public static final String ACTION_BARCODE_CALLBACK_DECODING_DATA = "kr.co.bluebird.android.bbapi.action.BARCODE_CALLBACK_DECODING_DATA";
	
	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		
		IntentFilter filter = new IntentFilter();
		filter.addAction(ACTION_BARCODE_CALLBACK_DECODING_DATA);
		
		registerReceiver(mReceiver, filter);
		
	}
	
	private BroadcastReceiver mReceiver = new BroadcastReceiver() {
	
		@Override
		public void onReceive(Context context, Intent intent) {
		
			String action = intent.getAction();
			
			if(action.equals(ACTION_BARCODE_CALLBACK_DECODING_DATA)	{
				AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
				alertDialog.setTitle("Hello World");
				alertDialog.show();
			}
		}
	
	}
	
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        	
			
		
    }
}
