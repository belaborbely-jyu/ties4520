# Semi-final assignment

The original [Word document](https://jyu-my.sharepoint.com/:w:/g/personal/borbely_jyu_fi/ES3-Ize5-B5JtV4cqSirh1QBXuuhl92NgQqTkHVOveP5gA?e=Q4qVBs) with the answers.

## Task f1

Create an ontology
___

## Task f2

Post the ontology in Turtle on a web page
___

## Task f3

Annotate at least 10 individuals and post them on your web page
___

## Task f4

Create 5 rules in N3 logic
___

Rule 1:

Rule 2:

Rule 3:

Rule 4:

Rule 5:

## Task f5

___

Query 1:

Query 2:

Query 3:

Query 4:

Query 5:

## Task f6

Create HTML file to present information from the previously created RDF file (from Task f3) in a human-readable form. Extend the HTML file with RDFa to represent RDF data within XHTML file. Be sure that result still presents the same information in human-readable form. Post these files in on your web page
____


## Task f7

Create a SPARQL endpoint service as a query endpoint to RDF4J(Sesame)  repository using RDF4J(Sesame) API




# Course projects of TIES4520 at JYU

This repository contains content created during created during course [TIES4520](http://users.jyu.fi/~olkhriye/ties4520/) at University of Jyväskylä, Finland (JYU).

## Semi-final assigment

### Schema.org

"Schema.org is a collaborative, community activity with a mission to create, maintain, and promote schemas for structured data on the Internet. In addition to people from the founding companies (Google, Microsoft, Yahoo and Yandex), there is substantial participation by the larger Web community, through public mailing lists such as public-vocabs@w3.org and through GitHub. See the releases page for more details, and the FAQ for supporting information."

* [About](https://schema.org/docs/about.html)
* [GitHub repository](https://github.com/schemaorg/schemaorg)
* [Recipe](https://schema.org/Recipe)
* [Ingredient](https://schema.org/recipeIngredient)

#### Example

* [A food-blog: Spinach and Artichoke Stuffed Soft Pretzels (Half-Baked Harvest)](https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#recipe)
* [A blog post about Schema.org recipes for the food bloggers](https://bootstrapped.ventures/recipe-schema/)

Code example from the blog:
````json
{
	"@context": "https://schema.org",
	"@graph": [
		{
			"@type": "Article",
			"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#article",
			"isPartOf": {
				"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/"
			},
			"author": {
				"name": "Tieghan",
				"@id": "https://www.halfbakedharvest.com/#/schema/person/9b2904ad2a2c76cbcd62517659d460f7"
			},
			"headline": "Spinach and Artichoke Stuffed Soft Pretzels.",
			"datePublished": "2018-12-27T09:00:33+00:00",
			"dateModified": "2021-05-13T22:50:40+00:00",
			"wordCount": 1256,
			"commentCount": 538,
			"publisher": {
				"@id": "https://www.halfbakedharvest.com/#organization"
			},
			"image": {
				"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#primaryimage"
			},
			"thumbnailUrl": "https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1.jpg",
			"keywords": [
				"appetizer",
				"artichoke",
				"bacon",
				"beer",
				"cheese",
				"Easy",
				"football",
				"fun",
				"game day",
				"parties",
				"pretzels",
				"Spinach"
			],
			"articleSection": [
				"Appetizers",
				"Bread",
				"Game Day",
				"Main Course",
				"Side Dishes/Vegetables",
				"Snacks",
				"Vegetarian"
			],
			"inLanguage": "en-US",
			"potentialAction": [
				{
					"@type": "CommentAction",
					"name": "Comment",
					"target": [
						"https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#respond"
					]
				}
			]
		},
		{
			"@type": "WebPage",
			"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/",
			"url": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/",
			"name": "Spinach and Artichoke Stuffed Soft Pretzels. - Half Baked Harvest",
			"isPartOf": {
				"@id": "https://www.halfbakedharvest.com/#website"
			},
			"primaryImageOfPage": {
				"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#primaryimage"
			},
			"image": {
				"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#primaryimage"
			},
			"thumbnailUrl": "https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1.jpg",
			"datePublished": "2018-12-27T09:00:33+00:00",
			"dateModified": "2021-05-13T22:50:40+00:00",
			"description": "Spinach and Artichoke Stuffed Soft Pretzels: Homemade soft pretzel dough, stuffed with a cheesy spinach and artichoke dip, and shaped into a pretzel. Then baked until the pretzel is golden and all kinds of perfect. These pretzels are such a hit. Try serving them up as a fun appetizer for your next party.",
			"breadcrumb": {
				"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#breadcrumb"
			},
			"inLanguage": "en-US",
			"potentialAction": [
				{
					"@type": "ReadAction",
					"target": [
						"https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/"
					]
				}
			]
		},
		{
			"@type": "ImageObject",
			"inLanguage": "en-US",
			"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#primaryimage",
			"url": "https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1.jpg",
			"contentUrl": "https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1.jpg",
			"width": 1200,
			"height": 1800,
			"caption": "Spinach and Artichoke Stuffed Soft Pretzels | halfbakedharvest.com #softpretzels #appetizer #easyrecipes #pretzels #snacks"
		},
		{
			"@type": "BreadcrumbList",
			"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#breadcrumb",
			"itemListElement": [
				{
					"@type": "ListItem",
					"position": 1,
					"name": "Home",
					"item": "https://www.halfbakedharvest.com/"
				},
				{
					"@type": "ListItem",
					"position": 2,
					"name": "Recipes",
					"item": "https://www.halfbakedharvest.com/category/recipes/"
				},
				{
					"@type": "ListItem",
					"position": 3,
					"name": "Type of Meal",
					"item": "https://www.halfbakedharvest.com/category/recipes/type-of-meal/"
				},
				{
					"@type": "ListItem",
					"position": 4,
					"name": "Appetizers",
					"item": "https://www.halfbakedharvest.com/category/recipes/type-of-meal/appetizers/"
				},
				{
					"@type": "ListItem",
					"position": 5,
					"name": "Spinach and Artichoke Stuffed Soft Pretzels."
				}
			]
		},
		{
			"@type": "WebSite",
			"@id": "https://www.halfbakedharvest.com/#website",
			"url": "https://www.halfbakedharvest.com/",
			"name": "Half Baked Harvest",
			"description": "Made with Love",
			"publisher": {
				"@id": "https://www.halfbakedharvest.com/#organization"
			},
			"potentialAction": [
				{
					"@type": "SearchAction",
					"target": {
						"@type": "EntryPoint",
						"urlTemplate": "https://www.halfbakedharvest.com/?s={search_term_string}"
					},
					"query-input": "required name=search_term_string"
				}
			],
			"inLanguage": "en-US"
		},
		{
			"@type": "Organization",
			"@id": "https://www.halfbakedharvest.com/#organization",
			"name": "Half Baked Harvest",
			"url": "https://www.halfbakedharvest.com/",
			"logo": {
				"@type": "ImageObject",
				"inLanguage": "en-US",
				"@id": "https://www.halfbakedharvest.com/#/schema/logo/image/",
				"url": "https://www.halfbakedharvest.com/wp-content/uploads/2019/05/half-baked-harvest-square-logo.png",
				"contentUrl": "https://www.halfbakedharvest.com/wp-content/uploads/2019/05/half-baked-harvest-square-logo.png",
				"width": 600,
				"height": 600,
				"caption": "Half Baked Harvest"
			},
			"image": {
				"@id": "https://www.halfbakedharvest.com/#/schema/logo/image/"
			},
			"sameAs": [
				"http://instagram.com/halfbakedharvest",
				"https://pinterest.com/hbharvest/",
				"https://www.youtube.com/user/tieghangerard/videos",
				"https://www.facebook.com/hbharvest",
				"https://twitter.com/hbharvest"
			]
		},
		{
			"@type": "Person",
			"@id": "https://www.halfbakedharvest.com/#/schema/person/9b2904ad2a2c76cbcd62517659d460f7",
			"name": "Tieghan",
			"image": {
				"@type": "ImageObject",
				"inLanguage": "en-US",
				"@id": "https://www.halfbakedharvest.com/#/schema/person/image/",
				"url": "https://secure.gravatar.com/avatar/49ee4a23a1d5dffb1944da32800bb254?s=96&d=mm&r=pg",
				"contentUrl": "https://secure.gravatar.com/avatar/49ee4a23a1d5dffb1944da32800bb254?s=96&d=mm&r=pg",
				"caption": "Tieghan"
			},
			"sameAs": [
				"https://www.halfbakedharvest.com/about-me/"
			]
		},
		{
			"@context": "http://schema.org/",
			"@type": "Recipe",
			"name": "Spinach and Artichoke Stuffed Soft Pretzels.",
			"author": {
				"@type": "Person",
				"name": "Tieghan Gerard"
			},
			"description": "Homemade soft pretzel dough, stuffed with a cheesy spinach and artichoke dip, and shaped into a pretzel. Then baked until the pretzel is golden and the dip inside has melted and turned ooey, gooey, and all kinds of perfect. Try serving them up as a fun appetizer for your next party.",
			"datePublished": "2018-12-27T02:00:33+00:00",
			"image": [
				"https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1.jpg",
				"https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1-500x500.jpg",
				"https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1-500x375.jpg",
				"https://www.halfbakedharvest.com/wp-content/uploads/2018/12/Spinach-and-Artichoke-Stuffed-Soft-Pretzels-1-480x270.jpg"
			],
			"recipeYield": [
				"8",
				"8 Giant Pretzels"
			],
			"prepTime": "PT30M",
			"cookTime": "PT25M",
			"totalTime": "PT55M",
			"recipeIngredient": [
				"1/2 cup warm water",
				"2 tablespoons light brown sugar",
				"2 1/4 teaspoons active dry yeast",
				"1 cup wheat beer, at room temperature",
				"1 stick (1/2 cup)  salted butter",
				"1 1/2 teaspoons sea salt or kosher salt",
				"4 1/2 cups all-purpose flour",
				"2/3 cups baking soda ((for boiling the pretzels))",
				"1  egg, beaten",
				"Coarse sea salt",
				"4 ounces cream cheese",
				"1/2 cup shredded mozzarella cheese",
				"1/2 cup grated parmesan cheese",
				"1 clove garlic, minced or grated",
				"1/2 teaspoon crushed red pepper flakes",
				"1/2 cup frozen chopped spinach, thawed and squeezed dry of excess water",
				"1 (6.7 ounce) jar marinated artichokes, chopped"
			],
			"recipeInstructions": [
				{
					"@type": "HowToStep",
					"text": "1. Combine the water, brown sugar and yeast in the bowl of a stand mixer and mix with the dough hook until combined. Let sit for 5 minutes.2. Add the beer, melted butter, salt, and flour to the mixture and mix on low-speed until combined. Increase the speed to medium and continue kneading until the dough is smooth and begins to pull away from the sides of the bowl, about 3 to 4 minutes. If the dough appears too wet, add additional flour, 1 tablespoon at a time. Remove the dough from the bowl, place on a flat surface and knead into a ball with your hands. Coat a large bowl with oil, add the dough and turn to coat with the oil. Cover with a clean towel or plastic wrap and place in a warm spot until the dough doubles in size. This will take about 1 hour.3. Meanwhile, make the dip.&nbsp;In a medium bowl, combine the cream cheese, mozzarella, parmesan, garlic, and a pinch of crushed red pepper and salt. Stir in the spinach and artichokes. 4. Preheat the oven to 425 degrees F. Bring a large pot of water to a boil.5.&nbsp;Divide the pretzel dough into 8 equal balls and roll each out into a rectangle (about 11x3 inches). Spread about 1 1/2 tablespoons spinach and artichoke dip along the length of each piece. Starting with the opposite side, roll the dough up into a log, enclosing the toppings inside. Pinch the seams together and then very gently roll the dough with your hands to form an even cylinder and fully enclose the filling (see above photos).6.&nbsp;To shape into pretzels, take the right side and cross over to the left. Cross right to left again and flip up. Slowly add the baking soda to the boiling water. Boil the pretzels in the water, 2 at a time for 30 seconds, splashing the tops with the warmed water using a spoon. Remove with a large flat slotted spatula or a spider. Line two baking sheets with parchment paper placing 4 pretzels on each. Brush the tops with the beaten egg wash and season liberally with sea salt. Bake for 15 to 18 minutes or until pretzels are golden brown.7.&nbsp;Remove pretzels from oven and let cool 5 minutes. Serve and enjoy! If needed, the pretzels can be reheated in a 350 degrees F. for 15 minutes.",
					"name": "1. Combine the water, brown sugar and yeast in the bowl of a stand mixer and mix with the dough hook until combined. Let sit for 5 minutes.2. Add the beer, melted butter, salt, and flour to the mixture and mix on low-speed until combined. Increase the speed to medium and continue kneading until the dough is smooth and begins to pull away from the sides of the bowl, about 3 to 4 minutes. If the dough appears too wet, add additional flour, 1 tablespoon at a time. Remove the dough from the bowl, place on a flat surface and knead into a ball with your hands. Coat a large bowl with oil, add the dough and turn to coat with the oil. Cover with a clean towel or plastic wrap and place in a warm spot until the dough doubles in size. This will take about 1 hour.3. Meanwhile, make the dip.&nbsp;In a medium bowl, combine the cream cheese, mozzarella, parmesan, garlic, and a pinch of crushed red pepper and salt. Stir in the spinach and artichokes. 4. Preheat the oven to 425 degrees F. Bring a large pot of water to a boil.5.&nbsp;Divide the pretzel dough into 8 equal balls and roll each out into a rectangle (about 11x3 inches). Spread about 1 1/2 tablespoons spinach and artichoke dip along the length of each piece. Starting with the opposite side, roll the dough up into a log, enclosing the toppings inside. Pinch the seams together and then very gently roll the dough with your hands to form an even cylinder and fully enclose the filling (see above photos).6.&nbsp;To shape into pretzels, take the right side and cross over to the left. Cross right to left again and flip up. Slowly add the baking soda to the boiling water. Boil the pretzels in the water, 2 at a time for 30 seconds, splashing the tops with the warmed water using a spoon. Remove with a large flat slotted spatula or a spider. Line two baking sheets with parchment paper placing 4 pretzels on each. Brush the tops with the beaten egg wash and season liberally with sea salt. Bake for 15 to 18 minutes or until pretzels are golden brown.7.&nbsp;Remove pretzels from oven and let cool 5 minutes. Serve and enjoy! If needed, the pretzels can be reheated in a 350 degrees F. for 15 minutes.",
					"url": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#wprm-recipe-26579-step-0-0"
				}
			],
			"aggregateRating": {
				"@type": "AggregateRating",
				"ratingValue": "4.34",
				"ratingCount": "572"
			},
			"recipeCategory": [
				"Bread"
			],
			"recipeCuisine": [
				"American"
			],
			"keywords": "beer pretzels",
			"nutrition": {
				"@type": "NutritionInformation",
				"calories": "518 kcal",
				"carbohydrateContent": "60 g",
				"proteinContent": "17 g",
				"fatContent": "23 g",
				"saturatedFatContent": "12 g",
				"cholesterolContent": "77 mg",
				"sodiumContent": "1385 mg",
				"fiberContent": "5 g",
				"sugarContent": "4 g",
				"servingSize": "1 serving"
			},
			"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#recipe",
			"isPartOf": {
				"@id": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/#article"
			},
			"mainEntityOfPage": "https://www.halfbakedharvest.com/spinach-and-artichoke-stuffed-soft-pretzels/"
		}
	]
}
````

### GS1 Web Vocabluary

"The GS1 Web Vocabulary collects terms defined in various GS1 standards and data systems and made available for general use following Linked Data principles. It is designed as an extension to schema.org and, where relevant, mappings and relationships arising from that vocabulary are made explicit.

The initial focus of the GS1 Web Vocabulary is consumer-facing properties for clothing, shoes, food beverage/tobacco and properties common to all products.

This includes properties related to EU 1169 as defined in the GDSN and GS1 Source Standards. In addition, the vocabulary includes the definition of parties and of a product offer (a product offered by a party for a price). Properties and their definitions come from existing GS1 standards including GDSN, GS1 Source and GPC. Exceptions to this rule include the definition of Offer which does not exist in any of the above standards."

* [About](https://www.gs1.org/voc/)
* [GitHub repository](https://github.com/gs1/WebVoc)
* [Current vocabluary (v1.7)](https://github.com/gs1/WebVoc/blob/master/v1.7/gs1Voc_v1_7.ttl)

### Ontology

I want to build an ontology which extends / imports / uses these existing vocabluaries of Schema.org and GS1 linking food products to recipes as ingredients.

## Sparql / POJO (de)serializer

If cannot find working mapper / binder from Graph  / Sparql-resultset to POJO, try to create one. 
This would help developing better Java UI's with binding results, datasets to UI, templates. 
This would be like SimpleXml or Gson libraries for JSON and XML, which helps instantiate Domain-objects (Mostly generated from OWL) from Sparql endpoints.

## Useful links

* [A useful tool for generating Java POJOs from OWL / OWL to Java](https://github.com/antonycc/libschemaorg/blob/main/regenerate-lib/build.gradle.kts)
* [A Github repository from Schema.org vocabluary generated Java-POJOs](https://github.com/antonycc/libschemaorg)
