package mad.vttransit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BenKO on 12/25/13.
 */
public class RoutesFragment extends Fragment {

    private static List<Route> allRoutesList;

    public RoutesFragment() {
        Bundle args = new Bundle();
        this.setArguments(args);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        allRoutesList = new ArrayList<Route>();
        Log.e("Got here", "GOT HERE");
        try {
            allRoutesList = allRoutes();
            Log.e("In try", "In try");
        } catch (Exception e) {
            Log.e("In catch", "In catch");
        }
        List<String> routeNameList = new ArrayList<String>();
        for (int i = 0; i < allRoutesList.size(); i++) {
            routeNameList.add(allRoutesList.get(i).getFullName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.text_view, routeNameList);
        listView.setAdapter(adapter);
        return rootView;
    }

    /**
     * Gets all of the Blacksburg Transit Routes from a text file.
     *
     * @return a list of routes
     */
    private List<Route> allRoutes()
            throws IOException {
        Log.e("In allRoutes", "In allRoutes");
        BufferedReader reader = new BufferedReader(new InputStreamReader(this.getActivity().getAssets().open("routes.txt")));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(this.getActivity().getAssets().open("routeshortnames.txt")));
        List<Route> allRoutes = new ArrayList<Route>();
        String name;
        String shortName;
        while ((name = reader.readLine()) != null) {
            shortName = reader2.readLine();
            Log.d("Readline", shortName);
            allRoutes.add(new Route(name, shortName));
        }
        return allRoutes;
    }
}