package oop_142140_SallyZahara.Week07

enum class AppState {
    LOADING,
    SUCCESS,
    ERROR
}

sealed class ApiResponse {
    object Loading : ApiResponse()

    data class Success(
        val data: String
    ) : ApiResponse()

    data class Error(
        val message: String
    ) : ApiResponse()
}