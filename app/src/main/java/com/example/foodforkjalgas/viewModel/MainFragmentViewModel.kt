
package com.example.foodforkjalgas.viewModel

import android.app.Application
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.example.foodforkjalgas.di.RepositoryModule
import com.example.foodforkjalgas.model.Models
import com.example.foodforkjalgas.repository.MainRepository
import com.example.foodforkjalgas.util.DataState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
class MainFragmentViewModel @ViewModelInject constructor( private val repository: MainRepository,
    @Assisted private val savedStateHandle: SavedStateHandle) :
    ViewModel() {
    private val _datastate: MutableLiveData<DataState<List<Models>>> = MutableLiveData()

    val dataState: LiveData<DataState<List<Models>>>
        get() = _datastate


    fun setStateEvent(mainStateEvent: MainStateEvent) {
        viewModelScope.launch {
            when (mainStateEvent) {
                is MainStateEvent.GetBlogsEvent -> {
                    repository.getModel()
                        .onEach { dataState ->
                            _datastate.value = dataState
                        }
                        .launchIn(viewModelScope)

                }
            }
        }
    }


}

sealed class MainStateEvent {

    object GetBlogsEvent : MainStateEvent()

    object None : MainStateEvent()

}