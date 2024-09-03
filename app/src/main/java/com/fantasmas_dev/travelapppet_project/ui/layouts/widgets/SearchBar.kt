package com.fantasmas_dev.travelapppet_project.ui.layouts.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fantasmas_dev.travelapppet_project.R
import com.fantasmas_dev.travelapppet_project.ui.theme.MontserratFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppSearchBar() {
    var searchText by remember {
        mutableStateOf("")
    }

    SearchBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),

        query = searchText,
        onQueryChange = { text ->
            searchText = text
        },
        onSearch = {

        },
        placeholder = {
            Text(
                text = "Запрос",
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Medium,
                fontSize = 13.sp,
                color = Color.DarkGray,
            )},
        leadingIcon = {
            Image(
                painter = painterResource(id = R.drawable.search_img),
                contentDescription = "",
                colorFilter = ColorFilter.tint(Color.DarkGray))

        },
        colors = SearchBarDefaults.colors(
            containerColor = Color.LightGray,
            dividerColor = Color.Transparent,
            inputFieldColors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )

        ),
        active = false,
        onActiveChange = {}
    ) {

    }
}

@Preview
@Composable
fun PreviewAppSearchBar() {
    AppSearchBar()
}