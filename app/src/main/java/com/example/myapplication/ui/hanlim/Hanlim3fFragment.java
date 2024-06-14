package com.example.myapplication.ui.hanlim;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class Hanlim3fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;
    private ConstraintLayout constraintLayout;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hanlim3f, container, false);

        constraintLayout = view.findViewById(R.id.constraintLayout);
        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.text_hanlim3f1);
        TextView textView2 = view.findViewById(R.id.text_hanlim3f2);
        TextView textView3 = view.findViewById(R.id.text_hanlim3f3);


        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker));
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker));


        return view;
    }

    private void handleTextViewClick(TextView textView, int imageResId) {
        if (lastClickedTextView != null && lastClickedTextView == textView) {
            overlayImageView.setVisibility(View.GONE);
            lastClickedTextView = null;
        } else {
            // Set the image resource
            overlayImageView.setImageResource(imageResId);

            // Use ConstraintSet to modify constraints
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);

            if (textView.getId() == R.id.text_hanlim3f1) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 550);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 600);
            } else if (textView.getId() == R.id.text_hanlim3f2) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 250);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            } else if (textView.getId() == R.id.text_hanlim3f3) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 800);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            }
            // Add more conditions as needed for other TextViews

            // Apply the modified constraints
            constraintSet.applyTo(constraintLayout);

            // Make overlayImageView visible
            overlayImageView.setVisibility(View.VISIBLE);

            // Set the last clicked textView
            lastClickedTextView = textView;
        }
    }
}
