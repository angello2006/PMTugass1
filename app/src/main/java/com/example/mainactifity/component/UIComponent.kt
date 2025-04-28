package com.example.mainactifity.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mainactifity.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditTextExample() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id = R.string.sample)) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotOutlinedEditFiledExample() {
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id = R.string.sample)) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)

    )
}
@Composable
fun ButtonWithIcon() {
    Icon(
        painterResource(
            id =
                R.drawable.baseline_add_shopping_cart_24
        ),
        contentDescription = stringResource(
            id = R.string.shop
        ),
        modifier = Modifier.size(20.dp)
    )
    Text(
        text = stringResource(id = R.string.buy),
        Modifier.padding(start = 10.dp)
    )

}
@Composable
fun CornerCutShapeButton() {
    Button(onClick = {}, shape = CutCornerShape(10)) {
        Text(
            text = stringResource(
                id = R.string.cornerButton
            )
        )
    }
}
@Composable
fun RoundCornerCutShapeButton() {
    Button(onClick = {}, shape = RoundedCornerShape(10)) {
        Text(
            text = stringResource(
                id = R.string.rounded
            )
        )
    }
}
@Composable
fun ElevatedButtonExample() {
    Button(
        onClick = {},
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 8.dp,
            pressedElevation = 10.dp,
            disabledElevation = 8.dp
        )
    ) {
        Text(
            text = stringResource(
                id = R.string.eleveted
            )
        )
    }
}
@Composable
fun ImageViewExample() {
    Image(
        painterResource(id = R.drawable.img),
        contentDescription = stringResource(
            id = R.string.image
        ),
        modifier = Modifier.size(200.dp)
    )
}