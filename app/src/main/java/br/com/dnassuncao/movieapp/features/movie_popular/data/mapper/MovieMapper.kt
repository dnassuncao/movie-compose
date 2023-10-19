package br.com.dnassuncao.movieapp.features.movie_popular.data.mapper

import br.com.dnassuncao.movieapp.core.data.remote.model.MovieResult
import br.com.dnassuncao.movieapp.core.data.util.toPostUrl
import br.com.dnassuncao.movieapp.core.domain.model.Movie

fun List<MovieResult>.toMovies() = map {
    Movie(
        id = it.id,
        title = it.title,
        voteAverage = it.voteAverage,
        imageUrl = it.posterPath?.toPostUrl() ?: ""
    )
}