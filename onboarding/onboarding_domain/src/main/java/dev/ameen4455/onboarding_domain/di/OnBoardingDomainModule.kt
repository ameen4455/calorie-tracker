package dev.ameen4455.onboarding_domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dev.ameen4455.onboarding_domain.use_case.ValidateNutrients
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
class OnBoardingDomainModule {

    @Provides
    @ViewModelScoped
    fun providesValidateNutrientsUseCase(): ValidateNutrients {
        return ValidateNutrients()
    }
}