package at.tomtasche.joppfm;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class AuthPreferences {

	private static final String KEY_USER = "user";
	private static final String KEY_PASSWORD = "password";

	private SharedPreferences preferences;

	public AuthPreferences(Context context) {
		preferences = context
				.getSharedPreferences("auth", Context.MODE_PRIVATE);
	}

	public void setUser(String user) {
		Editor editor = preferences.edit();
		editor.putString(KEY_USER, user);
		editor.commit();
	}

	public void setPassword(String password) {
		Editor editor = preferences.edit();
		editor.putString(KEY_PASSWORD, password);
		editor.commit();
	}

	public String getUser() {
		return preferences.getString(KEY_USER, null);
	}

	public String getPassword() {
		return preferences.getString(KEY_PASSWORD, null);
	}
}
