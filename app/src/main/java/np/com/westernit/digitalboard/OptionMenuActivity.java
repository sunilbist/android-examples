package np.com.westernit.digitalboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.optionOne:
                Toast.makeText(getApplicationContext(),"Profile",Toast.LENGTH_LONG).show();
                return true;
            case R.id.optionTwo:
                Toast.makeText(getApplicationContext(),"Option 2",Toast.LENGTH_LONG).show();
                return true;
            case R.id.optionThree:
                Toast.makeText(getApplicationContext(),"Option 3",Toast.LENGTH_LONG).show();
                return true;
            case R.id.optionFour:
                Toast.makeText(getApplicationContext(),"Option 4",Toast.LENGTH_LONG).show();
                return true;
            case R.id.optionFive:
                Toast.makeText(getApplicationContext(),"Option 5",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}