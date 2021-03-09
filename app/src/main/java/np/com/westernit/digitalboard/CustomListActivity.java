package np.com.westernit.digitalboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListActivity extends AppCompatActivity {

    private static String[] NAME = {"C", "C++", "VB", "PHP", "JAVA", "C#", "Android"};
    private static int[] IMAGE = {R.drawable.c, R.drawable.c, R.drawable.c,
            R.drawable.php, R.drawable.c, R.drawable.c, R.drawable.php};
    private static String[] DESCRIPTION = {"Procedural Programming", "Object Oriented Programming", "Visual Basic ", "Hypertext Preprocessor", "Object Oriented Programming", "C sharp", "Android App"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        ListView lvProgrammingLanguage = findViewById(R.id.ivProgrammingLanguage);
        CustomAdapter adapter = new CustomAdapter();
        lvProgrammingLanguage.setAdapter(adapter);

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return NAME.length;
        }
        @Override
        public Object getItem(int i) {
            return null;
        }
        @Override
        public long getItemId(int i) {
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_layout, null);

            ImageView ivImage = (ImageView) view.findViewById(R.id.ivImage);
            TextView tvName = (TextView) view.findViewById(R.id.tvName);
            TextView tvDescription = (TextView) view.findViewById(R.id.tvDescription);

            ivImage.setImageResource(IMAGE[i]);
            tvName.setText(NAME[i]);
            tvDescription.setText(DESCRIPTION[i]);

            return view;
        }
    }

}
