package co.edu.udea.cmovil.gr6.yamba;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.os.AsyncTask;

import com.marakana.android.yamba.clientlib.YambaClient;
import com.marakana.android.yamba.clientlib.YambaClientException;


public class StatusActivity extends Activity{

    private EditText editstatus;
    private Button buttonTweet;
    private static final String TAG = "StatusActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_status);
        // Check if this activity was created before
        if (savedInstanceState == null) { //
            // Create a fragment
            StatusFragment fragment = new StatusFragment(); //
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment,
                            fragment.getClass().getSimpleName())
                    .commit(); //
            Fragment2 fragment2 = new Fragment2();
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment2,
                            fragment2.getClass().getSimpleName())
                    .commit(); //
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_status, menu);
        return true;
    }


}