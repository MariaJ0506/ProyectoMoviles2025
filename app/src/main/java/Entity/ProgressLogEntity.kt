package Entity

data class ProgressLogEntity(

    val id: String,

    val exerciseId: String,

    val date: String,

    val sets: Int? = null,

    val reps: Int? = null,

    val weight: Double? = null,

    val timeMinutes: Double? = null,

    val distanceKm: Double? = null,

    val notes: String? = null

)
