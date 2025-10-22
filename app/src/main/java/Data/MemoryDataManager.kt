package Data

import Entity.*

object MemoryDataManager : IDataManager {

    private val exercises = mutableListOf<ExerciseEntity>()
    private val goals = mutableListOf<GoalEntity>()
    private val routines = mutableListOf<RoutineEntity>()
    private val progressLogs = mutableListOf<ProgressLogEntity>()

    // Ejercicios
    override fun add(exercise: ExerciseEntity) { exercises.add(exercise) }
    override fun update(exercise: ExerciseEntity) {
        removeExercise(exercise.id); add(exercise)
    }
    override fun removeExercise(id: String) {
        exercises.removeIf { it.id.trim() == id.trim() }
    }
    override fun getAllExercises(): List<ExerciseEntity> = exercises
    override fun getExerciseById(id: String): ExerciseEntity? =
        exercises.find { it.id.trim() == id.trim() }

    // Metas
    override fun add(goal: GoalEntity) { goals.add(goal) }
    override fun update(goal: GoalEntity) {
        removeGoal(goal.id); add(goal)
    }
    override fun removeGoal(id: String) {
        goals.removeIf { it.id.trim() == id.trim() }
    }
    override fun getAllGoals(): List<GoalEntity> = goals
    override fun getGoalById(id: String): GoalEntity? =
        goals.find { it.id.trim() == id.trim() }

    // Rutinas
    override fun add(routine: RoutineEntity) { routines.add(routine) }
    override fun update(routine: RoutineEntity) {
        removeRoutine(routine.id); add(routine)
    }
    override fun removeRoutine(id: String) {
        routines.removeIf { it.id.trim() == id.trim() }
    }
    override fun getAllRoutines(): List<RoutineEntity> = routines
    override fun getRoutineById(id: String): RoutineEntity? =
        routines.find { it.id.trim() == id.trim() }

    // Progresos
    override fun add(progress: ProgressLogEntity) { progressLogs.add(progress) }
    override fun update(progress: ProgressLogEntity) {
        removeProgress(progress.id); add(progress)
    }
    override fun removeProgress(id: String) {
        progressLogs.removeIf { it.id.trim() == id.trim() }
    }
    override fun getAllProgress(): List<ProgressLogEntity> = progressLogs
    override fun getProgressById(id: String): ProgressLogEntity? =
        progressLogs.find { it.id.trim() == id.trim() }
}
