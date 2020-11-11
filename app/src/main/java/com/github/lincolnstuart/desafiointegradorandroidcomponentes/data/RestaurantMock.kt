package com.github.lincolnstuart.desafiointegradorandroidcomponentes.data

import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Dish
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant

class RestaurantMock {

    companion object {
        val restaurants = listOf(
            Restaurant(
                "Cantina di Napoli",
                "Sunset Boulevard, 99, L.A",
                "23:00",
                "https://cdn.nohat.cc/thumb/f/720/6368616966520832.jpg",
                listOf(
                    Dish("Dish 1", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2899653/food-4.jpg"),
                    Dish("Dish 2", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2893412/food-3.jpg"),
                    Dish("Dish 3", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"),
                )
            ),
            Restaurant(
                "Enzo's",
                "Santa Monica Boulevard, 123, L.A",
                "02:15",
                "https://i.pinimg.com/736x/16/68/fd/1668fd0196b1be7cd85025a8a458d860.jpg",
                listOf(
                    Dish("Dish 1", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/3173910/food6.jpg"),
                    Dish("Dish 2", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"),
                    Dish("Dish 3", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/3213971/fried-egg.png"),
                    Dish("Dish 4", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2899653/food-4.jpg"),
                    Dish("Dish 5", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2885633/food1.jpg"),
                )
            ),
            Restaurant(
                "Art in Coffee",
                "Baker Street, 11, Candem",
                "21:30",
                "https://image.freepik.com/free-vector/modern-restaurant-interior-with-flat-design_23-2147920153.jpg",
                listOf(
                    Dish("Dish 1", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2885633/food1.jpg"),
                )
            ),
            Restaurant(
                "Senzai",
                "Henrietta Street, 40, D7",
                "03:00",
                "https://image.freepik.com/free-vector/elegant-restaurant-with-flat-design_23-2147792209.jpg",
                listOf(
                    Dish("Dish 1", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/3173910/food6.jpg"),
                    Dish("Dish 2", "Desc", "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"),
                )
            )
        )
    }

}