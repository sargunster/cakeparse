package me.sargunvohra.ktparse.lexer

data class Token(
        val type: ITokenType,
        val raw: String,
        val position: Int
) {
    override fun toString() = "Token(type=${type.name}, raw=\"$raw\", position=$position)"
}