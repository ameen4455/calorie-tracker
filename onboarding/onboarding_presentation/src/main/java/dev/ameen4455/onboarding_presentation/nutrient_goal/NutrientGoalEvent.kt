package dev.ameen4455.onboarding_presentation.nutrient_goal

sealed class NutrientGoalEvent {
    data class OnCarbRatioEntered(val ratio: String): NutrientGoalEvent()
    data class OnProteinRatioEntered(val ratio: String): NutrientGoalEvent()
    data class OnFatRatioEntered(val ratio: String): NutrientGoalEvent()
    object OnNextClick: NutrientGoalEvent()
}