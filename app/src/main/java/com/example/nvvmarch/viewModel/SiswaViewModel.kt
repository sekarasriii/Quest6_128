package com.example.nvvmarch.viewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.lifecycle.ViewModel
import com.example.nvvmarch.model.Siswa
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel {
    private val _statusUI = MutableStateFlow( Siswa())
    val statusUI : StateFlow<Siswa> = _statusUI.asStateFlow()


}