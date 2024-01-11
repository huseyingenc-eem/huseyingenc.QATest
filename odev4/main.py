from locust import HttpUser, between, task


class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

    def userOlustur(self, id, username):
        payload = {
            "id": id,
            "username": username,
            "firstName": "huseyin1",
            "lastName": "genc1",
            "email": "huseyingenc.eem@outlook.com",
            "password": "123",
            "phone": "05006001020",
            "userStatus": 0}
        self.client.post("/v2/user", json=payload, name="1 User Create")

    @task
    def userCreate(self):
        payload = {
            "id": 687100,
            "username": 'huseyin.100',
            "firstName": "huseyin1",
            "lastName": "genc1",
            "email": "huseyingenc.eem@outlook.com",
            "password": "123",
            "phone": "05006001020",
            "userStatus": 0}
        self.client.post("/v2/user", json=payload, name="1 User Create")

    @task
    def getUserInfo(self):
        self.userOlustur(687687, "huseyin.eem")
        self.client.get("/v2/user/huseyin.eem", name="2 Get User Info")

    @task
    def login(self):
        self.client.get("/v2/user/login?username=huseyin.100&password=123", name="3 Log In")

    @task
    def logout(self):
        self.client.get("/v2/user/logout",name="4 Log Out")

    @task
    def updateUser(self):
        body = {
            "id": 687100,
            "username": "huseyin.200",
            "firstName": "huseyin2",
            "lastName": "genc2",
            "email": "huseyingenc.eem@outlook.com",
            "password": "123",
            "phone": "05006007080",
            "userStatus": 0
        }
        self.client.put("/v2/user/testtest12", json=body, name="5 Update User")

    @task
    def deleteUser(self):
        self.userOlustur(687687, "huseyin.eem")
        self.client.delete("/v2/user/huseyin.eem", name="6 Delete User")


    @task
    def createWithList(self):
        payload = [
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
        self.client.post("/v2/user/createWithList", json=payload, name="7 Create With List")

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
        self.client.post("/v2/user/createWithArray", json=payload, name="8 Create With Array")

    def petOlustur(self,id):
        payload = {
            "id":id,
            "category": {
                "id": 7341,
                "name": "Kopek"
            },
            "name": "Kopek",
            "photoUrls": [
                "string"
            ],
            "tags": [
                {
                    "id": 1,
                    "name": "Kopek"
                }
            ],
            "status": "available"
        }
        self.client.post("/v2/pet/", json=payload, name="9 Pet Create")

    @task
    def petCreate(self):
        payload = {
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
        self.client.post("/v2/pet/", json=payload, name="9 Pet Create")
    @task
    def getPetInfo(self):
        ## self.petOlustur(6874)
        self.client.get("/v2/pet/687", name="10 Get Pet Info")


    @task
    def updatePet(self):
        body = {
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
        self.client.put("/v2/pet", json=body, name="11 Update Pet")

    @task
    def deletePet(self):
        self.petOlustur(6874)
        self.client.delete("/v2/pet/6874", name="12 Delete Pet")
