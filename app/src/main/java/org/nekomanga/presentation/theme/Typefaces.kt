package org.nekomanga.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.nekomanga.R

object Typefaces {
    private val defaultTypography = Typography()
    val roboto =
        FontFamily(
            Font(R.font.roboto_thin, FontWeight.Thin),
            Font(R.font.roboto_black, FontWeight.Black),
            Font(R.font.roboto_bold, FontWeight.Bold),
            Font(R.font.roboto_extra_bold, FontWeight.ExtraBold),
            Font(R.font.roboto_medium, FontWeight.Medium),
            Font(R.font.roboto_semi_bold, FontWeight.SemiBold),
            Font(R.font.roboto_regular, FontWeight.Normal),
        )

    val appTypography =
        Typography(
            displayLarge = defaultTypography.displayLarge.copy(fontFamily = roboto),
            displayMedium = defaultTypography.displayMedium.copy(fontFamily = roboto),
            displaySmall = defaultTypography.displaySmall.copy(fontFamily = roboto),
            headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = roboto),
            headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = roboto),
            headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = roboto),
            titleLarge = defaultTypography.titleLarge.copy(fontFamily = roboto),
            titleMedium = defaultTypography.titleMedium.copy(fontFamily = roboto),
            titleSmall = defaultTypography.titleSmall.copy(fontFamily = roboto),
            bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = roboto),
            bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = roboto),
            bodySmall = defaultTypography.bodySmall.copy(fontFamily = roboto),
            labelLarge = defaultTypography.labelLarge.copy(fontFamily = roboto),
            labelMedium = defaultTypography.labelMedium.copy(fontFamily = roboto),
            labelSmall = defaultTypography.labelSmall.copy(fontFamily = roboto),
        )

    val LocalTypography = staticCompositionLocalOf { appTypography }
}
