package com.example.demo.domain.model.exceptions;

public class ClienteException extends ApplicationException {

    private static final long serialVersionUID = 6529194846617839041L;

    public enum Type {

        CLIENTE_NO_ENVIADO("El objeto cliente no ha sido enviado validar gracias."),

        CAMPOS_IMCOMPLETOS_VALIDAR("Hay Campos imcompletos validar gracias."),

        CAMPOS_PARA_BUSQUEDA_VACIO("Por favor validar el campo de la busqueda."),

        GATEWAY_NO_INSTANCIADO("Gateway no creado o instanciado por favor validar.");

        private String message;

        Type(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public ClienteException build() {
            return new ClienteException(this);
        }

        public ClienteException build(Throwable throwable) {
            return new ClienteException(this, throwable);
        }
    }

    private final Type type;

    private ClienteException(Type type) {
        super(type.getMessage());
        this.type = type;
    }

    private ClienteException(Type type, Throwable throwable) {
        super(type.getMessage(), throwable);
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
