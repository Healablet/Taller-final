package proyecto.com.bookstoreapi.exception.custom;

public class DuplicateResourceException extends RuntimeException{
    public DuplicateResourceException(String message) {
        super(message);

    }

}
