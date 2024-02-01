package dev.ameen4455.tracker_presentation.tracker_overview

import dev.ameen4455.tracker_domain.model.TrackedFood

sealed class TrackerOverviewEvent {
    object OnNextDayClick: TrackerOverviewEvent()
    object OnPreviousDayClick: TrackerOverviewEvent()
    data class OnToggleMealClick(val meal: Meal): TrackerOverviewEvent()
    data class OnDeleteTrackedFoodClicked(val trackedFood: TrackedFood): TrackerOverviewEvent()
    data class OnAddFoodClick(var meal: Meal): TrackerOverviewEvent()
}
