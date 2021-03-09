package np.com.westernit.digitalboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AsyncActivity extends AppCompatActivity {

    EditText etInput;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);
        etInput = findViewById(R.id.et_input);
        tvResult = findViewById(R.id.tv_result);
    }

    public void callAsyncTask(View v){
        new MyAsyncTask().execute(etInput.getText().toString());
    }

    class MyAsyncTask extends AsyncTask<String,Integer,Integer> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            tvResult.setText("Start");
        }

        @Override
        protected Integer doInBackground(String... strings) {
            Integer input = Integer.parseInt(strings[0]);
            for(int i=0; i<input;i++){
                publishProgress(i);
                try {
                    Thread.sleep(200);
                }catch(Exception e){
                }
            }
           return 0;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            tvResult.setText(values[0]+"");
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            tvResult.setText("Complete");
        }
    }
}