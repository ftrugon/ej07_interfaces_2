interface Notificable {
    fun enviarnotificacion()
}

class CorreoElectronico:Notificable{
    override fun enviarnotificacion() {
        println("Se ha enviado una notificacion al correo")
    }
}

class MensajeTexto:Notificable{
    override fun enviarnotificacion() {
        println("Se ha enviado un mensaje de texto")
    }
}

class NotificacionPush:Notificable{
    override fun enviarnotificacion() {
        println("Se ha pusheado una notificacion")
    }
}

fun main() {

    val notificaciones  = mutableListOf<Notificable>()
    notificaciones.add(CorreoElectronico())
    notificaciones.add(MensajeTexto())
    notificaciones.add(NotificacionPush())

    notificaciones.forEach { it.enviarnotificacion() }
}