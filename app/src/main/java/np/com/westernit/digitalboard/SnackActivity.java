package np.com.westernit.digitalboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.google.android.material.snackbar.Snackbar;

public class SnackActivity extends AppCompatActivity {

    RelativeLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        coordinatorLayout=findViewById(R.id.coordinatorLayout);

        Snackbar snackbar = Snackbar
                .make(coordinatorLayout, "Welcome to AndroidHive", Snackbar.LENGTH_LONG);

        snackbar.show();

    }
}