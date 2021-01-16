package com.example.foodforkjalgas.room

import com.example.foodforkjalgas.model.Model
import com.example.foodforkjalgas.util.EntityMapper
import javax.inject.Inject

class ChacheMapper @Inject constructor():EntityMapper<RoomModel, Model> {
    override fun mapFromEntity(entity: RoomModel): Model {
        return Model(
            cookingInstructions = entity.cookingInstructions,
            dateAdded = entity.dateAdded,
            dateUpdated = entity.dateUpdated,
            description = entity.description,
            featuredImage = entity.featuredImage,
            ingredients = entity.ingredients,
            pk = entity.pk,
            rating = entity.rating,
            publisher = entity.publisher,
            sourceUrl = entity.sourceUrl,
            title = entity.title
        )
    }

    override fun mapToEntity(domainModel: Model): RoomModel {
       return RoomModel(
           cookingInstructions = domainModel.cookingInstructions,
           dateAdded = domainModel.dateAdded,
           dateUpdated = domainModel.dateUpdated,
           description = domainModel.description,
           featuredImage = domainModel.featuredImage,
           ingredients = domainModel.ingredients,
           pk = domainModel.pk,
           publisher = domainModel.publisher,
           title = domainModel.title,
           sourceUrl = domainModel.sourceUrl,
           rating = domainModel.rating
       )
    }

    fun mapFromEntityList(entities:List<RoomModel>):List<Model>{
        return entities.map { mapFromEntity(it) }
    }
}