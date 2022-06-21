package com.example.navcomponentodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navcomponentodevi.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var tasarim: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)

        tasarim.gitYButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBdenYGecis)
        }

        return tasarim.root
    }
}