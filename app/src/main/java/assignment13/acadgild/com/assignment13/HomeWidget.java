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
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layoutold);
            //Set the onclick button with the pending intent
            remoteViews.setOnClickPendingIntent(R.id.btn_open_browser, pendingIntent);
            //update the widget
            appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
        }
    }
}
    /*

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        //get widget count
        int count = appWidgetIds.length;
        //initialize intent
        Intent intent = null;
        //for loop that loops thro the appwidgets
        for (int i = 0; i < count;i++) {
            //get widgetid
            int widgetId = appWidgetIds[i];

//            String number = String.format("%03d", ( new Random().nextInt(900) + 100));


            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layoutold);


            remoteViews.setOnClickPendingIntent(R.id.actionButton, getPendingSelfIntent(context, MY_BUTTTON_START));
            //update widget
            appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
        }
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        //check if the button was clicked
        if (MY_BUTTTON_START.equals(intent.getAction())){
            Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show();
            //Create the url to the website
            Uri uri = Uri.parse("http://www.acadgild.com");
            //create new intent
//            intent = new Intent(context, HomeWidget.class);
            //set the action to action view
            intent.setAction(Intent.ACTION_VIEW);
            //Set the url in the intent
            intent.setData(uri);
            //Store a string that asks for the browser to select
            String title = "Select a browser";
            // Create intent to show the chooser dialog
            Intent chooser = Intent.createChooser(intent, title);
            //Start activity in the context
            context.startActivity(chooser);
        }

    }

    //Pending intent
    protected PendingIntent getPendingSelfIntent(Context context, String action) {
        //make a new intent
        Intent intent = new Intent(context, getClass());
        Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show();
        //set intent action to the string
        intent.setAction(action);
        //return pending intent
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }


}
*/
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