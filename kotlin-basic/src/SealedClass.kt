//interface Error
sealed class Error {}

class FileError(val fileName: String) : Error()

class DatabaseError(val dbmsType: DbmsType) : Error()

class RedisError(val host: String, val port: Int) : Error()

enum class DbmsType {
    MYSQL, MARIA
}

fun getErrorMessage(error: Error) = when (error) {
    is FileError -> "Error is occurred at : ${error.fileName}"
    is DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    is RedisError -> "Error on Redis: ${error.host}:${error.port}"
//    else -> throw IllegalArgumentException("Unknown type")
}
