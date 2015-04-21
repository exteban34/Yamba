package co.edu.udea.cmovil.gr6.yamba;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by heinner.alvarez on 20/04/15.
 */
public class Fragment2 extends Fragment {

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        tv = (TextView) view.findViewById(R.id.textview1);
        return view;
    }
}
