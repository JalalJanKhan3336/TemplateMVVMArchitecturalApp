package com.softparrot.mvvmarchitecturalapptemplate.extras.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerDialogFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    private TimePickerListener mListener;

    public interface TimePickerListener {
        void onTimeSet(TimePicker timePicker, String selectedTime);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);

        return new TimePickerDialog(getContext(),this, hour, minute,false);
    }

    public void cancelDialog(){
        if(getDialog() != null && getDialog().isShowing())
            getDialog().cancel();
    }

    public void setTimePickerListener(TimePickerListener listener){
        mListener = listener;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        int second = 0;
        String time = String.format("%02d:%02d:%02d", hourOfDay, minute, second);
        //Log.d("TAG", "onTimeSet_: "+time);

        if(mListener != null)
            mListener.onTimeSet(view, time);
    }

}
