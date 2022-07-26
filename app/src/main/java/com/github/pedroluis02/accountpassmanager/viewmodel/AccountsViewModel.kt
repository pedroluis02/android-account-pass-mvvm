package com.github.pedroluis02.accountpassmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.pedroluis02.accountpassmanager.data.Repository
import com.github.pedroluis02.accountpassmanager.model.UserAccount
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class AccountsViewModel() : ViewModel() {
    private val _state = MutableStateFlow(AccountsUiState())
    val state: StateFlow<AccountsUiState> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val list = Repository.instance.getAccounts()
            _state.update { it.copy(accounts = list) }
        }
    }
}

data class AccountsUiState (
    val accounts: List<UserAccount> = emptyList()
)
