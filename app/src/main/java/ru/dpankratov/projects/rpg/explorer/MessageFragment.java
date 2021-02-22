package ru.dpankratov.projects.rpg.explorer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class MessageFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        TextView message = (TextView) view.findViewById(R.id.message);

        return view;
    }

    public void setMessage(String item){
        TextView message = (TextView) getView().findViewById(R.id.message);
        message.setText(item);
    }

}