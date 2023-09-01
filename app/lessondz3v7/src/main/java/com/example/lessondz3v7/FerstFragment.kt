package com.example.lessondz3v7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lessondz3v7.databinding.FragmentFerstBinding

class FerstFragment : Fragment() {
    private lateinit var binding: FragmentFerstBinding
    private lateinit var RmList: ArrayList<T>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFerstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = TAdapter(RmList, this::onItemClick)
        binding.recycleView.adapter = adapter
    }

    private fun loadData() {
        RmList = ArrayList<T>()

        RmList.apply {
            add(T(R.drawable.ricky, "Alive", "Rick Sanchez"))
            add(T(R.drawable.morty, "Alive", "Morty Smith"))
            add(T(R.drawable.albert, "Dead", "Albert Einstein"))
            add(T(R.drawable.jerry, "Alive", "Jerry Smith"))
        }

    }

    private fun onItemClick(rm: T) {
        val bundle = Bundle()
        bundle.putSerializable ("key", rm)
        findNavController().navigate(R.id.srcondFragment, bundle)
    }
}
