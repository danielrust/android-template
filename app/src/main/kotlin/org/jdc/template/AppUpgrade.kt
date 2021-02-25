package org.jdc.template

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.jdc.template.model.repository.SettingsRepository
import timber.log.Timber
import javax.inject.Inject

class AppUpgrade
@Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    fun upgradeApp() = runBlocking(Dispatchers.IO) {
        val lastInstalledVersionCode = settingsRepository.getLastInstalledVersionCode()
        Timber.i("Checking for app upgrade from [%d]", lastInstalledVersionCode)

        if (lastInstalledVersionCode == 0) {
            Timber.i("Skipping app upgrade on fresh install")
            settingsRepository.setLastInstalledVersionCode(BuildConfig.VERSION_CODE)
            return@runBlocking
        }

//        if (lastInstalledVersionCode < VERSION_CODE_HERE) {
//            migrateXXX()
//        }

        // set the current version
        settingsRepository.setLastInstalledVersionCode(BuildConfig.VERSION_CODE)
    }
}
