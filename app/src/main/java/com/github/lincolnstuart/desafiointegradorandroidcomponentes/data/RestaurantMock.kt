package com.github.lincolnstuart.desafiointegradorandroidcomponentes.data

import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Dish
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant

class RestaurantMock {

    companion object {
        val restaurants = listOf(
            Restaurant(
                Restaurant.getValidId(),
                "Cantina di Napoli",
                "Sunset Boulevard, 99, L.A",
                "23:00",
                "https://cdn.nohat.cc/thumb/f/720/6368616966520832.jpg",
                listOf(
                    Dish(
                        Dish.getValidId(),
                        "Cheese'N'Mushrooms Sandwich",
                        "Finest imported soft cheese gently melting over toasted bread with sauteed mushrooms and Italian white truffle oil.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2899653/food-4.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Chicken Marinated",
                        "Succulent pieces of boneless chicken marinated in ginger and garlic, spiced with freshly pounded black peppercorns, gram flour and chargrilled with beaten egg yolk.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2893412/food-3.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Chicken Pot Pie",
                        "Roast chicken, baby carrots, spring peas topped with grandma’s flakey pie crust.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Chicken Pot Pie",
                        "Grandma’s flakey pie crust filled with roast chicken, baby carrots, and spring peas.",
                        "https://cdn.dribbble.com/users/736614/screenshots/3173910/food6.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Deviled Eggs",
                        "Baffoni Farm egg, bacon lardon, and crispy shallots.",
                        "https://cdn.dribbble.com/users/736614/screenshots/3213971/fried-egg.png"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Strawberry Sorbet",
                        "Hidden Valley Fruit Farm strawberries, shortbread crumb, and cream.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2885633/food1.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Short Ribs",
                        "Soy-braised Blackbird Farm short ribs, shiitake and snap pea risotto.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2899653/food-4.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Shakshuka",
                        "Farm egg baked in sauce of sweet tomatoes, chiles, and smoky cumin.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2893412/food-3.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Blistered Shishito Peppers",
                        "Bite-sized mild peppers with grilled lemon and flake salt.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Grandma Dot’s Kickin’ Cornbread",
                        "Sweet summer corn, stone-ground cornmeal, and a touch of jalapeno. Cornbread with a kick of personality – just like Grandma Dot.",
                        "https://cdn.dribbble.com/users/736614/screenshots/3173910/food6.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "South Street Chicken Wings",
                        "Smokey peach chipotle barbecue sauce, smothered crispy chicken wings. A summertime favorite for years at the South Street block party!",
                        "https://cdn.dribbble.com/users/736614/screenshots/3213971/fried-egg.png"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Pork Chop",
                        "Served with apple braised cabbage and jus.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2885633/food1.jpg"
                    ),
                )
            ),
            Restaurant(
                Restaurant.getValidId(),
                "Art in Coffee",
                "Baker Street, 11, Candem",
                "21:30",
                "https://image.freepik.com/free-vector/modern-restaurant-interior-with-flat-design_23-2147920153.jpg",
                listOf(
                    Dish(
                        Dish.getValidId(),
                        "Chocolate Cake",
                        "Served with raspberries and whipped cream.",
                        "https://cdn.dribbble.com/users/736614/screenshots/3173910/food6.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "5-Layer Chocolate Cake",
                        "Espresso-soaked chocolate sponge cake, milk chocolate ganache filling, raspberry coulis, and fluffy whipped cream.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2885633/food1.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Strawberry Sorbet",
                        "Hidden Valley Fruit Farm strawberries, shortbread crumb, and cream.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"
                    ),
                )
            ),
            Restaurant(
                Restaurant.getValidId(),
                "Enzo's",
                "Santa Monica Boulevard, 123, L.A",
                "02:15",
                "https://i.pinimg.com/736x/16/68/fd/1668fd0196b1be7cd85025a8a458d860.jpg",
                listOf(
                    Dish(
                        Dish.getValidId(),
                        "Pork Chop",
                        "Served with apple braised cabbage and jus.",
                        "https://cdn.dribbble.com/users/736614/screenshots/3173910/food6.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Blistered Shishito Peppers",
                        "Bite-sized mild peppers with grilled lemon and flake salt.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Chicken Pot Pie",
                        "Roast chicken, baby carrots, spring peas topped with grandma’s flakey pie crust.",
                        "https://cdn.dribbble.com/users/736614/screenshots/3213971/fried-egg.png"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "South Street Chicken Wings",
                        "Smokey peach chipotle barbecue sauce, smothered crispy chicken wings. A summertime favorite for years at the South Street block party!",
                        "https://cdn.dribbble.com/users/736614/screenshots/2899653/food-4.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Cheese'N'Mushrooms Sandwich",
                        "Finest imported soft cheese gently melting over toasted bread with sauteed mushrooms and Italian white truffle oil.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2885633/food1.jpg"
                    ),
                )
            ),
            Restaurant(
                Restaurant.getValidId(),
                "Senzai",
                "Henrietta Street, 40, D7",
                "03:00",
                "https://image.freepik.com/free-vector/elegant-restaurant-with-flat-design_23-2147792209.jpg",
                listOf(
                    Dish(
                        Dish.getValidId(),
                        "Chocolate Cake",
                        "Served with raspberries and whipped cream.",
                        "https://cdn.dribbble.com/users/736614/screenshots/3173910/food6.jpg"
                    ),
                    Dish(
                        Dish.getValidId(),
                        "Wood-Fire-Grilled Pork Chop",
                        "Double-cut, bone-in Berkshire pork chop, sweet & sour braised cabbage, apple cider jus.",
                        "https://cdn.dribbble.com/users/736614/screenshots/2888356/food-2.jpg"
                    ),
                )
            )
        )
    }

}