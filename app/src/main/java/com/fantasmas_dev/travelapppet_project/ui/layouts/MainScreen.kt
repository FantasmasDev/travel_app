package com.fantasmas_dev.travelapppet_project.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fantasmas_dev.travelapppet_project.ui.layouts.widgets.AppSearchBar
import com.fantasmas_dev.travelapppet_project.ui.theme.MontserratFont

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .padding(top = 44.dp, start = 20.dp, end = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text = "Иследуй",
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black
            )
            Text(
                text = "location, Rus",
            )
        }
        Text(
            text = "Aspen",
            fontFamily = MontserratFont,
            fontWeight = FontWeight.Medium,
            fontSize = 32.sp,
            color = Color.Black
        )

        AppSearchBar(modifier = Modifier.padding(top = 24.dp))
    }



//    LazyColumn {
//
//        item { Text(text = "Aspen") }
//        item {
//            SearchBar(
//                query = "",
//                onQueryChange = {},
//                onSearch = {},
//                active = true,
//                onActiveChange = {}) {
//
//            }
//        }
//        item {
//            LazyRow {
//
//            }
//        }
//        item { Text(text = "") }
//        item {
//            LazyRow {
//                item {
//                    Card {
//
//                    }
//                }
//            }
//        }
//        item { Text(text = "") }
//        item {
//            LazyRow {
//                item {
//                    Card {
//
//                    }
//                }
//            }
//        }
//    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}