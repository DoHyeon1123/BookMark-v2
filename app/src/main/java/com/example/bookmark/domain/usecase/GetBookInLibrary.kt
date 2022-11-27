package com.example.bookmark.domain.usecase
import com.example.bookmark.domain.model.Book
import com.example.bookmark.domain.repository.BookRepository

class GetBookInLibrary(private val repository : BookRepository) {
    operator fun invoke(id:String):Book{
        return repository.getBookInLibrary(id)
    }
}