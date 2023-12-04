package cat.insvidreres.inf.mvvmfromzero.loginFragment

class LoginProvider {
    companion object {

        private var logins = mutableListOf<LoginModel>(
            LoginModel(
                user = "isma",
                password = "isma1234"
            ),
            LoginModel(
                user = "pepe",
                password = "pepe1234"
            ),
            LoginModel(
                user = "jose",
                password = "jose1234"
            ),
            LoginModel(
                user = "adria",
                password = "adria1234"
            ),
            LoginModel(
                user = "pau",
                password = "pau1234"
            ),
            LoginModel(
                user = "aram",
                password = "aram1234"
            ),
            LoginModel(
                user = "dani",
                password = "dani1234"
            ),
            LoginModel(
                user = "alex",
                password = "alex1234"
            )
        )

        fun checkIfLoginCorrect(user: String, password: String): String? {
            for (login in logins) {
                if (login.user == user && login.password == password) {
                    return login.user
                }
            }
            return null
        }
    }
}