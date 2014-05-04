package think.novelty.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.graphics.drawable.Drawable;
import android.util.Log;

public class ImageLoader {
	private final String TAG = "IMAGE_LOADER";
	private final Map<String, Drawable> drawableMap;

	public ImageLoader() {
		drawableMap = new HashMap<String, Drawable>();
	}
	
	public Drawable fetchDrawable(String urlString) {
		if(drawableMap.containsKey(urlString)) {
			return drawableMap.get(urlString);
		}
		
		Log.d(TAG, "Image url: " + urlString);
		
		try {
			InputStream is = fetch(urlString);
			Drawable drawable = Drawable.createFromStream(is,  "src");
			
			if(drawable != null) {
				drawableMap.put(urlString,  drawable);
				Log.d(TAG, "Got a thumbnail drawable");
			}
			else {
				Log.w(TAG, "Could not get thumbnail.");
			}
			
			return drawable;
		}
		catch(MalformedURLException e) {
			Log.e(TAG, "fetchDrawable failed.", e);
			return null;
		}
		catch(IOException e) {
			Log.e(TAG, "fetchDrawable failed.", e);
			return null;
		}
	}
	
	private InputStream fetch(String urlString) throws MalformedURLException, IOException {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet request = new HttpGet(urlString);
		HttpResponse response = httpClient.execute(request);
		
		return response.getEntity().getContent();
	}
}
