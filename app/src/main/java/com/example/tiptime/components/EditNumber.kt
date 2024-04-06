package com.example.tiptime.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.tiptime.EditNumberField
import com.example.tiptime.R

@Composable
fun EditNumber(label: Int, value: String, output:(String)->Unit) {

    var input = remember { mutableStateOf(value) }
    output(
        input.value
    )
    EditNumberField(
        label = label,
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done
        ),
        value = input.value,
        onValueChange = { input.value = it },
        leadingIcon = R.drawable.percent,
        modifier = Modifier
            .padding(bottom = 32.dp)
            .fillMaxWidth()
    )
    
}


