package com.greymatter.telugucalender.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.greymatter.telugucalender.Adapters.MuhurthaluAdapter
import com.greymatter.telugucalender.Model.MuhurthaluModel
import com.greymatter.telugucalender.R
import com.greymatter.telugucalender.databinding.FragmentMuhurthaluBinding

class MuhurthaluFrag : Fragment() {


    private lateinit var binding : FragmentMuhurthaluBinding
    private lateinit var dataListOne :ArrayList<MuhurthaluModel>
    private lateinit var dataListTwo :ArrayList<MuhurthaluModel>
    private lateinit var dataListThree :ArrayList<MuhurthaluModel>
    private lateinit var dataListFour :ArrayList<MuhurthaluModel>
    private lateinit var MuhurthaluAdapter : MuhurthaluAdapter

    // This is the part of BottomNavigation
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMuhurthaluBinding.inflate(layoutInflater,container,false)
        dataListOne = arrayListOf()
        dataListTwo = arrayListOf()
        dataListThree = arrayListOf()
        dataListFour = arrayListOf()

        with(dataListOne) {
            this.add(MuhurthaluModel("SomeRashiOne","20-11-2022 05:27 AM","20-11-2022 09:27 AM"))
        }
        with(dataListTwo) {
            this.add(MuhurthaluModel("SomeRashiTwo","20-11-2022 05:27 AM","20-11-2022 05:27 AM"))
        }
        with(dataListThree) {
            this.add(MuhurthaluModel("SomeRashiThree","20-11-2022 05:27 AM","20-11-2022 05:27 AM"))
        }
        with(dataListFour) {
            this.add(MuhurthaluModel("SomeRashiFour","20-11-2022 05:27 AM","20-11-2022 05:27 AM"))
        }
        binding.MuhurthaluRecycler.layoutManager = LinearLayoutManager(requireActivity())
        MuhurthaluAdapter = MuhurthaluAdapter(dataListOne)
        binding.MuhurthaluRecycler.adapter = MuhurthaluAdapter
        binding.OptionOne.setOnClickListener {
            MuhurthaluAdapter = MuhurthaluAdapter(dataListOne)
            binding.MuhurthaluRecycler.adapter = MuhurthaluAdapter
            MuhurthaluAdapter.notifyDataSetChanged()
        }
        binding.OptionTwo.setOnClickListener {
            MuhurthaluAdapter = MuhurthaluAdapter(dataListTwo)
            binding.MuhurthaluRecycler.adapter = MuhurthaluAdapter
            MuhurthaluAdapter.notifyDataSetChanged()
        }
        binding.OptionThree.setOnClickListener {
            MuhurthaluAdapter = MuhurthaluAdapter(dataListThree)
            binding.MuhurthaluRecycler.adapter = MuhurthaluAdapter
            MuhurthaluAdapter.notifyDataSetChanged()
        }
        binding.OptionFour.setOnClickListener {
            MuhurthaluAdapter = MuhurthaluAdapter(dataListFour)
            binding.MuhurthaluRecycler.adapter = MuhurthaluAdapter
            MuhurthaluAdapter.notifyDataSetChanged()
        }

        return binding.root
    }
}