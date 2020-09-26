package Negocios;

public class clsCorreo {
    String usuarioCorreo;
    String nombreArchivo;
    String contracena;
    String rutaArchivo;
    String destino;
    String Asunto;
    String mensaje;
    
    public clsCorreo() {
    }
    
    public clsCorreo(String usuarioCorreo, String nombreArchivo, String contracena, String rutaArchivo, String destino, String Asunto, String mensaje){
        this.usuarioCorreo = usuarioCorreo;
        this.nombreArchivo = nombreArchivo;
        this.contracena = contracena;
        this.rutaArchivo = rutaArchivo;
        this.destino = destino;
        this.Asunto = Asunto;
        this.mensaje = mensaje;
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getContracena() {
        return contracena;
    }

    public void setContracena(String contracena) {
        this.contracena = contracena;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAdjunto() {
        return Asunto;
    }

    public void setAdjunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }        
}
