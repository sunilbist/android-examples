package np.com.westernit.digitalboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoLogin(View v){
       // Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_LONG).show();
        Intent login = new Intent(this,LoginActivity.class);
      //  login.putExtra("a","abv");
        startActivity(new Intent(login));
        finish();
    }
}