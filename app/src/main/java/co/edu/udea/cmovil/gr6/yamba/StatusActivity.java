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


public class StatusActivity extends Activity implements View.OnClickListener {

    private EditText editstatus;
    private Button buttonTweet;
    private static final String TAG = "StatusActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        editstatus = (EditText) findViewById(R.id.editStatus);
        buttonTweet = (Button) findViewById(R.id.buttonTweet);
        buttonTweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status = editstatus.getText().toString();
                Log.d(TAG, "onClicked el boton with status: " + status);
                new PostTask().execute(status);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_status, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        String status = editstatus.getText().toString();
        Log.d(TAG, "onClicked with status: " + status);
    }

    private final class PostTask extends
            AsyncTask<String, Void, String> { //

        @Override
        protected String doInBackground(String... params) { //
            YambaClient yambaCloud =
                    new YambaClient("student", "password");
            try {
                yambaCloud.postStatus(params[0]); //
                return "Successfully posted";
            } catch (YambaClientException e) {
                e.printStackTrace();
                return "Failed to post to yamba service";
            }
        }


    }
}