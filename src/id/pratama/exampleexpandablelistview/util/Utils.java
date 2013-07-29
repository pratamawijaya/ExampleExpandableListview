/*
 * Pratama Nur Wijaya (c) 2013 
 * 
 * Project       : ExampleExpandableListview
 * Filename      : Utils.java
 * Creation Date : Jul 29, 2013 time : 9:28:22 PM
 *
 */

package id.pratama.exampleexpandablelistview.util;

import android.util.Log;
import id.pratama.exampleexpandablelistview.BuildConfig;

public class Utils
{
	/**
	 * Method untuk debugging apps
	 * 
	 * @param TAG
	 *            TAG Class
	 * @param message
	 *            pesan
	 */
	public static void TRACE(String TAG, String message)
	{
		if (BuildConfig.DEBUG)
			Log.d(TAG, message);
	}

}
