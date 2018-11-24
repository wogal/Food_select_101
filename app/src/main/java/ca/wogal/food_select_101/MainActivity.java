package ca.wogal.food_select_101;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public int earle = 6634;
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary( "native-lib" );
    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        earle = 334;

        // Example of a call to a native method
     //   TextView tv = (TextView) findViewById( R.id.sample_text );
      //  tv.setText( stringFromJNI() );
        Toast.makeText( this, " wogal ", Toast.LENGTH_SHORT ).show();

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI ();
}
