package com.osama.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.osama.core.ui.theme.CoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "DroidOs",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoreTheme {

        Greeting("Android")
    }
}
Commit for 2024-08-01
Commit for 2024-08-02
Commit for 2024-08-03
Commit for 2024-08-04
Commit for 2024-08-05
Commit for 2024-08-06
Commit for 2024-08-07
Commit for 2024-08-08
Commit for 2024-08-09
Commit for 2024-08-11
Commit for 2024-08-12
Commit for 2024-08-15
Commit for 2024-08-16
Commit for 2024-08-18
Commit for 2024-08-19
Commit for 2024-08-20
Commit for 2024-08-22
Commit for 2024-08-23
Commit for 2024-08-24
Commit for 2024-08-25
Commit for 2024-08-26
Commit for 2024-08-28
Commit for 2024-08-29
Commit for 2024-08-31
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-06
Commit for 2024-09-07
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-13
Commit for 2024-09-14
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-20
Commit for 2024-09-21
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-27
Commit for 2024-09-28
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-06
Commit for 2024-09-07
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-13
Commit for 2024-09-14
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-20
Commit for 2024-09-21
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-27
Commit for 2024-09-28
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
Commit for 2024-09-17
Commit for 2024-09-18
Commit for 2024-09-19
Commit for 2024-09-22
Commit for 2024-09-23
Commit for 2024-09-24
Commit for 2024-09-25
Commit for 2024-09-26
Commit for 2024-09-29
Commit for 2024-09-30
Commit for 2024-09-01
Commit for 2024-09-02
Commit for 2024-09-03
Commit for 2024-09-04
Commit for 2024-09-05
Commit for 2024-09-08
Commit for 2024-09-09
Commit for 2024-09-10
Commit for 2024-09-11
Commit for 2024-09-12
Commit for 2024-09-15
Commit for 2024-09-16
