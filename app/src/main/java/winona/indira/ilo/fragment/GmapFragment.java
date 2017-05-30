package winona.indira.ilo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;

import winona.indira.ilo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GmapFragment extends Fragment{

    private GoogleMap mMap;

//    public GmapFragment() {
//        // Required empty public constructor
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gmap, container, false);

       // Intent intent = new Intent(getActivity(), MapsActivity.class);
       // getActivity().startActivity(intent);


       // return null;

    }

     /* @Override
    public void onViewCreated (View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        // FragmentManager fragmentManager = getChildFragmentManager();
        // MapFragment fragment = (MapFragment)getFragmentManager().findFragmentById(R.id. map2);


        SupportMapFragment supportMapFragment;
        supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map2);
        supportMapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng pas = new LatLng(-7.64280732732681,112.892977148294);
        mMap.addMarker(new MarkerOptions().position(pas).title("Gentong Pasuruan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pas, 14));

    }*/

     @Override
     public void onActivityCreated(Bundle savedInstanceState){
         super.onActivityCreated(savedInstanceState);
         setUpMapIfNeeded();
     }

    @Override
        public void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
//        if (mMap == null){
//            //mMap = ((SupportMapFragment)getActivity().getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
//            mMap = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map)).getMap();
            if (mMap !=null){
                setUpMap();
            }
        }
   // }

    private void setUpMap() {
      mMap.addMarker(new MarkerOptions().position(new LatLng(-7.9573461,112.6139054)).title("Marker"));
//        LatLng pas = new LatLng(-7.64280732732681,112.892977148294);
//        mMap.addMarker(new MarkerOptions().position(pas).title("Gentong Pasuruan"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pas, 14));
    }

//    @Override
//    public void onViewCreated (View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//
//        // FragmentManager fragmentManager = getChildFragmentManager();
//        // MapFragment fragment = (MapFragment)getFragmentManager().findFragmentById(R.id. map2);
//
//
////        SupportMapFragment supportMapFragment;
////        supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mapContainer);
////        supportMapFragment.getMapAsync(this);
//
//    }
}

