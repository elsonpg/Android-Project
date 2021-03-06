package com.frontier.musicplayer.dialogs;

/**
 * Created by Elson on 6/18/2016.
 */
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.frontier.musicplayer.R;
import com.codetroopers.betterpickers.hmspicker.HmsPickerBuilder;
import com.codetroopers.betterpickers.hmspicker.HmsPickerDialogFragment;
import com.codetroopers.betterpickers.radialtimepicker.RadialTimePickerDialogFragment;


public class DialogUtils {

   /* public static void showErrorDialog(Context context, String message) {
        new AlertDialog.Builder(context)
                .setTitle(R.string.error)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                })
                .show();
    }

    public static void showPermissionDialog(Context context, String message, DialogInterface.OnClickListener listener) {
        new AlertDialog.Builder(context)
                .setTitle(R.string.permission)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, listener)
                .show();
    }*/


    /**
     * Helper method to be called when the user wants to set a timer but one is already set
     *
     * @param context
     * @param listener
     */
    public static void showSleepTimerDialog(Context context, DialogInterface.OnClickListener listener) {
        new AlertDialog.Builder(context)
                .setTitle(R.string.sleep_timer_dialog_title)
                        //.setMessage(R.string.sleep_timer_dialog_message)
                .setPositiveButton(R.string.action_set_timer, listener)
                .setNeutralButton(R.string.back, listener)
                .setNegativeButton(R.string.action_cancel_current, listener)
                .show();
    }


    public static void showSleepHmsPicker(AppCompatActivity activity, HmsPickerDialogFragment.HmsPickerDialogHandler handler) {
        HmsPickerBuilder builder = new HmsPickerBuilder()
                .addHmsPickerDialogHandler(handler)
                .setFragmentManager(activity.getSupportFragmentManager());

       // if (MainActivity.isDarkThemeSelected(activity) {
            builder.setStyleResId(R.style.BetterPickersDialogFragment);
        //} else {
          //  builder.setStyleResId(R.style.BetterPickersDialogFragment_Light);
       // }
        builder.show();

    }
}
