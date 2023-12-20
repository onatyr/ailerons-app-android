package fr.onat68.ailerons_app_android.screens.context

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapView(gpsLocation: LatLng){
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(gpsLocation, 10f)
    }
    GoogleMap(
        modifier = Modifier.fillMaxWidth().height(150.dp),
        cameraPositionState = cameraPositionState,
    ) {
        Marker(
            state = MarkerState(position = gpsLocation)
        )
    }
}
