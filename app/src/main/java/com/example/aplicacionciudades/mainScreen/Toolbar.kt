package com.example.aplicacionciudades.mainScreen

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun MakeToolbar(state: ScaffoldState, scope: CoroutineScope) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("León") },
            navigationIcon = {
                IconButton(onClick = {
                    scope.launch { state.drawerState.open() }
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
            }
        )
    }) {

    }
}