package Util

import android.content.Context
import android.content.Intent
import java.util.UUID

class Util {
    companion object {

        fun openActivity(context: Context, objClass: Class<*>) {
            val intent = Intent(context, objClass)
            context.startActivity(intent)

        }

        fun newId(prefix: String): String = "${prefix}_${UUID.randomUUID().toString().take(8)}"

    }
}
