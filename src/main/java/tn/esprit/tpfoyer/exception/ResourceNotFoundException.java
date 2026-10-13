package tn.esprit.tpfoyer.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String entity, Long id) {
        super(entity + " introuvable avec id : " + id);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}