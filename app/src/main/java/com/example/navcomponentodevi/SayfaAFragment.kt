package com.example.navcomponentodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navcomponentodevi.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private lateinit var tasarim: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)

        tasarim.gitBButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAdanBGecis)
        }

        return tasarim.root
    }
}