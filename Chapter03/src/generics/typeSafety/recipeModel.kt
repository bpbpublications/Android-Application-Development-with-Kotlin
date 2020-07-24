package generics.typeSafety

data class Recipe(
    val name: String,
    val ingredients: List<String>,
    val cookingInstructions: List<String>
)

val frenchFries = Recipe(
    name = "French fries",
    ingredients = listOf(
        "5 pounds russet potatoes",
        "Vegetable or peanut oil",
        "Sea salt"
    ),
    cookingInstructions = listOf(
        "Slice potatoes into French fries, and place into cold water so they won't turn brown while you prepare the oil.",
        "Heat oil in a large skillet over medium-high heat. While the oil is heating, sift the flour, garlic salt, onion salt, (regular) salt, and paprika into a large bowl. Gradually stir in enough water so that the mixture can be drizzled from a spoon.",
        "Dip potato slices into the batter one at a time, and place in the hot oil so they are not touching at first. The fries must be placed into the skillet one at a time, or they will clump together. Fry until golden brown and crispy. Remove and drain on paper towels."
    )
)


val lassi = Recipe(
    name = "Indian Lassi",
    ingredients = listOf(
        "1 3/4 cups plain yogurt",
        "6 cubes ice, crushed",
        "1 1/2 cups ice water",
        "2 teaspoons white sugar",
        "1 pinch salt"
    ),
    cookingInstructions = listOf(
        "In a blender, blend the yogurt, ice, water, sugar and salt until mixture becomes frothy.",
        "Pour mixture over ice cubes in tall glasses."
    )
)

val pasta = Recipe(
    name = "Tomato and Garlic Pasta",
    ingredients = listOf(
        "1 (8 ounce) package angel hair pasta",
        "2 pounds tomatoes",
        "4 cloves crushed garlic",
        "1 tablespoon olive oil",
        "1 tablespoon chopped fresh basil",
        "1 tablespoon tomato paste",
        "salt to taste",
        "ground black pepper to taste",
        "1/4 cup grated Parmesan cheese"
    ),
    cookingInstructions = listOf(
        "Place tomatoes in a kettle, and cover with cold water. Bring just to the boil. Pour off water, and cover again with cold water. Peel. Cut into small pieces.",
        "Cook the pasta in a large pot of boiling salted water until al dente.",
        "In a large skillet or saute pan, saute the garlic in enough olive oil to cover the bottom of the pan. The garlic should just become opaque, not brown. Stir in the tomato paste. Immediately stir in the tomatoes, and salt and pepper. Reduce heat, and simmer until the pasta is ready; add the basil.",
        "Drain the pasta, but do not rinse in cold water. Toss with a couple of tablespoons of olive oil, and then mix into the sauce. Reduce the heat as low as possible. Keep warm, uncovered, for about 10 minutes when it is ready to serve. Garnish generously with fresh Parmesan cheese.",
        "VARIATIONS: Saute fresh quartered mushrooms with the garlic, or add shoestring zucchini along with the tomato."
    )
)

val veggieChilly = Recipe(
    name = "Vegetarian Chili",
    ingredients = listOf(
        "1 (12 ounce) package frozen burger-style crumbles",
        "2 (15 ounce) cans black beans, rinsed and drained",
        "2 (15 ounce) cans dark red kidney beans",
        "1 (15 ounce) can light red kidney beans",
        "1 (29 ounce) can diced tomatoes",
        "1 (12 fluid ounce) can tomato juice",
        "5 onions, chopped",
        "3 tablespoons chili powder",
        "1 1/2 tablespoons ground cumin",
        "1 tablespoon garlic powder",
        "2 bay leaves",
        "salt and pepper to taste"
    ),
    cookingInstructions = listOf(
        "In a large pot, combine meat substitute, black beans, kidney beans, diced tomatoes, tomato juice, onions, chili powder, cumin, garlic powder, bay leaves, salt and pepper",
        "Bring to a simmer and cover.",
        "Let the chili simmer for at least 1 hour before serving."
    )
)

