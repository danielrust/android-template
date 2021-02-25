package org.jdc.template.ux.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import org.jdc.template.model.data.DisplayThemeType
import org.jdc.template.model.repository.SettingsRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(
    private val settingsRepository: SettingsRepository
) : ViewModel() {

    val themeFlow: Flow<DisplayThemeType> get() = settingsRepository.themeFlow
}