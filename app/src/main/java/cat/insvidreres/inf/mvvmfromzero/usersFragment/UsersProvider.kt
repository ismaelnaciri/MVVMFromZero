package cat.insvidreres.inf.mvvmfromzero.usersFragment

import cat.insvidreres.inf.mvvmfromzero.loginFragment.LoginModel

class UsersProvider {
    companion object {
        fun random(): UsersModel {
            val position = (0..users.size).random()
            return users[position]
        }

        fun getLoginUser(userName: String): UsersModel? {
            for (user in users) {
                if (user.user == userName)
                    return user
            }
            return null
        }

        private var users = mutableListOf<UsersModel>(
            UsersModel(
                user = "isma",
                age = 21,
                email = "isma@gmail.com"
            ),
            UsersModel(
                user = "pepe",
                age = 30,
                email = "pepe@gmail.com"
            ),
            UsersModel(
                user = "jose",
                age = 40,
                email = "jose@gmail.com"
            ),
            UsersModel(
                user = "adria",
                age = 40,
                email = "adria@gmail.com"
            ),
            UsersModel(
                user = "pau",
                age = 40,
                email = "pau@gmail.com"
            ),
            UsersModel(
                user = "aram",
                age = 40,
                email = "aram@gmail.com"
            ),
            UsersModel(
                user = "dani",
                age = 40,
                email = "dani@gmail.com"
            ),
            UsersModel(
                user = "alex",
                age = 40,
                email = "alex@gmail.com"
            )
        )
    }
}