package cat.insvidreres.inf.mvvmfromzero.loginFragment

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private var _user = ""
    val user: String
        get() = _user

    private var _password = ""
    val password: String
        get() = _password

    fun checkIfLoginCorrect(user: String, password: String): Boolean {
        val result = LoginProvider.checkIfLoginCorrect(user, password)

        if (result != null) {
            LoginResult.user = result
            return true
        } else
            return false
    }
}