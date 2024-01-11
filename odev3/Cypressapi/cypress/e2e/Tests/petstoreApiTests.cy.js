///<reference types="cypress" />

describe('User Api Tests', () => {

    it('POST /v2/user UserCreate2', () => {
        const payload = {
            "id": 687100,
            "username": "huseyin.100",
            "firstName": "huseyin1",
            "lastName": "genc1",
            "email": "huseyingenc.eem@outlook.com",
            "password": "123",
            "phone": "05006001020",
            "userStatus": 0
        }

        cy.request({
            method: 'POST',
            url: 'https://petstore.swagger.io/v2/user',
            body: payload
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('GET /v2/user/ GetUserInfo', () => {
        cy.request('GET', 'https://petstore.swagger.io/v2/user/huseyin.100')
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('GET /v2/user/logout', () => {
        cy.request('GET', 'https://petstore.swagger.io/v2/user/logout')
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('GET /v2/user/login', () => {
        const payload = {
            "username": "huseyin.100",
            "password": "123"
        }

        cy.request({
            method: 'GET',
            url: 'https://petstore.swagger.io/v2/user/login',
            query: payload
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('PUT /v2/user/ UserUpdate', () => {
        const payload = {
            "id": 687687,
            "username": "huseyin.eem00",
            "firstName": "huseyin1",
            "lastName": "genc1",
            "email": "huseyingenc.eem@outlook.com",
            "password": "123",
            "phone": "05006007080",
            "userStatus": 0
        }

        const headersPayload = {
            'Content-Type': 'application/json',
            'accept': 'application/json'
        }

        cy.request({
            method: 'PUT',
            url: 'https://petstore.swagger.io/v2/user/huseyin.eem',
            headers: headersPayload,
            body: payload
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('DELETE /v2/user/huseyin.100 UserDelete', () => {
        cy.request({
            method: 'DELETE',
            url: 'https://petstore.swagger.io/v2/user/huseyin.100'
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('POST /v2/user/createWithList', () => {
        const payload = [
            {
                "id": 687100,
                "username": "huseyin.100",
                "firstName": "huseyin1",
                "lastName": "genc1",
                "email": "huseyingenc.eem@outlook.com",
                "password": "123",
                "phone": "05006001020",
                "userStatus": 0
            },
            {
                "id": 687200,
                "username": "huseyin.200",
                "firstName": "huseyin2",
                "lastName": "genc2",
                "email": "huseyingenc.eem@outlook.com",
                "password": "123",
                "phone": "05006003040",
                "userStatus": 0
            }
        ]

        const headersPayload = {
            'Content-Type': 'application/json',
            'accept': 'application/json'
        }

        cy.request({
            method: 'POST',
            url: 'https://petstore.swagger.io/v2/user/createWithList',
            headers: headersPayload,
            body: payload
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('POST /v2/user/createWithArray', () => {
        const payload = [
            {
                "id": 687100,
                "username": "huseyin.100",
                "firstName": "huseyin1",
                "lastName": "genc1",
                "email": "huseyingenc.eem@outlook.com",
                "password": "123",
                "phone": "05006001020",
                "userStatus": 0
            }
        ]

        const headersPayload = {
            'Content-Type': 'application/json',
            'accept': 'application/json'
        }

        cy.request({
            method: 'POST',
            url: 'https://petstore.swagger.io/v2/user/createWithArray',
            headers: headersPayload,
            body: payload
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })
    
})

describe('Pet Api Tests', () => {

    it('POST /v2/pet PetCreate', () => {
        const payload = {
            "id": 687,
            "category": {
                "id": 1437,
                "name": "Aslan"
            },
            "name": "Aslan",
            "photoUrls": [
                "string"
            ],
            "tags": [
                {
                    "id": 2,
                    "name": "Aslan"
                }
            ],
            "status": "available"
        }

        cy.request({
            method: 'POST',
            url: 'https://petstore.swagger.io/v2/pet',
            body: payload
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('GET /v2/pet/ PetUserInfo', () => {
        cy.request('GET', 'https://petstore.swagger.io/v2/pet/687')
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('PUT /v2/pet/ PetUpdate', () => {
        const payload = {
            "id": 687,
            "category": {
              "id": 1437,
              "name": "Kopek"
            },
            "name": "Kopek",
            "photoUrls": [
              "string"
            ],
            "tags": [
              {
                "id":2 ,
                "name": "Kopek"
              }
            ],
            "status": "available"
          }

        const headersPayload = {
            'Content-Type': 'application/json',
            'accept': 'application/json'
        }

        cy.request({
            method: 'PUT',
            url: 'https://petstore.swagger.io/v2/pet',
            headers: headersPayload,
            body: payload
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

    it('DELETE /v2/pet/687 PetDelete', () => {
        cy.request({
            method: 'DELETE',
            url: 'https://petstore.swagger.io/v2/pet/687'
        })
            .then((response) => {
                expect(response.status).to.eq(200)
            })
    })

})


