package cat.insvidreres.inf.mvvmfromzero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import cat.insvidreres.inf.mvvmfromzero.databinding.ActivityMainBinding


//Basic:    No hi ha relació entre login -> users
//Advanced: Que el fragment de users començi per usuari logged in
// I.E: user = pepe, pw = 111, if correct then users fragment shows first pepe, 43, pepe@gmail.com
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}