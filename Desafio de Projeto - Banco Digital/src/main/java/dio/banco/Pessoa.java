package dio.banco;
import java.util.Date;

public class Pessoa {
    private String name;
    private String cpf;
    private String email;
    private Date accountCreationDate;

    public Pessoa(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.accountCreationDate = new Date();
    }

    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }

    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public String toString() {
        return  "\nName: " + this.getName() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }
}
