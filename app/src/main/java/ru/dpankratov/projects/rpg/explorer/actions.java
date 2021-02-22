package ru.dpankratov.projects.rpg.explorer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class actions extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Context context;

    public actions() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment actions.
     */
    // TODO: Rename and change types and number of parameters
    public static actions newInstance(String param1, String param2) {
        actions fragment = new actions();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onClick(View v) {
        EditText name = (EditText) getView().findViewById(R.id.editTextTextPassword);
        String nameValue = name.getText().toString();

        String text = "";
        switch (v.getId()) {
            case R.id.playButton:
                text = "Кнопка 1 нажата";
                break;
            case R.id.pauseButton:
                text = nameValue;
                break;
        }
        MessageFragment fragment = (MessageFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);
        if (fragment != null && fragment.isInLayout()) {
            fragment.setMessage(text);
        }
        else {
            Intent intent = new Intent(getActivity().getApplicationContext(), MessageActivity.class);
            intent.putExtra("value", text);
            startActivity(intent);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_actions, container, false);
        ImageButton button1 = (ImageButton) view.findViewById(R.id.playButton);
        button1.setOnClickListener(this);

        ImageButton button2 = (ImageButton) view.findViewById(R.id.pauseButton);
        button2.setOnClickListener(this);

        return view;
    }
}