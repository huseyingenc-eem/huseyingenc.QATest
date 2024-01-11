from locust import HttpUser, between, task


class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

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
        self.client.post("/v2/pet/", json=payload, name="1 Pet Create")

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
        self.client.post("/v2/pet/", json=payload, name="1 Pet Create")

    @task
    def getPetInfo(self):
        ## self.petOlustur(6874)
        self.client.get("/v2/pet/687", name="2 Get Pet Info")

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
        self.client.put("/v2/pet", json=body, name="3 Update Pet")

    @task
    def deletePet(self):
        self.petOlustur(6874)
        self.client.delete("/v2/pet/6874", name="4 Delete Pet")
