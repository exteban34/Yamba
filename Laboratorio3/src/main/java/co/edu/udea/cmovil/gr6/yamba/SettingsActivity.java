package co.edu.udea.cmovil.gr6.yamba;

import android.app.Activity;
import android.os.Bundle;
/**
 * Created by telematica on 23/04/15.
 */
public class SettingsActivity extends Activity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
// Check whether this activity was created before
            if (savedInstanceState == null) {

                // Create a fragment
                SettingsFragment fragment = new SettingsFragment(); //
                getFragmentManager()
                        .beginTransaction()
                        .add(android.R.id.content, fragment,
                                fragment.getClass().getSimpleName())
                        .commit(); //
            }
        };

}



