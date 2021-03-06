package di

import com.google.gson.Gson
import dao.Database
import dao.Storage
import org.koin.dsl.module.module

object DependencyProvider {
    val mainModule = module {
        single { Gson() }
        single { Database() as Storage }
    }
}