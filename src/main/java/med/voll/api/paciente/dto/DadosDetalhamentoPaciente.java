package med.voll.api.paciente.dto;

import med.voll.api.endereco.model.Endereco;
import med.voll.api.paciente.model.Paciente;


public record DadosDetalhamentoPaciente(String nome, String email, String telefone, String cpf, Endereco endereco) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }
}
