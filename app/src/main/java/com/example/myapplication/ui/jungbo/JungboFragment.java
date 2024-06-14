package com.example.myapplication.ui.jungbo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentJungboBinding;

public class JungboFragment extends Fragment {

    private FragmentJungboBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JungboViewModel jungboViewModel =
                new ViewModelProvider(this).get(JungboViewModel.class);

        binding = FragmentJungboBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textJungbo;
        jungboViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.jungbo1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_jungbo_to_nav_jungbo1f));
        binding.jungbo2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_jungbo_to_nav_jungbo2f));
        binding.jungbo3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_jungbo_to_nav_jungbo3f));
        binding.jungbo4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_jungbo_to_nav_jungbo4f));
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        FragmentTransaction fragmentTransaction1 = fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}