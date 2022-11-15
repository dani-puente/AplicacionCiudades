package com.example.aplicacionciudades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplicacionciudades.mainScreen.DrawerBody
import com.example.aplicacionciudades.mainScreen.DrawerHeader
import com.example.aplicacionciudades.mainScreen.MakeToolbar
import com.example.aplicacionciudades.mainScreen.MenuItem
import com.example.aplicacionciudades.ui.theme.AplicacionCiudadesTheme
import kotlin.text.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplicacionCiudadesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    val scaffoldState = rememberScaffoldState()
                    val scope = rememberCoroutineScope()
                    MakeToolbar(scaffoldState, scope)
                    Scaffold(
                        drawerContent = {
                            DrawerHeader()
                            DrawerBody(
                                items = listOf(
                                    MenuItem(
                                        "favs",
                                        "Favoritos",
                                        ImageVector.vectorResource(R.drawable.ic_favorito_lleno)
                                    )
                                )
                            )
                        }
                    ) {

                    }
                }
            }
        }
    }
}


@Preview(

    showBackground = true, showSystemUi = true
)
@Composable
fun DefaultPreview() {
    AplicacionCiudadesTheme {}
}