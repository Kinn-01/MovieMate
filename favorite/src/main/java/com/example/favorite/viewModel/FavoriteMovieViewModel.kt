package com.example.favorite.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.core.domain.usecase.MovieUseCase

class FavoriteMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {
    fun getFavoritePopularMovie() = movieUseCase.getFavoriteMovie().asLiveData()
}