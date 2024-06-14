package com.example.myapplication.ui.hongji;

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

public class Hongji2fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;
    private ConstraintLayout constraintLayout;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hongji2f, container, false);

        constraintLayout = view.findViewById(R.id.constraintLayout);
        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.text_hongji2f1);
        TextView textView2 = view.findViewById(R.id.text_hongji2f2);
        TextView textView3 = view.findViewById(R.id.text_hongji2f3);
        TextView textView4 = view.findViewById(R.id.text_hongji2f4);


        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker));
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker));
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker));

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

            if (textView.getId() == R.id.text_hongji2f1) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 300);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            } else if (textView.getId() == R.id.text_hongji2f2) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 750);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 1300);
            } else if (textView.getId() == R.id.text_hongji2f3) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 600);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 370);
            } else if (textView.getId() == R.id.text_hongji2f4) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 1250);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 650);
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
