from locust import HttpUser, between, task


class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

    @task
    def createWithList(self):
        payload = [
                    {
                        "id": 1,
                        "username": "testqa123",
                        "firstName": "test",
                        "lastName": "qa",
                        "email": "test@qa.com",
                        "password": "123",
                        "phone": "213321213",
                        "userStatus": 0
                    },
                    {
                        "id": 2,
                        "username": "testqa123",
                        "firstName": "test",
                        "lastName": "qa",
                        "email": "test@qa.com",
                        "password": "123",
                        "phone": "213321213",
                        "userStatus": 0
                    }
                ]
        self.client.post("/v2/user/createWithList", json=payload)

    @task
    def createWithArray(self):
        payload = [
                    {
                        "id": 1,
                        "username": "cseker",
                        "firstName": "can",
                        "lastName": "seker",
                        "email": "can.sekerr@outlook.com",
                        "password": "123",
                        "phone": "3432432432",
                        "userStatus": 0
                    },
                    {
                        "id": 2,
                        "username": "cseker2",
                        "firstName": "can",
                        "lastName": "seker",
                        "email": "can.sekerr@outlook.com",
                        "password": "123",
                        "phone": "123312231321",
                        "userStatus": 0
                      }
                    ]
        self.client.post("/v2/user/createWithArray", json=payload)
