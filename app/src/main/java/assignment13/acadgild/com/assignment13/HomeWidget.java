package assignment13.acadgild.com.assignment13;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;


public class HomeWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
                         int[] appWidgetIds) {

        super.onUpdate(context, appWidgetManager, appWidgetIds);
        //set the url for the url to use
        Uri uri = Uri.parse("http://www.acadgild.com");
        //for loop that goes thro all widgets
        for (int i = 0; i < appWidgetIds.length; i++) {
            //set the widget id
            int appWidgetId = appWidgetIds[i];
            //Create a new intent
            Intent intent = new Intent();
            //set the class for the intent and context
            intent.setClass(context, HomeWidget.class);
            //set the action for the intent
            intent.setAction(Intent.ACTION_VIEW);
            //add the category to the intent that sets it as an app browser
            intent.addCategory(Intent.CATEGORY_APP_BROWSER);
            //set the url thats used for the intent
            intent.setData(uri);
            //Create a string that asks the user to select a browser to use
            String title = "Select a browser";
            // Create intent to show the chooserIntent dialog
            Intent chooserIntent = Intent.createChooser(intent, title);
            //create a pending intent for the button using the chooserIntent intent that asks to choose the app to use
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, chooserIntent, 0);
            //create a new remoteviews and set the widget layout
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
            //Set the onclick button with the pending intent
            remoteViews.setOnClickPendingIntent(R.id.btn_open_browser, pendingIntent);
            //update the widget
            appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
        }
    }
}