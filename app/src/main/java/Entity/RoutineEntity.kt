package Entity

data class RoutineEntity(

    val id: String,

    val title: String,

    val dayOfWeek: Int,

    val exerciseIds: MutableList<String> = mutableListOf()

)
