package tp.pedalofhonor.fragment;

import android.support.v4.app.Fragment;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;

import tp.pedalofhonor.MainActivity;
import tp.pedalofhonor.R;
import tp.pedalofhonor.SetupDetailsActivity_;

/**
 * Created by Juan on 26/07/2014.
 * Fragment for main screen drawer menu.
 */
@EFragment(R.layout.fragment_left_menu)
public class LeftMenuFragment extends Fragment{

    @Click
    void newSetupButton(){
        ((MainActivity)getActivity()).toggleMenu();
    }

    @Click
    void loadSetupButton(){
        ((MainActivity)getActivity()).toggleMenu();
        SetupDetailsActivity_.intent(getActivity()).start();
    }

    @Click
    void optionsButton(){
        ((MainActivity)getActivity()).toggleMenu();
    }

}
