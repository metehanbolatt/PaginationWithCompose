package com.metehanbolat.paginationwithcompose.data.mappers

import com.metehanbolat.paginationwithcompose.data.local.BeerEntity
import com.metehanbolat.paginationwithcompose.data.remote.BeerDto
import com.metehanbolat.paginationwithcompose.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}