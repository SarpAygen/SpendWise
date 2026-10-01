package spendwise.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(Long id) {
        super("Transaction with ID " + id + " was not found");
    }
}