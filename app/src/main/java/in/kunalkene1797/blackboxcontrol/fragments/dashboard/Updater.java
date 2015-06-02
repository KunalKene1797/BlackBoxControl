package in.kunalkene1797.blackboxcontrol.fragments.dashboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.kunalkene1797.blackboxcontrol.R;

/**
 * Created by kunalkene1797 on 06/02/15.
 */
public class Updater extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.information,container,false);
        return v;
    }
}
