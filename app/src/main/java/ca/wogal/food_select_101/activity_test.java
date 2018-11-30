package ca.wogal.food_select_101;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_test extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_test );
    }

    @Override
    protected void onStart () {
        super.onStart();
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            //    String uriString;
            case R.id.test_button: {
                //    uriString = " 519-491-6947";
                //   Intent intent =  onNewIntent( Internet.ACTION_DAIL );
                //   intent.setData( Uri.parse(uriString));


            }
        }

    }

    private class STREA {
    }
}

