package com.example.geogeo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag_stats extends Fragment {
    TextView playedGames;
    TextView points;
    TextView averageScore;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_stats, container, false);
        super.onCreate(savedInstanceState);

        return inflater.inflate(R.layout.frag_stats, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        Controller c = new Controller(getActivity());
        String[] stats = c.getStats(1);
        playedGames = (TextView) view.findViewById(R.id.profil_playedGamesDisplay);
        playedGames.setText(stats[0]);
        points = (TextView) view.findViewById(R.id.profil_highscoreDisplay);
        points.setText(stats[2]);
        averageScore = (TextView) view.findViewById(R.id.profil_averageDisplay);
        averageScore.setText(stats[1]);
        System.out.println(stats[0]);
    }
}
