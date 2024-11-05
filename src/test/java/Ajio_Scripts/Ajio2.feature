Feature: PLP-Sort

Scenario: Sorting the products in PLP

Given user open AJioUrl1
When user clicks on Beauty category
And filters by Eyes category
And sort by Dicount 
Then respective products are displayed in PLP