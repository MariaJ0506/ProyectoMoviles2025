package com.example.athletesteps.entity

data class PersonEntity(

    val id: String,

    val name: String,

    val firstLastName: String,

    val secondLastName: String?,

    val phone: String?,

    val email: String?,

    val birthday: String?,

    val province: String?,

    val state: String?,

    val district: String?,

    val address: String?,

    val latitude: Double?,

    val longitude: Double?,

    val photoUri: String?
) {
    val fullName: String get() = listOfNotNull(name, firstLastName, secondLastName).joinToString(" ")
}
