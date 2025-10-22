package Entity

data class ExerciseEntity(

    val id: String,

    val name: String,

    val category: String,

    val muscleGroup: String,

    val equipment: String?,

    val notes: String? = null

)
