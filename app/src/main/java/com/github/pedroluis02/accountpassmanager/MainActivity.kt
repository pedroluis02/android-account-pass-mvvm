package com.github.pedroluis02.accountpassmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.pedroluis02.accountpassmanager.ui.AccountsUi
import com.github.pedroluis02.accountpassmanager.ui.theme.AccountPassManagerTheme
import com.github.pedroluis02.accountpassmanager.viewmodel.AccountsViewModel

class MainActivity : ComponentActivity() {
    private val accountsViewModel: AccountsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountPassManagerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   Scaffold(
                       topBar = { AppBar() }
                   ) {
                       AccountsUi(
                           modifier = Modifier.padding(20.dp),
                           viewModel = accountsViewModel
                       )
                   }
                }
            }
        }
    }
}

@Composable
fun AppBar() {
    TopAppBar(
        title = {
            Text(stringResource(id = R.string.app_name))
        }
    )
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AccountPassManagerTheme {
        Greeting("Android")
    }
}