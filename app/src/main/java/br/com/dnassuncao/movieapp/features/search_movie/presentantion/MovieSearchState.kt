package br.com.dnassuncao.movieapp.features.search_movie.presentantion

import androidx.paging.PagingData
import br.com.dnassuncao.movieapp.core.domain.model.MovieSearch
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class MovieSearchState(
    val query: String = "",
    val movies: Flow<PagingData<MovieSearch>> = emptyFlow()
)
