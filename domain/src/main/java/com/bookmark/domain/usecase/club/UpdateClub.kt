package com.bookmark.domain.usecase.club

import com.bookmark.domain.repository.BookRepository
import javax.inject.Inject

class UpdateClub @Inject constructor(private val repository : BookRepository) {
    fun invoke() {}
}