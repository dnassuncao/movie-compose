package br.com.dnassuncao.movieapp.features.movie_popular.domain.source

import br.com.dnassuncao.movieapp.core.data.remote.response.MovieResponse
import br.com.dnassuncao.movieapp.core.pagging.MoviePagingSource

interface MoviePopularRemoteDataSource {

    fun getPopularMoviesPagingSource(): MoviePagingSource
    suspend fun getPopularMovies(page: Int): MovieResponse
}