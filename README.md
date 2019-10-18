# crnk-spring-test

Goal: Explore whether we want to use https://www.crnk.io/ for our REST JSON API.

Run: 
mvn spring-boot:run

Request:
http://localhost:8080/kristin/api/staff_user/1

The response should look like:
```{
	"data": {
		"id": "1",
		"type": "staff_user",
		"attributes": {
			"firstName": "jane",
			"email": "email@test.com"
		},
		"relationships": {
			"organization": {
				"data": {
					"id": "1",
					"type": "organization"
				},
				"links": {
					"self": "http://localhost:8080/api/staff_user/1/relationships/organization",
					"related": "http://localhost:8080/api/staff_user/1/organization"
				}
			}
		},
		"links": {
			"self": "http://localhost:8080/api/staff_user/1"
		}
	},
	"included": [
		{
			"id": "1",
			"type": "organization",
			"attributes": {
				"role": "role",
				"name": "My organization"
			},
			"links": {
				"self": "http://localhost:8080/api/organization/1"
			}
		}
	]
}```

This has been generated just by adding annotations to the model classes we can return models formatted correctly in the JSON API format.

