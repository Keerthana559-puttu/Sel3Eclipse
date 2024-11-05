Feature: PDP-Carts

Scenario: Add the product to carts

Given when user oppens AjioUrl
When user searches for product
And clicks on product from PLP
And clicks on Add To Bag button from PDP
Then product is successfully added to cart