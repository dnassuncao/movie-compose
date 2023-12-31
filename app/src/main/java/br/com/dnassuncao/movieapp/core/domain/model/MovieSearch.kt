package br.com.dnassuncao.movieapp.core.domain.model

data class MovieSearch(
    val id: Int,
    val title: String,
    val voteAverage: Double = 0.0,
    val imageUrl: String = ""
)
