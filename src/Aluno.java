import java.time.LocalDate;

// imutavel
// Tem que ser construida com os dados
// toString, hashCode, equals
public record Aluno(String nome, LocalDate dataNascimento) { // construtor
}
