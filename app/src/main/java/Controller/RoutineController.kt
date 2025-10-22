package Controller

import Data.IDataManager
import Entity.RoutineEntity
import Util.Util

class RoutineController(private val dm: IDataManager) {

    fun create(title: String, dayOfWeek: Int): RoutineEntity {

        require(dayOfWeek in 1..7) { "dayOfWeek debe estar entre 1 y 7." }
        val entity = RoutineEntity(
            id = Util.newId("rt"),
            title = title.trim(),
            dayOfWeek = dayOfWeek
        )

        dm.add(entity)
        return entity

    }

    fun addExercise(routineId: String, exerciseId: String): Boolean {
        val r = dm.getRoutineById(routineId) ?: return false
        if (!r.exerciseIds.contains(exerciseId)) r.exerciseIds.add(exerciseId)
        dm.update(r)
        return true

    }

    fun list() = dm.getAllRoutines()
    fun get(id: String) = dm.getRoutineById(id)
    fun update(entity: RoutineEntity) = dm.update(entity)
    fun delete(id: String) = dm.removeRoutine(id)

}
