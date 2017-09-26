package vfconsulting.barbieri.ws_facilitymanagement.model;

public class UserModel {

    private int id_usuario;
    private String usuario;
    private String password;
    private String last_password;
    private char estado_login;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLast_password() {
        return last_password;
    }

    public void setLast_password(String last_password) {
        this.last_password = last_password;
    }

    public char getEstado_login() {
        return estado_login;
    }

    public void setEstado_login(char estado_login) {
        this.estado_login = estado_login;
    }
}
