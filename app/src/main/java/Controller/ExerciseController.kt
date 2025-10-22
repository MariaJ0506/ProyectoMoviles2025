package Controller

import Data.IDataManager
import Entity.ExerciseEntity
import Util.Util

class ExerciseController(private val dm: IDataManager) {

    fun create(name: String, category: String, muscleGroup: String, equipment: String?, notes: String?): ExerciseEntity {
        require(name.isNotBlank()) { "El nombre del ejercicio es obligatorio." }
        val entity = ExerciseEntity(
            id = Util.newId("ex"),
            name = name.trim(),
            category = category.trim(),
            muscleGroup = muscleGroup.trim(),
            equipment = equipment?.trim(),
            notes = notes?.trim()
        )
        dm.add(entity)
        return entity
    }

    fun list() = dm.getAllExercises()
    fun get(id: String) = dm.getExerciseById(id)
    fun update(entity: ExerciseEntity) = dm.update(entity)
    fun delete(id: String) = dm.removeExercise(id)
}
