package com.github.pedroluis02.accountpassmanager.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.github.pedroluis02.accountpassmanager.model.UserAccount
import com.github.pedroluis02.accountpassmanager.viewmodel.AccountsViewModel

@Composable
fun AccountsUi(viewModel: AccountsViewModel, modifier: Modifier = Modifier) {
    val stateFlow = viewModel.state
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(stateFlow.value.accounts.size) { index ->
            AccountItemUi(stateFlow.value.accounts[index])
        }
    }
}

@Composable
fun AccountItemUi(account: UserAccount) {
    Column {
        Text(account.name)
        Text(account.username)
    }
}
