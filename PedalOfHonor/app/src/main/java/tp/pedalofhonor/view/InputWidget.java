package tp.pedalofhonor.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import org.androidannotations.annotations.EViewGroup;

import tp.pedalofhonor.R;

/**
 * Created by Juan on 27/07/2014.
 */
@EViewGroup(R.layout.input_widget)
public class InputWidget extends LinearLayout {
    public InputWidget(Context context) {
        super(context);
    }

    public InputWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
