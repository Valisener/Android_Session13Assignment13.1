/*package assignment13.acadgild.com.assignment13;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.Toast;

import java.util.Random;

public class HomeWidget extends AppWidgetProvider {
//    private static final String SYNC_CLICKED    = "automaticWidgetSyncButtonClick";
//    Button button;
//    public static String WIDGET_BUTTON = "WIDGET_BUTTON";

    private static final String MY_BUTTTON_START = "myButtonStart";
    RemoteViews remoteViews;

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int count = appWidgetIds.length;

        for (int i = 0; i < count; i++) {
            int widgetId = appWidgetIds[i];

            remoteViews = new RemoteViews(context.getPackageName(),R.layout.widget_layout);
//            remoteViews.setTextViewText(R.id.textView, number);

            Intent intent = new Intent(context, HomeWidget.class);
            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
                    0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

            remoteViews.setOnClickPendingIntent(R.id.actionButton,
                    getPendingSelfIntent(context, MY_BUTTTON_START));

            appWidgetManager.updateAppWidget(widgetId, remoteViews);
        }
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

        if (MY_BUTTTON_START.equals(intent.getAction())){
            Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show();

        }
    };

    protected PendingIntent getPendingSelfIntent(Context context, String action) {
        Intent intent = new Intent(context, getClass());
        intent.setAction(action);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }





//    @Override
//    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
//        super.onUpdate(context, appWidgetManager, appWidgetIds);
//        //get widget count
//        int count = appWidgetIds.length;
//        //initialize intent
//        Intent intent = null;
//        //for loop that loops thro the appwidgets
//        for (int i = 0; i < count;i++) {
//            //get widgetid
//            int widgetId = appWidgetIds[i];
//
//            String number = String.format("%03d", ( new Random().nextInt(900) + 100));
//
//
//            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layoutold);
////            intent = new Intent(context, HomeWidget.class);
////            intent.setAction(Intent.ACTION_VIEW);
////            intent.setData(uri);
//
////        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
////            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//            String title = "Select a browser";
//            // Create intent to show the chooser dialog
////            Intent chooser = Intent.createChooser(intent, title);
//
//
////            remoteViews.setOnClickPendingIntent(R.id.btn_open_browser, pendingIntent);
//            remoteViews.setOnClickPendingIntent(R.id.btn_open_browser, getPendingSelfIntent(context,SYNC_CLICKED));
////            remoteViews.
////            button = context.
//
//
////            Intent intent = new Intent(context, HomeWidget.class);
////            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
////            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,appWidgetIds);
//
//
//
//
//
////        intent.setAction();
////            intent.setAction(Intent.ACTION_VIEW);
//
//
//            // Create and start the chooser
//
//
////        Intent.ACTION_VIEW, Uri.parse(download_link)
//
//
//
//
//
//            //update widget
//            appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
//        }
//    }
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        // TODO Auto-generated method stub
//        super.onReceive(context, intent);
//
//        if (SYNC_CLICKED.equals(intent.getAction())) {
//
//            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
//
//            RemoteViews remoteViews;
//            ComponentName watchWidget;
//
//            remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
//            watchWidget = new ComponentName(context, HomeWidget.class);
//
//            remoteViews.setTextViewText(R.id.btn_open_browser, "TESTING");
//
//            appWidgetManager.updateAppWidget(watchWidget, remoteViews);
//
//        }
//    }
//
//
//    protected PendingIntent getPendingSelfIntent(Context context, String action) {
//        Uri uri = Uri.parse("http://www.google.com");
//        Intent intent = new Intent(context, HomeWidget.class);
//        intent.setAction(action);
//        intent.setData(uri);
//        return PendingIntent.getBroadcast(context, 0, intent, 0);
//    }

}

//before altering

//    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
//
//
//    Intent intent = new Intent(context, HomeWidget.class);
////        intent.setAction();
//            intent.setAction(Intent.ACTION_VIEW);
//
//
//                    PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
////        Intent.ACTION_VIEW, Uri.parse(download_link)
//
//
//                    remoteViews.setOnClickPendingIntent(R.id.btn_open_browser, pendingIntent);
//
//
//                    appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
*/