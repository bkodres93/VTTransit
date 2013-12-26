package mad.vttransit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BenKO on 12/25/13.
 */
public class FavoritesFragment extends Fragment {

    public FavoritesFragment() {
        Bundle args = new Bundle();
        this.setArguments(args);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        List<String> favoritesList = new ArrayList<String>();
        favoritesList.add("Unimplemented Feature . . .");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.text_view, favoritesList);
        listView.setAdapter(adapter);
        return rootView;
    }
}