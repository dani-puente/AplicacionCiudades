package com.example.aplicacionciudades.mainScreen

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable

@Composable
fun MakeToolbar(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    onNavigationIconClick: () -> Unit,
    icono: Int
) {
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text("León") },
                navigationIcon = {
                    IconButton(onClick = onNavigationIconClick) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = null
                        )
                    }
                }
            )
        },
        drawerContent = { MakeDrawerView(icono = icono) }
    ) {
    }

}