package com.github.pedroluis02.accountpassmanager.data

object Repository {
    val instance: DataRepository

    init {
        instance = TestRepository()
    }
}