package Controller

import Data.IDataManager
import Entity.GoalEntity
import Util.Util

class GoalController(private val dm: IDataManager) {

    fun create(title: String, targetValue: Double, unit: String, deadline: String?, notes: String?): GoalEntity {
        require(targetValue > 0) { "El valor del objetivo debe ser mayor que 0." }

        val entity = GoalEntity(
            id = Util.newId("gl"),
            title = title.trim(),
            targetValue = targetValue,
            unit = unit.trim(),
            deadline = deadline,
            notes = notes
        )

        dm.add(entity)
        return entity

    }

    fun complete(id: String): Boolean {

        val g = dm.getGoalById(id) ?: return false
        if (!g.isCompleted) {
            val updated = g.copy(isCompleted = true)
            dm.update(updated)
        }

        return true

    }

    fun list() = dm.getAllGoals()
    fun get(id: String) = dm.getGoalById(id)
    fun update(entity: GoalEntity) = dm.update(entity)
    fun delete(id: String) = dm.removeGoal(id)

}
