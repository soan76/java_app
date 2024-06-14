package com.example.myapplication.ui.hanlim;

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
import com.example.myapplication.databinding.FragmentHanlimBinding;

public class HanlimFragment extends Fragment {

    private FragmentHanlimBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HanlimViewModel hanlimViewModel =
                new ViewModelProvider(this).get(HanlimViewModel.class);

        binding = FragmentHanlimBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHanlim;
        hanlimViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.hanlim1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hanlim_to_nav_hanlim1f));
        binding.hanlim2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hanlim_to_nav_hanlim2f));
        binding.hanlim3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hanlim_to_nav_hanlim3f));
        binding.hanlim4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hanlim_to_nav_hanlim4f));
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