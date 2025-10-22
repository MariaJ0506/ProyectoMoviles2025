package Data

import Entity.*

interface IDataManager {

    // Ejercicios
    fun add(exercise: ExerciseEntity)
    fun update(exercise: ExerciseEntity)
    fun removeExercise(id: String)
    fun getAllExercises(): List<ExerciseEntity>
    fun getExerciseById(id: String): ExerciseEntity?

    // Metas
    fun add(goal: GoalEntity)
    fun update(goal: GoalEntity)
    fun removeGoal(id: String)
    fun getAllGoals(): List<GoalEntity>
    fun getGoalById(id: String): GoalEntity?

    // Rutinas
    fun add(routine: RoutineEntity)
    fun update(routine: RoutineEntity)
    fun removeRoutine(id: String)
    fun getAllRoutines(): List<RoutineEntity>
    fun getRoutineById(id: String): RoutineEntity?

    // Progresos
    fun add(progress: ProgressLogEntity)
    fun update(progress: ProgressLogEntity)
    fun removeProgress(id: String)
    fun getAllProgress(): List<ProgressLogEntity>
    fun getProgressById(id: String): ProgressLogEntity?

}
