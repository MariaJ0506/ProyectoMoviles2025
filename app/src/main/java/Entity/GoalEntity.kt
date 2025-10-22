package Entity

data class GoalEntity(

    val id: String,

    val title: String,

    val targetValue: Double,

    val unit: String,

    val deadline: String?,

    var isCompleted: Boolean = false,

    val notes: String? = null

)
