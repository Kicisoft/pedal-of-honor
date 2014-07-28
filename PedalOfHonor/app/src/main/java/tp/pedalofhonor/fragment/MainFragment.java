package tp.pedalofhonor.fragment;

import android.support.v4.app.Fragment;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;

import tp.pedalofhonor.MainActivity;
import tp.pedalofhonor.R;

/**
 * Created by Juan on 26/07/2014.
 * Fragment for main screen principal content.
 */
@EFragment(R.layout.fragment_main)
public class MainFragment extends Fragment{

    @Click
    void menuButton(){
        ((MainActivity)getActivity()).toggleMenu();
    }
}
