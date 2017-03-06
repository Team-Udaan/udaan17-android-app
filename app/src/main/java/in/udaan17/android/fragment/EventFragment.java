package in.udaan17.android.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.udaan17.android.R;
import in.udaan17.android.adapter.EventAdapter;
import in.udaan17.android.model.Event;

/**
 * Created by pranshu on 6/3/17.
 */

public class EventFragment extends Fragment {

    View rootView;
    RecyclerView eventRecyclerView;
    EventAdapter eventAdapter;

    List<Event> eventList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.from(getContext()).inflate(R.layout.event_fragment, container, false);


        return rootView;
    }
}
