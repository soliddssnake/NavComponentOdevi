package com.example.navcomponentodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navcomponentodevi.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.gitAButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)
        }

        tasarim.gitXButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }

        return tasarim.root
    }
}