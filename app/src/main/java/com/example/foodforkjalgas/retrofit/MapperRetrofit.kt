package com.example.foodforkjalgas.retrofit

import com.example.foodforkjalgas.model.Model
import com.example.foodforkjalgas.util.EntityMapper
import javax.inject.Inject

class MapperRetrofit @Inject constructor():EntityMapper<RetrofitEntityModel,Model> {
    override fun mapFromEntity(entity: RetrofitEntityModel): Model {
         return Model(
             cookingInstructions = entity.cookingInstructions,
         dateUpdated = entity.dateUpdated,
             dateAdded = entity.dateAdded,
             description = entity.description,
             featuredImage = entity.featuredImage,
             ingredients = entity.ingredients,
             pk = entity.pk,
             publisher = entity.publisher,
             rating = entity.rating,
             sourceUrl = entity.sourceUrl,
             title = entity.title

             )
    }

    override fun mapToEntity(domainModel: Model): RetrofitEntityModel {
  return RetrofitEntityModel(
      cookingInstructions = domainModel.cookingInstructions,
       dateAdded = domainModel.dateAdded,
       dateUpdated = domainModel.dateUpdated,
      description =  domainModel.description,
      featuredImage = domainModel.featuredImage,
      ingredients = domainModel.ingredients,
      pk = domainModel.pk,
      publisher = domainModel.publisher,
      rating = domainModel.rating,
      sourceUrl = domainModel.sourceUrl,
      title = domainModel.title

      )
    }
    fun mapFromEntityList(entities:List<RetrofitEntityModel>):List<Model>{
        return entities.map { mapFromEntity(it) }
    }
}