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

        self.client.get("/v2/user/huseyin.100", name="2 Get User Info")

    @task
    def updateUser(self):
        body = {
            "id": 687100,
            "username": "huseyin.100",
            "firstName": "huseyin2",
            "lastName": "genc2",
            "email": "huseyingenc.eem@outlook.com",
            "password": "123",
            "phone": "05006007080",
            "userStatus": 0
        }
        self.client.put("/v2/user/testtest12", json=body, name="4 Update User")

    @task
    def deleteUser(self):
        self.userOlustur(687687, "huseyin.eem")
        self.client.delete("/v2/user/huseyin.eem", name="5 Delete User")

    @task
    def login(self):
        self.client.get("/v2/user/login?username=huseyin.100&password=123", name="6 Log In")

    @task
    def logout(self):
        self.client.get("/v2/user/logout", name="7 Log Out")