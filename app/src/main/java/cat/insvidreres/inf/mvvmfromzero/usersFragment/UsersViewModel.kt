package cat.insvidreres.inf.mvvmfromzero.usersFragment

import androidx.lifecycle.ViewModel

class UsersViewModel : ViewModel() {
    private var _user = ""
    val user: String
        get() = _user

    private var _age = 0
    val age: Int
        get() = _age

    private var _email = ""
    val email : String
        get() = _email


    fun randomUser() {
        val currentUser = UsersProvider.random()
        _user = currentUser.user
        _age = currentUser.age as Int
        _email = currentUser.email
    }

    fun loginUser(userName: String) {
        val loginUser = UsersProvider.getLoginUser(userName)

        if (loginUser != null) {
            _user = loginUser.user
            _age = loginUser.age
            _email = loginUser.email
        }
    }

}