package com.example.freitag.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.freitag.MainActivity
import com.example.freitag.R
import com.example.freitag.data.Datasource
import com.example.freitag.data.Gift
import com.example.freitag.databinding.FragmentTechnicBinding

class TechnicFragment : Fragment() {

    private lateinit var binding: FragmentTechnicBinding
    private val mainActivity= activity as MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_technic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gift:Gift

        binding.firstFragmentTV.setOnClickListener {

            val mainActivity = activity as MainActivity
            mainActivity.profile = profile

            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(profile.name))

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataset : List<Gift> = Datasource().loadTechnics()
        Log.d("DatasetLog", "$dataset")


    }

}
