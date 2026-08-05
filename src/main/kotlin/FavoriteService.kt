package org.example

class FavoriteService {
    private val favorites = mutableListOf<FavoriteItem>()

    fun addFavorite(userId: Long, productId: Long) {
        favorites.add(FavoriteItem(userId, productId))
    }
}