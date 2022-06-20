package entities.exception;

public class MensagemException extends Exception{

    public MensagemException() {
    }

    public MensagemException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
