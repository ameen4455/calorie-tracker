package dev.ameen4455.calorietracker.navigation

import androidx.navigation.NavController
import dev.ameen4455.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}