package co.edu.udea.cmovil.gr6.yamba;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/**
 * Created by telematica on 23/04/15.
 */
public class SettingsFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener { //
        private SharedPreferences prefs;
        @Override
        public void onCreate(Bundle savedInstanceState) { //
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences); //
        }
        @Override
        public void onStart() {
            super.onStart();
            prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
            prefs.registerOnSharedPreferenceChangeListener(this);
        }


    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

    }
}
