external fun require(module:String):dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val app = express()
    val fs = require("fs")

    fun() -> (
        var testytest="abcd";
        return fs.readdirSync(".");
    )

    app.get("/", { req, res ->
        res.type("text/plain")
        res.send("BOOM BABY")
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}