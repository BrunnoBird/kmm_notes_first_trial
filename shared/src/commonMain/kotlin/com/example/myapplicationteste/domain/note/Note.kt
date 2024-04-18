package com.example.myapplicationteste.domain.note

import com.example.myapplicationteste.presentation.BabyBlueHex
import com.example.myapplicationteste.presentation.LightGreenHex
import com.example.myapplicationteste.presentation.RedOrangeHex
import com.example.myapplicationteste.presentation.RedPinkHex
import com.example.myapplicationteste.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}
