package org.jdc.template.model.database.main.individual


import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(IndividualManagerTest.IndividualManagerTestModule::class))
interface IndividualManagerTestComponent {
    fun inject(target: IndividualManagerTest)
}