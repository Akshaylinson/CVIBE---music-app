package com.maxrave.simpmusic.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import com.maxrave.simpmusic.ui.theme.blackHanSansFontFamily
import com.maxrave.simpmusic.ui.theme.josefinSansFontFamily

/**
 * CVIBE logo rendered as styled text.
 * "C" uses Josefin Sans Regular (thin/light — Century Gothic substitute).
 * "vibe" uses Black Han Sans (ultra-heavy — Peace Sans substitute).
 *
 * The weight contrast between the thin "C" and the black "vibe" is the
 * defining characteristic of the original logo.
 *
 * @param fontSize base size for "C"; "vibe" renders at 1.05× to optically match cap-height.
 * @param color text color, defaults to onBackground.
 */
@Composable
fun CVibeLogoText(
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 40.sp,
    color: Color = Color.Unspecified,
) {
    val josefin = josefinSansFontFamily()
    val blackHan = blackHanSansFontFamily()
    val resolvedColor = if (color == Color.Unspecified) MaterialTheme.colorScheme.onBackground else color
    val vibeSize = fontSize * 1.05

    val text = buildAnnotatedString {
        withStyle(
            SpanStyle(
                fontFamily = josefin,
                fontWeight = FontWeight.Normal,
                fontSize = fontSize,
                color = resolvedColor,
            )
        ) { append("C") }
        withStyle(
            SpanStyle(
                fontFamily = blackHan,
                fontWeight = FontWeight.Normal,
                fontSize = vibeSize,
                color = resolvedColor,
            )
        ) { append("vibe") }
    }

    Text(
        text = text,
        modifier = modifier,
    )
}
