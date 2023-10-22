package br.com.dnassuncao.movieapp.features.search_movie.data.mapper

import br.com.dnassuncao.movieapp.core.data.remote.model.SearchResult
import br.com.dnassuncao.movieapp.core.data.util.toPostUrl
import br.com.dnassuncao.movieapp.core.domain.model.MovieSearch

fun List<SearchResult>.toMoviesSearch() = map {
    MovieSearch(
        id = it.id,
        title = it.title ?: "",
        voteAverage = it.voteAverage,
        imageUrl = it.posterPath.toPostUrl()
    )
}