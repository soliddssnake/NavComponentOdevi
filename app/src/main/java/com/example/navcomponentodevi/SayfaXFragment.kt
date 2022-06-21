package com.example.navcomponentodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navcomponentodevi.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var tasarim: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.button5.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXdenYGecis)
        }

        return tasarim.root
    }
}