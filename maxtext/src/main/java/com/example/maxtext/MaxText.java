package com.example.maxtext;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

public class MaxText {




    public static void applyAeroviasbraslinf(Context context, TextView textView) {
        Typeface AeroViasBraslinf = Typeface.createFromAsset(context.getAssets(), "fonts/aeroviasbrasiln.ttf");
        textView.setTypeface(AeroViasBraslinf);
    }

    public static void applyAirborne(Context context, TextView textView, String fontPath) {
        Typeface AirBorne = Typeface.createFromAsset(context.getAssets(), "fonts/airborne");
        textView.setTypeface(AirBorne);
    }

    public static void applyBetsyflangan(Context context, TextView textView) {
        Typeface Betsyflanagan = Typeface.createFromAsset(context.getAssets(), "fonts/etsyflanagan.ttf");
        textView.setTypeface(Betsyflanagan);
    }

        // Add more methods for different font settings as needed

}
