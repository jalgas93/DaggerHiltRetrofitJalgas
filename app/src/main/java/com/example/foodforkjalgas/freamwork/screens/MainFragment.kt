package com.example.foodforkjalgas.freamwork.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.foodforkjalgas.databinding.FragmentMainBinding
import com.example.foodforkjalgas.freamwork.adapter.MainFragmentAdapter
import com.example.foodforkjalgas.model.Models
import com.example.foodforkjalgas.util.DataState
import com.example.foodforkjalgas.viewModel.MainFragmentViewModel
import com.example.foodforkjalgas.viewModel.MainStateEvent
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment constructor(private val someString: String) : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val mBinding get() = _binding!!
    private lateinit var mAdapter: MainFragmentAdapter

    private val TAG: String = "Jalgas"

    private val viewModel: MainFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeObservers()
        viewModel.setStateEvent(MainStateEvent.GetBlogsEvent)
    }

    private fun subscribeObservers() {
        viewModel.dataState.observe(viewLifecycleOwner, Observer { datastate ->
            when (datastate) {
                is DataState.Success<List<Models>> -> {
                    displayProgressBar(false)
                    mAdapter.model = datastate.data
                }
                is DataState.Error -> {
                    displayProgressBar(false)
                    displayError(datastate.e.message)
                }
                is DataState.Loading -> {
                    displayProgressBar(true)
                }
            }
        })

    }

    private fun displayError(message: String?) {
        // if(message != null) text.text2 = message else text.text = "Unknown error."
    }

    private fun displayProgressBar(isDisplayed: Boolean) {
        mBinding.progressBar.visibility = if (isDisplayed) View.VISIBLE else View.GONE
    }


}