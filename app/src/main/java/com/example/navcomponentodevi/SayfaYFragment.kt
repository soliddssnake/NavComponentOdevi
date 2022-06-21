package com.example.navcomponentodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navcomponentodevi.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        tasarim = FragmentSayfaYBinding.inflate(inflater, container, false)

        tasarim.button6.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anaSayfayaDon)
        }

        return tasarim.root
    }
}