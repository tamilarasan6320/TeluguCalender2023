package com.greymatter.telugucalender.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.greymatter.telugucalender.Adapters.PandugaluAdapter
import com.greymatter.telugucalender.Model.PandugaluModel
import com.greymatter.telugucalender.databinding.FragmentPandugaluBinding
import java.text.SimpleDateFormat
import java.util.*

class PandugaluFrag : Fragment() {
    private var binding : FragmentPandugaluBinding? = null;
    private lateinit var PandugaluAdapter : PandugaluAdapter

    @SuppressLint("SimpleDateFormat")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPandugaluBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment

        //TODO: fix date logic
        //Date logic goes here
        val date = Calendar.getInstance()
        Toast.makeText(requireContext(),date.timeZone.toString(),Toast.LENGTH_LONG).show() 
        val sdf  = SimpleDateFormat("MMMM")
        binding!!.PresentMonthAndYear.text = sdf.format(date.get(Calendar.MONTH))
        binding!!.ArrowLeft.setOnClickListener {
            val updated = date.get(Calendar.MONTH)-1
            binding!!.PresentMonthAndYear.text = sdf.format(updated)
        }
        binding!!.ArrowRight.setOnClickListener {
            val updated = date.get(Calendar.MONTH)+1
            binding!!.PresentMonthAndYear.text = sdf.format(updated)
        }
        //Recycler things goes here
        PandugaluAdapter = PandugaluAdapter(recyclerViewData())
        binding?.let {
            it.PandugaluRecycler.layoutManager = LinearLayoutManager(requireContext())
            it.PandugaluRecycler.adapter = PandugaluAdapter
        }
        return binding!!.root
    }

    private fun recyclerViewData() : ArrayList<PandugaluModel> {
       val data : ArrayList<PandugaluModel> = arrayListOf()
        data.add(PandugaluModel("12-11-2022","Event One"))
        data.add(PandugaluModel("13-11-2022","Event Two"))
        data.add(PandugaluModel("14-11-2022","Event Three"))
        data.add(PandugaluModel("15-11-2022","Event Four"))
        data.add(PandugaluModel("16-11-2022","Event Five"))
        data.add(PandugaluModel("17-11-2022","Event Six"))
       return data
    }
}