package Controller

import Data.IDataManager
import Entity.ProgressLogEntity
import Util.Util

class ProgressController(private val dm: IDataManager) {

    fun log(

        exerciseId: String,
        date: String,
        sets: Int? = null,
        reps: Int? = null,
        weight: Double? = null,
        timeMinutes: Double? = null,
        distanceKm: Double? = null,
        notes: String? = null
    ): ProgressLogEntity {
        require(exerciseId.isNotBlank()) { "exerciseId es obligatorio." }
        val entity = ProgressLogEntity(
            id = Util.newId("pg"),
            exerciseId = exerciseId.trim(),
            date = date,
            sets = sets,
            reps = reps,
            weight = weight,
            timeMinutes = timeMinutes,
            distanceKm = distanceKm,
            notes = notes
        )

        dm.add(entity)
        return entity

    }

    fun list() = dm.getAllProgress()
    fun get(id: String) = dm.getProgressById(id)
    fun update(entity: ProgressLogEntity) = dm.update(entity)
    fun delete(id: String) = dm.removeProgress(id)

}
