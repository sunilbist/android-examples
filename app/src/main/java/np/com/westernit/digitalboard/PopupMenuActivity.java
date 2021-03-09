package np.com.westernit.digitalboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
    }

    public void popupMenu(View v){
        PopupMenu popupMenu = new PopupMenu(getApplicationContext(),v);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
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
                        return false;
                }
            }
        });
        popupMenu.inflate(R.menu.popup_menu_item);
        popupMenu.show();
    }
}