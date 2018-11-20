package com.dalasmobile.bottomnavigationteste

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar
import com.dalasmobile.bottomnavigationteste.Fragments.IndicadoFragment
import com.dalasmobile.bottomnavigationteste.Fragments.ManutencaoFragment
import com.dalasmobile.bottomnavigationteste.Fragments.PerfilFragment

class MainActivity : AppCompatActivity() {

    //instancia a toolbar
    lateinit var toolbar: ActionBar

    //abaixo temos o evento no navigation, ao clicar em um item será aberto sua respectiva fragment
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_indicado -> {
                toolbar.title = "Indicado"
                val indicadoFragment = IndicadoFragment.newInstance()
                openFragment(indicadoFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_manutencao -> {
                toolbar.title = "Manutencão"
                val manutencaoFragment = ManutencaoFragment.newInstance()
                openFragment(manutencaoFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_perfil -> {
                toolbar.title = "Perfil"
                val perfilFragment = PerfilFragment.newInstance()
                openFragment(perfilFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!
        //adiciona o navigation em uma variavel
        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        //abaixo é o codigo para definir em qual fragment o aplicativo deve iniciar.
        toolbar.title = "Indicado"
        val indicadoFragment = IndicadoFragment.newInstance()
        openFragment(indicadoFragment)
    }

}
