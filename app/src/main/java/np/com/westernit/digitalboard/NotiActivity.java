package np.com.westernit.digitalboard;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotiActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;
    private EditText etTitle;
    private EditText etDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti);

//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

//        int notificationId = 1;
//        String channelId = "mychannel-1";
//        String channelName = "My Channel Name";
//        int importance = NotificationManager.IMPORTANCE_HIGH;
//
//        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            NotificationChannel mChannel = new NotificationChannel(
//                    channelId, channelName, importance);
//            notificationManager.createNotificationChannel(mChannel);
//        }
//
//        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), channelId)
//                .setSmallIcon(R.mipmap.ic_launcher)
//                .setContentTitle("Title of Notification")
//                .setContentText("Detail notification Message");
//
//        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//        PendingIntent resultPendingIntent = PendingIntent.getActivity(getApplicationContext(),0,intent,0);
//
//        mBuilder.setContentIntent(resultPendingIntent);
//
//        notificationManager.notify(notificationId, mBuilder.build());


        notificationManager = NotificationManagerCompat.from(this);
        etTitle = findViewById(R.id.etTitle);
        etDetail = findViewById(R.id.etDetail);
    }

    public void channelOne(View v) {
        Notification notification = new NotificationCompat.Builder(this, App.CHANNEL_1_ID)
                .setContentTitle(etTitle.getText().toString())
                .setTicker("one")
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.drawable.ic_location)
                .setContentText(etDetail.getText().toString())
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManager.notify(1, notification);

    }

    public void channelTwo(View v) {
        Notification notification2 = new NotificationCompat.Builder(this, App.CHANNEL_2_ID)
                .setContentTitle(etTitle.getText().toString())
                .setTicker("two")
                .setSmallIcon(R.drawable.ic_home)
                .setContentText(etDetail.getText().toString())
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManager.notify(2, notification2);
    }
}
