package dev.ameen4455.calorietracker

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.ameen4455.calorietracker.navigation.navigate
import dev.ameen4455.calorietracker.ui.theme.CaloryTrackerTheme
import dagger.hilt.android.AndroidEntryPoint
import dev.ameen4455.core.navigation.Route
import dev.ameen4455.onboarding_presentation.activity.ActivityScreen
import dev.ameen4455.onboarding_presentation.age.AgeScreen
import dev.ameen4455.onboarding_presentation.gender.GenderScreen
import dev.ameen4455.onboarding_presentation.goal.GoalScreen
import dev.ameen4455.onboarding_presentation.height.HeightScreen
import dev.ameen4455.onboarding_presentation.nutrient_goal.NutrientGoalScreen
import dev.ameen4455.onboarding_presentation.weight.WeightScreen
import dev.ameen4455.onboarding_presentation.welcome.WelcomeScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Route.WELCOME
                    ) {
                        composable(Route.WELCOME) {
                            WelcomeScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.AGE) {
                            AgeScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
                        }
                        composable(Route.GENDER) {
                            GenderScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.HEIGHT) {
                            HeightScreen(scaffoldState = scaffoldState, onNavigate = navController::navigate)
                        }
                        composable(Route.WEIGHT) {
                            WeightScreen(scaffoldState = scaffoldState,
                                onNavigate = navController::navigate)
                        }
                        composable(Route.NUTRIENT_GOAL) {
                            NutrientGoalScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
                        }
                        composable(Route.ACTIVITY) {
                            ActivityScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.GOAL) {
                            GoalScreen(onNavigate = navController::navigate)
                        }

                        composable(Route.TRACKER_OVERVIEW) {

                        }
                        composable(Route.SEARCH) {

                        }
                    }
                }
            }
        }
    }
}