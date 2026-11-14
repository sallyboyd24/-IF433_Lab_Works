package oop_142140_SallyZahara.Week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)