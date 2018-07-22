package assignment13.acadgild.com.assignment13;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;

import java.util.Random;

public class worksbeforealtering {
/*
    //get widget count
    int count = appWidgetIds.length;
    //initialize intent
    Intent intent = null;
    //for loop that loops thro the appwidgets
        for (int i = 0; i < count;i++) {
        //get widgetid
        int widgetId = appWidgetIds[i];

        String number = String.format("%03d", ( new Random().nextInt(900) + 100));


        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layoutold);
        Uri uri = Uri.parse("http://www.google.com");
        intent = new Intent(context, HomeWidget.class);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(uri);

//        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        String title = "Select a browser";
        // Create intent to show the chooser dialog
        Intent chooser = Intent.createChooser(intent, title);


        remoteViews.setOnClickPendingIntent(R.id.btn_open_browser, pendingIntent);
//            remoteViews.
//            button = context.


//            Intent intent = new Intent(context, HomeWidget.class);
//            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
//            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,appWidgetIds);





//        intent.setAction();
//            intent.setAction(Intent.ACTION_VIEW);


        // Create and start the chooser


//        Intent.ACTION_VIEW, Uri.parse(download_link)





        //update widget
        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
    }
    */
}
