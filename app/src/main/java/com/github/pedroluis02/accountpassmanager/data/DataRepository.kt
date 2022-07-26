package com.github.pedroluis02.accountpassmanager.data

import com.github.pedroluis02.accountpassmanager.model.UserAccount

interface DataRepository {
    suspend fun getAccounts(): List<UserAccount>
}