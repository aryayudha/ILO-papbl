package winona.indira.ilo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import winona.indira.ilo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavCategoryFragment extends Fragment {


    public NavCategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.nav_category, null);
    }

}
