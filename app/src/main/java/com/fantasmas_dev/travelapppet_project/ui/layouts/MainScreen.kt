package com.fantasmas_dev.travelapppet_project.ui.layouts

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    LazyColumn {
        item { Text(text = "Aspen") }
        item {
            SearchBar(
                query = "",
                onQueryChange = {},
                onSearch = {},
                active = true,
                onActiveChange = {}) {

            }
        }
        item {
            LazyRow {

            }
        }
        item { Text(text = "") }
        item {
            LazyRow {
                item {
                    Card {

                    }
                }
            }
        }
        item { Text(text = "") }
        item {
            LazyRow {
                item {
                    Card {

                    }
                }
            }
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}