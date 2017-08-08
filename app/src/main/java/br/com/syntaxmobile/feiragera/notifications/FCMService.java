package br.com.syntaxmobile.feiragera.notifications;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

import br.com.syntaxmobile.feiragera.R;

/**
 * Created by Paulo on 26/07/2017.
 */

public class FCMService extends FirebaseMessagingService {

    public static final String TAG = "FirebaseLog";
    public static final String NOTIFICATION_NEW_MESSAGE = "nova_mensagem";
    public static int NOTIFICATION_NEW_MESSAGE_ID = 1;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.v(TAG, "Recebeu mensagem do Firebase!");

        Map<String, String> data = remoteMessage.getData();

        //Isso não ocorre quando recebemos uma notificação, mas não custa prevenir
        if (data == null)
            return;

        String event = data.get("event");
        String content = data.get("content");

        Log.v(TAG, "Evento: " + event);
        Log.v(TAG, "Conteúdo: " + content);

        if (event.equals(NOTIFICATION_NEW_MESSAGE)) {

            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.mipmap.ic_launcher_round)
                            .setContentTitle("Feira Gera")
                            .setContentText(content);
            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

            mNotificationManager.notify(NOTIFICATION_NEW_MESSAGE_ID, mBuilder.build());

        }

    }

}