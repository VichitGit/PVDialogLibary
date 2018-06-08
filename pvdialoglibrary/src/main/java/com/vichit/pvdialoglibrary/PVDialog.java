package com.vichit.pvdialoglibrary;

import android.content.Context;
import android.support.v7.app.AlertDialog;

public class PVDialog {

    private AlertDialog.Builder builder;
    private Context context;
    private OnShowDialog onShowDialog;
    private boolean cancelable;

    public PVDialog(Context context, String title, String message) {
        this.context = context;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
            builder.setTitle(title);
            builder.setMessage(message);
        }
    }

    public void setActionButton(String positiveText, String negativeText, OnShowDialog onShowDialog) {

        this.onShowDialog = onShowDialog;

        if (!isCancelable())
            builder.setCancelable(false);
        else if (isCancelable())
            builder.setCancelable(true);

        builder.setPositiveButton(positiveText, (dialogInterface, i) -> {
            onShowDialog.setOnPositiveButton(dialogInterface);
        });

        builder.setNegativeButton(negativeText, (dialogInterface, i) -> {
            onShowDialog.setOnNegativeButton(dialogInterface);
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public boolean isCancelable() {
        return cancelable;
    }

    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }
}
