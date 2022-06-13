package Lista3.domain.modelo;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String rg;
    private String cpf;

    private final LocalDate aniversario;

    public Cliente(String name, String rg, String cpf, LocalDate birthdate) {
        this.nome = name;
        this.rg = rg;
        this.cpf = cpf;
        this.aniversario = birthdate;
    }

    public LocalDate getBirthdate() {
        return aniversario;
    }
}
