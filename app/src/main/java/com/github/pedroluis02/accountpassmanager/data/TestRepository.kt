package com.github.pedroluis02.accountpassmanager.data

import com.github.pedroluis02.accountpassmanager.model.UserAccount

class TestRepository : DataRepository {
    override suspend fun getAccounts(): List<UserAccount> {
        return listOf(
            UserAccount(name = "Google 1", username = "user1.dev@gmail.com", password = "123456"),
            UserAccount(name = "Github 1", username = "user2.dev@gmail.com", password = "123456"),
            UserAccount(name = "Github 2", username = "user2.dev@outlook.com", password = "123456"),
            UserAccount(name = "Twitter 1", username = "user3.dev@gmail.com", password = "123456")
        )
    }
}