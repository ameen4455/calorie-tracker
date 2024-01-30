package dev.ameen4455.tracker_domain.use_case

import dev.ameen4455.tracker_domain.model.TrackableFood
import dev.ameen4455.tracker_domain.model.TrackedFood
import dev.ameen4455.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class DeleteTrackedFood(private val repository: TrackerRepository) {
    suspend operator fun invoke(
        trackedFood: TrackedFood
    ) {
       return repository.deleteTrackedFood(trackedFood)
    }
}
